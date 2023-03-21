/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.sou.dev.analisadorlexico;

import java.io.IOException;
import java.io.StringReader;



/**
 *
 * @author Francisco
 */
public class MainAnalisadorLexico {
    public static void main(String[] args) throws IOException {
        String expr = "if 2 + 3+a then // teste\n";
        AnalisadorLexico lexical = new AnalisadorLexico(new StringReader(expr));
        lexical.yylex();
    }
}
