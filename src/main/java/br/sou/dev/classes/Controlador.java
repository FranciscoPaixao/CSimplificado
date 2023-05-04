/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.classes;

import br.dev.sou.classes.CSimplificadoLexer;
import br.dev.sou.classes.CSimplificadoParser;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.imageio.ImageIO;
import javax.xml.transform.TransformerException;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

/**
 *
 * @author Francisco
 */
public class Controlador {

    private CharStream codigoFonte;
    private String caminhoCodigoFonte;
    private String pastaCodigoFonte;
    private String nomeCodigoFonte;
    private CSimplificadoLexer lexer;
    private CommonTokenStream tokens;
    private CSimplificadoParser parser;
    private CSErrorListenerLexico errosLexicos;
    private CSErrorListenerSintatico errosSintaticos;
    private ParseTree tree;

    public Controlador() {
        this.caminhoCodigoFonte = "";
        this.pastaCodigoFonte = "";
        this.nomeCodigoFonte = "";
        this.codigoFonte = null;
        this.lexer = null;
        this.tokens = null;
        this.parser = null;
        this.tree = null;
    }

    public void LerArquivo(String caminhoCodigoFonte) throws IOException {
        this.caminhoCodigoFonte = caminhoCodigoFonte;
        File file = new File(caminhoCodigoFonte);
        this.pastaCodigoFonte = file.getParent();
        this.nomeCodigoFonte = file.getName();
        pastaCodigoFonte = file.getParent();
        codigoFonte = CharStreams.fromFileName(caminhoCodigoFonte);
    }

    public void AtualizarArquivo() throws IOException {
        LerArquivo(caminhoCodigoFonte);
    }

    public void AtualizarArquivo(String texto) {
        this.codigoFonte = CharStreams.fromString(texto);
    }

    public void FazerAnalise() {
        this.lexer = new CSimplificadoLexer(codigoFonte);

        this.tokens = new CommonTokenStream(lexer);

        this.parser = new CSimplificadoParser(tokens);

        this.errosLexicos = new CSErrorListenerLexico();
        this.errosSintaticos = new CSErrorListenerSintatico();

        lexer.removeErrorListeners();
        lexer.addErrorListener(errosLexicos);

        parser.removeErrorListeners();
        parser.addErrorListener(errosSintaticos);

        this.tree = parser.program();
    }

    public String ObterCodigoFonte() {
        return codigoFonte.toString();
    }

    public void AtualizarCodigoFonte(String codigoFonteString) {
        this.codigoFonte = CharStreams.fromString(codigoFonteString);
    }

    public TreeViewer ObterASTViewer() {
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.0);
        return viewer;
    }

    public void GerarImagemPNG() throws IOException, TransformerException {
        TreeViewer viewer = ObterASTViewer();

        //Font font = new Font("Monospaced", Font.PLAIN, 12);
        //viewer.setFont(font);
        int width = viewer.getPreferredSize().width;
        int height = viewer.getPreferredSize().height;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        viewer.paint(g2d);

        File file = new File("arvore-" + this.nomeCodigoFonte + ".png");
        try {
            ImageIO.write(image, "png", file);
        } catch (IOException ex) {

        }
    }

    public void GerarImagemSVG() throws IOException, TransformerException {
        TreeViewer viewer = ObterASTViewer();

        DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
        Document document = domImpl.createDocument(null, "svg", null);
        SVGGraphics2D svgGenerator = new SVGGraphics2D(document);

        viewer.paint(svgGenerator);
        String outputFile = "arvore-" + this.nomeCodigoFonte + ".svg";
        svgGenerator.stream(outputFile, true);

    }

    public List<String> obterErrosSintaticos() {
        return errosSintaticos.getErrosSintaticos();
    }

    public List<String> obterErrosLexicos() {
        return errosLexicos.getErrosLexicos();
    }

    public String obterErrosTexto() {
        String erros = "";
        for (String error : errosSintaticos.getErrosSintaticos()) {
            erros += error + "\n";
        }

        for (String error : errosLexicos.getErrosLexicos()) {
            erros += error + "\n";
        }
        return erros;
    }

    public String ObterCategoriaToken(String nomeToken) {
        if(nomeToken.matches("NUM_INT")){
            return "Número inteiro";
        }
        if (nomeToken.matches("NUM_DEC")) {
            return "Número decimal";
        }

        if (nomeToken.matches("ID")) {
            return "Identificador";
        }

        if (nomeToken.matches("TEXTO")) {
            return "Constante de texto";
        }

        if (Arrays.asList("IF", "ELSE", "WHILE", "RETURN", "CHAR", "FLOAT", "INT", "BOOLEAN", "MAIN", "VOID", "FOR", "SCANF", "PRINTLN").contains(nomeToken)) {
            return "Palavra reservada";
        }

        if (nomeToken.matches("ASSIGN")) {
            return "Operador de Atribuição";
        }

        if (Arrays.asList("ADD", "DIV", "MUL", "DIV", "MOD").contains(nomeToken)) {
            return "Operador aritmético";
        }

        if (Arrays.asList("AND", "OR", "NOT").contains(nomeToken)) {
            return "Operador lógico";
        }

        if (Arrays.asList("EQ", "NE", "LT", "GT", "LE", "GE").contains(nomeToken)) {
            return "Operador de Comparação";
        }

        if (Arrays.asList("LPAREN","RPAREN", "COMMA", "LBRACE", "RBRACE", "SEMICOLON", "LBRACKET", "RBRACKET").contains(nomeToken)) {
            return "Símbolo especial" ;
        }
        if(nomeToken.matches("EOF")){
            return "Fim de arquivo";
        }
        return "Não identificado" + nomeToken;

    }

    public List<DescSimbolo> ObterTabelaDeSimbolos() {
        List<DescSimbolo> listaSimbolos = new ArrayList<>();
        for (Token token : tokens.getTokens()) {
            String nomeToken = lexer.VOCABULARY.getSymbolicName(token.getType());
            String tokenLexema = token.getText();
            listaSimbolos.add(new DescSimbolo(nomeToken, tokenLexema, ObterCategoriaToken(nomeToken)));
        }
        return listaSimbolos;
    }
}
