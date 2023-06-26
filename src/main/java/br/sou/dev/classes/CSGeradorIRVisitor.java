/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.classes;

import antlr.CSimplificadoBaseVisitor;
import antlr.CSimplificadoParser;
import java.util.ArrayList;
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
    private ArrayList<String> listaPrintln = new ArrayList<String>();

    public CSGeradorIRVisitor(HashMap<String, HashMap<String, String>> listaVariaveis){
        this.listaVariaveis = listaVariaveis;
    }
    public void definirListaVariaveis(HashMap<String, HashMap<String, String>> listaVariaveis){
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
        String tipoLLVM = getTipoDaVariavelLLVM(ctx.ID().getText());
        String nomeVariavel = ctx.ID().getText();

        this.variavelAtual = nomeVariavel;

        String variavelTemporaria = visit(ctx.complementoAtribuicao());
        for(String op : operacoesAtuais){
            codigoIR += op;
        }
        codigoIR +=  "store " + tipoLLVM + " " + variavelTemporaria + ", " + tipoLLVM + "* %" + nomeVariavel + "\n";
        operacoesAtuais.clear();
        return codigoIR;
    }
     @Override
     public String visitExpressao_aditiva(CSimplificadoParser.Expressao_aditivaContext ctx) {
        if(ctx.getChildCount() == 1){
            return visitChildren(ctx);
        }
        System.out.println("visitExpressao_aditiva");
        String codigoIR = "";

        String valorEsquerdo = visit(ctx.getChild(0));
         System.out.println("valorEsquerdo: " + valorEsquerdo);

        String operador = ctx.getChild(1).getText();
        System.out.println("operador: " + operador);

        String valorDireito = visit(ctx.getChild(2));
        System.out.println("valorDireito: " + valorDireito);


        String variavelTemporaria = "%" + contadorTemporarios++;
        codigoIR = variavelTemporaria + " = " + getOperadorLLVM(operador) + " " + getTipoDaVariavelLLVM(variavelAtual) + " " + valorEsquerdo + ", " + valorDireito + "\n";
        this.operacoesAtuais.add(codigoIR);
        return variavelTemporaria;
    }
    @Override
    public String visitExpressao_multiplicativa(CSimplificadoParser.Expressao_multiplicativaContext ctx) {

        if(ctx.getChildCount() == 1){
            return visitChildren(ctx);
        }

        System.out.println("visitExpressao_multiplicativa");
        String codigoIR = "";

        String valorEsquerdo = visit(ctx.getChild(0));
        System.out.println("valorEsquerdo: " + valorEsquerdo);

        String operador = ctx.getChild(1).getText();
        System.out.println("operador: " + operador);

        String valorDireito = visit(ctx.getChild(2));
        System.out.println("valorDireito: " + valorDireito);


        String variavelTemporaria = "%" + contadorTemporarios++;


        codigoIR = variavelTemporaria + " = " + getOperadorLLVM(operador) + " " + getTipoDaVariavelLLVM(variavelAtual) + " " + valorEsquerdo + ", " + valorDireito + "\n";
        this.operacoesAtuais.add(codigoIR);
        return variavelTemporaria;
    }
    @Override
    public String visitConstante(CSimplificadoParser.ConstanteContext ctx) {
        return ctx.getText();
    }
    @Override
    public String visitFator(CSimplificadoParser.FatorContext ctx) {
        if(ctx.expressao() != null){
            return visit(ctx.expressao());
        }
        return visitChildren(ctx);
    }
    @Override public String visitEscrita(CSimplificadoParser.EscritaContext ctx) {
        //ctx.termoEscrita();
        return visitChildren(ctx);
    }
    @Override
    public String visitTermoEscrita(CSimplificadoParser.TermoEscritaContext ctx) {
        return visitChildren(ctx);
    }
}
