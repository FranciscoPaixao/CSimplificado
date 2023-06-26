/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.classes;

import antlr.CSimplificadoBaseVisitor;
import antlr.CSimplificadoParser;
import org.antlr.v4.runtime.tree.TerminalNode;


import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;

/**
 *
 * @author Francisco
 */
public class CSGeradorIRVisitor extends CSimplificadoBaseVisitor<String> {

    private int contadorTemporarios = 1;
    private String funcaoAtual = "main";
    private String variavelAtual = "";

    private ArrayList<String> operacoesAtuais = new ArrayList<String>();
    private HashMap<String, HashMap<String, String>> listaVariaveis;
    public CSGeradorIRVisitor(HashMap<String, HashMap<String, String>> listaVariaveis){
        this.listaVariaveis = listaVariaveis;
    }
    private String getOperadorLLVM(String operador){
        switch(operador){
            case "+":
                return "add";
            case "-":
                return "sub";
            case "*":
                return "mul";
            case "/":
                return "udiv";
            default:
                return "";
        }
    }
    private String getTipoDaVariavelLLVM(String nomeVariavel){
        String tipoCS = this.listaVariaveis.get(this.funcaoAtual).get(nomeVariavel);
        return getTipoLLVM(tipoCS);
    }
    private String getTipoLLVM(String tipoCS){
        switch(tipoCS){
            case "int":
                return "i32";
            case "float":
                return "float";
            case "char":
                return "i8";
            case "string":
                return "i8*";
        }
        return tipoCS;
    }
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
        this.funcaoAtual = "main";
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
        String codigoIR = "\ndefine " + getTipoLLVM(tipoRetorno) + " @" + nomeFuncao + "(" + visit(ctx.parametros()) + ") {" + visit(ctx.bloco()) + "}";
        this.funcaoAtual = nomeFuncao;
        return codigoIR;
    }


    @Override
    public String visitParametros(CSimplificadoParser.ParametrosContext ctx) {
        if(ctx.ID() == null){
            return "";
        }
        String tipo = ctx.tipoBase().getText();
        String nome = ctx.ID().getText();
        String codigoIR = getTipoLLVM(tipo) + " %" + nome + visitChildren(ctx);
        return codigoIR;
    }
    @Override
    public String visitListaParametros(CSimplificadoParser.ListaParametrosContext ctx) {
        if(ctx.listaParametros() == null){
            return "";
        }
        String tipo = ctx.tipoBase().getText();
        String nome = ctx.ID().getText();
        String codigoIR = ", " + getTipoLLVM(tipo) + " %" + nome + visitChildren(ctx);
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
        if(ctx.listaID() == null){
            return "";
        }
        String tipo = ctx.tipoBase().getText();
        String nome = ctx.ID().getText();
        String codigoIR = "%" + nome + " = alloca " + getTipoLLVM(tipo) + visit(ctx.listaID()) + "\n";
        return codigoIR;
    }
    @Override
    public String visitListaID(CSimplificadoParser.ListaIDContext ctx) {
        if(ctx.listaID() == null){
            return "";
        }
        String tipo = ctx.parent.getChild(0).getText();
        String nome = ctx.ID().getText();
        String codigoIR = "\n%" + nome + " = alloca " + getTipoLLVM(tipo) + visit(ctx.listaID());
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
    public String visitListaComandos(CSimplificadoParser.ListaComandosContext ctx) {
        if(ctx == null){
            return "";
        }
        String codigoIR = "";
        codigoIR = visitChildren(ctx);

        return codigoIR;
    }
    @Override
    public String visitAtribuicao(CSimplificadoParser.AtribuicaoContext ctx) {
        if(ctx == null){
            return "";
        }
        String codigoIR = "";
        String tipo = getTipoDaVariavelLLVM(ctx.ID().getText());
        String nomeVariavel = ctx.ID().getText();
        this.variavelAtual = nomeVariavel;
        String variavelTemporaria = visit(ctx.complementoAtribuicao());
        for(String op : operacoesAtuais){
            codigoIR += op;
        }
        codigoIR +=  "store " + tipo + " " + variavelTemporaria + ", " + tipo + "* %" + nomeVariavel + "\n";
        this.operacoesAtuais.clear();
        return codigoIR;
    }
     @Override
     public String visitExpressao_aditiva(CSimplificadoParser.Expressao_aditivaContext ctx) {
        if(ctx.getChildCount() == 1){
            return visitChildren(ctx);
        }
        String codigoIR = "";
        String tipo = getTipoDaVariavelLLVM(variavelAtual);

        String valorEsquerdo = visit(ctx.expressao_multiplicativa(0));
        String operador = ctx.getChild(1).getText();
        String valorDireito = visit(ctx.expressao_multiplicativa(2));

        String variavelTemporaria = "%" + contadorTemporarios++;
        codigoIR = variavelTemporaria + " = " + getOperadorLLVM(operador) + " " + tipo + " " + valorEsquerdo + ", " + valorDireito + "\n";
        this.operacoesAtuais.add(codigoIR);
        return variavelTemporaria;
    }
    @Override
    public String visitExpressao_multiplicativa(CSimplificadoParser.Expressao_multiplicativaContext ctx) {
        if(ctx.getChildCount() == 1){
            return visitChildren(ctx);
        }
        String codigoIR = "";
        String tipo = getTipoDaVariavelLLVM(variavelAtual);
        String valorEsquerdo = visit(ctx.getChild(0));
        String operador = ctx.getChild(1).getText();
        String valorDireito = visit(ctx.getChild(2));

        System.out.println("valorEsquerdo: " + valorEsquerdo);
        System.out.println("valorDireito: " + valorDireito);
        System.out.println("operador: " + operador);

        String variavelTemporaria = "%" + contadorTemporarios++;
        codigoIR = variavelTemporaria + " = " + getOperadorLLVM(operador) + " " + tipo + " " + valorEsquerdo + ", " + valorDireito + "\n";
        this.operacoesAtuais.add(codigoIR);
        return variavelTemporaria;
    }
    @Override public String visitConstante(CSimplificadoParser.ConstanteContext ctx) {
        return ctx.getText();
    }
}
