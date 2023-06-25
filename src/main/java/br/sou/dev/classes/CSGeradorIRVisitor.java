/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.classes;

import antlr.CSimplificadoBaseVisitor;
import antlr.CSimplificadoParser;
import org.antlr.v4.runtime.tree.TerminalNode;


import java.util.HashMap;

/**
 *
 * @author Francisco
 */
public class CSGeradorIRVisitor extends CSimplificadoBaseVisitor<String> {
    private HashMap<String, String> tabelaTipos = new HashMap<String, String>(){
        {
            put("int", "i32");
            put("float", "double");
            put("char", "i8");
            //("literal", "i8*");
            //put("logico", "i1");
        }
    };
    @Override
    public String visitProgram(CSimplificadoParser.ProgramContext ctx) {
        String codigoIR = visitListaFuncoes(ctx.listaFuncoes()) + visitPrincipal(ctx.principal());
        return codigoIR;
    }
    @Override
    public String visitListaFuncoes(CSimplificadoParser.ListaFuncoesContext ctx) {
        if(ctx == null){
            return "";
        }
        String codigoIR = "";
        codigoIR = visitDeclaracaoFuncao(ctx.declaracaoFuncao());
        return codigoIR;
    }
    @Override
    public String visitPrincipal(CSimplificadoParser.PrincipalContext ctx) {
        if(ctx == null){
            return "";
        }
        String codigoIR = "\ndefine i32 @main() {" + visit(ctx.bloco()) + "ret i32 0\n}";
        //System.out.println(codigoIR);
        return codigoIR;
    }
    @Override
    public String visitDeclaracaoFuncao(CSimplificadoParser.DeclaracaoFuncaoContext ctx) {
        if(ctx == null){
            return "";
        }
        String nomeFuncao = ctx.ID().getText();
        String tipoRetorno = ctx.tipoRetorno().getText();
        String codigoIR = "\ndefine " + tabelaTipos.get(tipoRetorno) + " @" + nomeFuncao + "(" + visit(ctx.parametros()) + ") {" + visit(ctx.bloco()) + "}";
        return codigoIR;
    }


    @Override
    public String visitParametros(CSimplificadoParser.ParametrosContext ctx) {
        if(ctx.ID() == null){
            return "";
        }
        String tipo = ctx.tipoBase().getText();
        String nome = ctx.ID().getText();
        String codigoIR = tabelaTipos.get(tipo) + " %" + nome + visitChildren(ctx);
        return codigoIR;
    }
    @Override
    public String visitListaParametros(CSimplificadoParser.ListaParametrosContext ctx) {
        if(ctx.listaParametros() == null){
            return "";
        }
        String tipo = ctx.tipoBase().getText();
        String nome = ctx.ID().getText();
        String codigoIR = ", " + tabelaTipos.get(tipo) + " %" + nome + visitChildren(ctx);
        return codigoIR;
    }
    @Override
    public String visitBloco(CSimplificadoParser.BlocoContext ctx) {
        if(ctx.listaVariaveis() == null && ctx.listaComandos() == null){
            return "";
        }
        String codigoIR = "\n" + visit(ctx.listaVariaveis()) + visit(ctx.listaComandos());
        return codigoIR;
    }
    @Override
    public String visitListaVariaveis(CSimplificadoParser.ListaVariaveisContext ctx) {
        if(ctx.listaVariaveis() == null){
            return "";
        }
        String tipo = ctx.getStart().getText();
        String nome = String.valueOf(ctx.ID());


        String codigoIR = tipo + " %" + nome + visitListaID(ctx.listaID()) + "\n";

        return codigoIR;
    }
    @Override
    public String visitListaID(CSimplificadoParser.ListaIDContext ctx) {
        if(ctx.listaID() == null){
            return "";
        }
        String nome = ctx.ID().getText();
        String codigoIR = ", %" + nome + visitListaID(ctx.listaID());
        return codigoIR;
    }
    @Override
    public String visitComandos(CSimplificadoParser.ComandosContext ctx) {
        if(ctx == null){
            return "";
        }
        String codigoIR = "";
        codigoIR = visit(ctx.listaComandos()) + visit(ctx.listaComandos());
        return codigoIR;
    }
    @Override
    public String visitListaComandos(CSimplificadoParser.ListaComandosContext ctx) {
        if(ctx == null){
            return "";
        }
        String codigoIR = "";
        codigoIR = visitChildren(ctx);

        return codigoIR;
    }
    @Override
    public String visitRetorno(CSimplificadoParser.RetornoContext ctx) {
        if(ctx == null){
            return "";
        }
        String codigoIR = "ret " + visitChildren(ctx) + "\n";
        return codigoIR;
    }
    @Override
    public String visitExpressao_relacional(CSimplificadoParser.Expressao_relacionalContext ctx) {
        if(ctx == null){
            return "";
        }
        //LLVMValueRef expr1 = visit(ctx.getChild(0));
        //LLVMValueRef expr2 = visit(ctx.getChild(2));

        //System.out.println(visit(ctx.getChild(2)));




        return "";

    }
    @Override
    public String visitConstante(CSimplificadoParser.ConstanteContext ctx) {
        if(ctx == null){
            return "";
        }
        return ctx.getStart().getText();
    }
}
