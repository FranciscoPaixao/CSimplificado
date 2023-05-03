/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.classes;

import br.dev.sou.testeantlr.CSimplificadoLexer;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

/**
 *
 * @author Francisco
 */
public class Controlador {
    private CharStream codigoFonte;
    private String caminhoArquivo;
    private CSimplificadoLexer lexer;
    
    public Controlador(){
        this.caminhoArquivo = null;
        this.codigoFonte = null;
        this.lexer = null;
    }
    
    public void LerArquivo(String caminhoArquivo) throws IOException{
        this.caminhoArquivo = caminhoArquivo;
        codigoFonte = CharStreams.fromFileName(caminhoArquivo);
    }
    public void AtualizarArquivo() throws IOException{
        LerArquivo(caminhoArquivo);
    }
    public void FazerAnaliseLexica(){
         this.lexer = new CSimplificadoLexer(codigoFonte);
    }
}
