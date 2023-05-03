/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.classes;

import br.dev.sou.classes.CSimplificadoLexer;
import br.dev.sou.classes.CSimplificadoParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

    public Controlador() {
        this.caminhoArquivo = null;
        this.codigoFonte = null;
        this.lexer = null;
        this.tokens = null;
        this.parser = null;
    }

    public void LerArquivo(String caminhoArquivo) throws IOException {
        this.caminhoArquivo = caminhoArquivo;
        codigoFonte = CharStreams.fromFileName(caminhoArquivo);
    }

    public void AtualizarArquivo() throws IOException {
        LerArquivo(caminhoArquivo);
    }
    public void FazerAnalise(){
        FazerAnaliseLexica();
        GerarTokens();
        FazerAnaliseSintatica();
    }
    public void FazerAnaliseLexica() {
        this.lexer = new CSimplificadoLexer(codigoFonte);
    }

    public void GerarTokens() {
        this.tokens = new CommonTokenStream(lexer);
    }

    public void FazerAnaliseSintatica() {
        this.parser = new CSimplificadoParser(tokens);
        ParseTree tree = parser.program();
    }

    public String ObterCodigoFonte() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int c = codigoFonte.LA(1); c != CharStream.EOF; c = codigoFonte.LA(1)) {
            stringBuilder.append((char) c);
            codigoFonte.consume();
        }
        return stringBuilder.toString();
    }

    public void AtualizarCodigoFonte(String codigoFonteString) {
        this.codigoFonte = CharStreams.fromString(codigoFonteString);
    }

    public String obterErros() {
        return "teste";
    }
    public String ObterNomeToken(int tokenID){
        for(var t: lexer.getTokenTypeMap().entrySet()){
            if(t.getValue().equals(tokenID)){
                return t.getKey();
            }
        }
        return null;
    }
    public List<DescSimbolo> ObterTabelaDeSimbolos(){
        List<DescSimbolo> listaSimbolos = new ArrayList<>();
        for(Token t: this.tokens.getTokens()){
            if(t.getText().equals("<EOF>")){
                continue;
            }
            listaSimbolos.add(new DescSimbolo(ObterNomeToken(t.getType()), t.getText(), t.getText()));
        }
        return listaSimbolos;
    }
}
