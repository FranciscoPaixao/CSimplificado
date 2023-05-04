/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.classes;

import br.dev.sou.classes.CSimplificadoLexer;
import br.dev.sou.classes.CSimplificadoParser;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
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

/**
 *
 * @author Francisco
 */
public class Controlador {

    private CharStream codigoFonte;
    private String caminhoArquivo;
    public CSimplificadoLexer lexer;
    public CommonTokenStream tokens;
    private CSimplificadoParser parser;
    public CSErrorListenerLexico errosLexicos;
    public CSErrorListenerSintatico errosSintaticos;
    public ParseTree tree;

    public Controlador() {
        this.caminhoArquivo = null;
        this.codigoFonte = null;
        this.lexer = null;
        this.tokens = null;
        this.parser = null;
        this.tree = null;
    }

    public void LerArquivo(String caminhoArquivo) throws IOException {
        this.caminhoArquivo = caminhoArquivo;
        codigoFonte = CharStreams.fromFileName(caminhoArquivo);
    }

    public void AtualizarArquivo() throws IOException {
        LerArquivo(caminhoArquivo);
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
        viewer.setScale(1);
        return viewer;
    }

    public void GerarImagemDaArvore() throws IOException, TransformerException {
        TreeViewer viewer = new TreeViewer(null, tree);
        Font font = new Font("Monospaced", Font.PLAIN, 12);
        viewer.setFont(font);
        // Obtém as dimensões do TreeViewer
        int width = viewer.getPreferredSize().width;
        int height = viewer.getPreferredSize().height;

        // Cria um BufferedImage do tamanho necessário
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Cria um Graphics2D a partir do BufferedImage
        Graphics2D g2d = image.createGraphics();

        // Desenha a árvore no Graphics2D
        viewer.paint(g2d);

        // Salva o BufferedImage como um arquivo PNG
        File file = new File("tree.png");
        try {
            ImageIO.write(image, "png", file);
        } catch (IOException ex) {

        }
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
            erros += "Erro sintático: " + error + "\n";
        }

        for (String error : errosLexicos.getErrosLexicos()) {
            erros += "Erro léxico: " + error + "\n";
        }
        return erros;
    }

    public List<DescSimbolo> ObterTabelaDeSimbolos() {
        List<DescSimbolo> listaSimbolos = new ArrayList<>();
        for (Token token : tokens.getTokens()) {
            String nomeToken = lexer.VOCABULARY.getSymbolicName(token.getType());
            listaSimbolos.add(new DescSimbolo(nomeToken, token.getText(), token.getText()));
        }
        return listaSimbolos;
    }
}
