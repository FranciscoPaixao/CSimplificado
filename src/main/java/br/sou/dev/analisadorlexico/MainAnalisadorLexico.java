/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.sou.dev.analisadorlexico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Francisco
 */
public class MainAnalisadorLexico {

    public static void main(String[] args) throws IOException {
        LerArquivo("teste.txt");
        System.exit(0);
    }

    public static void LerArquivo(String caminhoArquivo) throws IOException  {
        AnalisadorLexico lex = new AnalisadorLexico(new FileReader(caminhoArquivo));

        ALToken token;

        while ((token = lex.yylex()) != null) {
            System.out.println("<" + token.nome + ", " + token.valor + "> (" + token.linha + " - " + token.coluna + ")");
            break;
        }
    }
}
