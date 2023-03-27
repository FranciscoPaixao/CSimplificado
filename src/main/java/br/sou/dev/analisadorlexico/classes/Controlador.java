/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.analisadorlexico.classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Controlador {

    private final ArrayList<TipoAnalise> tabelaDeSimbolos;
    private final ArrayList<TipoAnalise> listaErros;
    private AnalisadorLexico lex;
    private String arquivoTXT;

    public Controlador() {
        lex = null;
        tabelaDeSimbolos = new ArrayList<>();
        listaErros = new ArrayList<>();
    }
    public void lerArquivo(String caminhoArquivo) throws FileNotFoundException, IOException{
        this.arquivoTXT  = new String(Files.readAllBytes(Paths.get(caminhoArquivo)));
    }
    public String obterArquivoTXT(){
        return this.arquivoTXT;
    }
    public void fazerAnaliseLexica() throws IOException {
        lex = new AnalisadorLexico(new StringReader(arquivoTXT));
        TipoAnalise analise;
        while ((analise = lex.yylex()) != null) {
            if (analise.status) {
                tabelaDeSimbolos.add(analise);
                //System.out.println("Token: " + analise.token + " Lexema: " + analise.lexema + " Linha:" + analise.linha + " Coluna: " + analise.coluna + ")");
            } else {
                listaErros.add(analise);
                //System.out.println("Erro: O caractere " + analise.descricao + " é invalido, linha " + analise.linha + ", coluna " + analise.coluna);
            }
        }
    }

    public String obterErros() {

        String erros = "";
        for (TipoAnalise tipo : listaErros) {
            erros += "Erro: " + tipo.descricao + ", linha " + tipo.linha + ", coluna " + tipo.coluna + " \n";
        }
        return erros;
    }

    public ArrayList<TipoAnalise> obterTabelaDeSimbolos() {

        return this.tabelaDeSimbolos;
    }
}