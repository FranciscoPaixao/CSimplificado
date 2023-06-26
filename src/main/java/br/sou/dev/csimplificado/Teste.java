/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.sou.dev.csimplificado;

import antlr.CSimplificadoLexer;
import antlr.CSimplificadoParser;
import br.sou.dev.classes.*;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Francisco
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        CharStream codigoFonte = CharStreams.fromFileName("teste.c");

        CSimplificadoLexer lexer = new CSimplificadoLexer(codigoFonte);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CSimplificadoParser parser = new CSimplificadoParser(tokens);

        CSErrorListenerLexico errosLexicos = new CSErrorListenerLexico();
        CSErrorListenerSintatico errosSintaticos = new CSErrorListenerSintatico();

        lexer.removeErrorListeners();
        lexer.addErrorListener(errosLexicos);

        parser.removeErrorListeners();
        parser.addErrorListener(errosSintaticos);

        ParseTree tree = parser.program();

        CSErrorListenerSemantico errosSemanticos = new CSErrorListenerSemantico(lexer);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(errosSemanticos, tree);

        if(errosSemanticos.getErrosSemanticos().size() == 0) {
            System.out.println("Nenhum erro semântico encontrado!");
            String GeradorLLVMIR = new CSGeradorIRVisitor(errosSemanticos.getListaVariaveis()).visit(tree);
            System.out.println(GeradorLLVMIR);
        }


    }
    
}
