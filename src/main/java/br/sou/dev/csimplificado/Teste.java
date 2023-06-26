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
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import static org.bytedeco.llvm.global.LLVM.LLVMAbortProcessAction;
import static org.bytedeco.llvm.global.LLVM.LLVMDisposeBuilder;
import static org.bytedeco.llvm.global.LLVM.LLVMDisposeMessage;
import static org.bytedeco.llvm.global.LLVM.LLVMDisposeModule;
import static org.bytedeco.llvm.global.LLVM.LLVMPrintModuleToString;
import static org.bytedeco.llvm.global.LLVM.LLVMVerifyModule;

/**
 *
 * @author Francisco
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String codigo = "main() {} ";
        CharStream codigoFonte = CharStreams.fromString(codigo);
        
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
        
        ParseTreeWalker walker = new ParseTreeWalker();
        
        CSErrorListenerSemantico errosSemanticos = new CSErrorListenerSemantico(lexer);
        
        //walker.walk(errosSemanticos, tree);
        for(String erro : errosSemanticos.getErrosSemanticos()){
            System.out.println(erro);
        }

        String GeradorLLVMIR = new CSGeradorIRVisitor().visit(tree);
        System.out.println(GeradorLLVMIR);
        CSGeradorIRListener geradorIR = new CSGeradorIRListener();
        walker.walk(geradorIR, tree);
    }
    
}
