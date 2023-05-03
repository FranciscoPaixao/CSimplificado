/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.sou.dev.csimplificado;

import br.dev.sou.classes.CSimplificadoLexer;
import br.dev.sou.classes.CSimplificadoParser;
import java.io.IOException;
import org.antlr.v4.gui.TreeViewer;
import java.util.Arrays;
import javax.swing.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Francisco
 */
public class TesteANTLR {

    public static void main(String[] args) throws IOException {

        String arquivo = "C:\\Users\\Francisco\\Documents\\GitHub\\testeANTLR\\teste.c";

        CSimplificadoLexer lexer = new CSimplificadoLexer(CharStreams.fromFileName(arquivo));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSimplificadoParser parser = new CSimplificadoParser(tokens);

        ParseTree tree = parser.program();
        
        //System.out.println(tokens.getTokens());

    }
}
