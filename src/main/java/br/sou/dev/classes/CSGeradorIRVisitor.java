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

    private ArrayList<String> comandosPrintln = new ArrayList<>();
    private ArrayList<String> operacoesAritmeticas = new ArrayList<>();
    private ArrayList<String> operacoesRelacionais = new ArrayList<>();
    private HashMap<String, HashMap<String, String>> listaVariaveis;
    protected boolean temPrintln = false;

    public CSGeradorIRVisitor(HashMap<String, HashMap<String, String>> listaVariaveis){
        this.listaVariaveis = listaVariaveis;
    }
    public void definirListaVariaveis(HashMap<String, HashMap<String, String>> listaVariaveis){
        this.listaVariaveis = listaVariaveis;
    }
    private String getOperadorLLVM(String operador, String tipo){
        if(tipo.equals("int")) {
            switch (operador) {
                case "+":
                    return "add";
                case "-":
                    return "sub";
                case "*":
                    return "mul";
                case "/":
                    return "udiv";
                case ">":
                    return "icmp sgt";
                case "<":
                    return "icmp slt";
                case ">=":
                    return "icmp sge";
                case "<=":
                    return "icmp sle";
                case "==":
                    return "icmp eq";
                case "!=":
                    return "icmp ne";
                default:
                    return "";
            }
        }
        if(tipo.equals("double")) {
            switch (operador) {
                case "+":
                    return "fadd";
                case "-":
                    return "fsub";
                case "*":
                    return "fmul";
                case "/":
                    return "fdiv";
                case ">":
                    return "fcmp ogt";
                case "<":
                    return "fcmp olt";
                case ">=":
                    return "fcmp oge";
                case "<=":
                    return "fcmp ole";
                case "==":
                    return "fcmp oeq";
                case "!=":
                    return "fcmp one";
            }
        }
        System.out.println("Tipo não reconhecido" + operador);
        return operador;
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
                return "double";
        }
        return tipoCS;
    }
    @Override
    public String visitProgram(CSimplificadoParser.ProgramContext ctx) {
        String codigoIR = "";
        codigoIR += visitListaFuncoes(ctx.listaFuncoes()) + visitPrincipal(ctx.principal());
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
        String codigoIR = "";
        codigoIR = "\ndefine i32 @main() {" + visit(ctx.bloco()) + "ret i32 0\n}";
        this.funcaoAtual = "main";
        if(temPrintln){
            codigoIR += "\ndeclare i32 @printf(i8*, ...)\n" +
                    "@formatStringInt = constant [4 x i8] c\"%d\\0A\\00\" \n" +
                    "@formatStringDouble = constant [4 x i8] c\"%f\\0A\\00\"";
        }
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
        String codigoIR = "\n" + visitListaVariaveis(ctx.listaVariaveis()) + visitSecaoComandos(ctx.secaoComandos());
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
        if(ctx.listaVariaveis() != null){
            codigoIR += visit(ctx.listaVariaveis());
        }
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
        String codigoIR = "";

        codigoIR = visit(ctx.comando());
        if (ctx.listaComandos() != null) {
            codigoIR += visit(ctx.listaComandos());
        }

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
        for(String op : this.operacoesAritmeticas){
            codigoIR += op;
        }
        this.operacoesAritmeticas.clear();
        codigoIR += "store " + tipoLLVM + " " + variavelTemporaria + ", " + tipoLLVM + "* %" + nomeVariavel + "\n";
        return codigoIR;
    }
     @Override
     public String visitExpressao_aditiva(CSimplificadoParser.Expressao_aditivaContext ctx) {
        if(ctx.getChildCount() == 1){
            return visitChildren(ctx);
        }
        //System.out.println("visitExpressao_aditiva");
        String codigoIR = "";

        String valorEsquerdo = visit(ctx.getChild(0));
        //System.out.println("valorEsquerdo: " + valorEsquerdo);

        String operador = ctx.getChild(1).getText();
        //System.out.println("operador: " + operador);

        String valorDireito = visit(ctx.getChild(2));
         if(ctx.getChild(2).getChildCount() > 1) {
             valorDireito = "%" + valorDireito;
         }
        //System.out.println("valorDireito: " + valorDireito);

         String variavelTemporaria = "";
         if(valorEsquerdo.chars().anyMatch(Character::isAlphabetic)){
             variavelTemporaria = String.valueOf(++contadorTemporarios);
             codigoIR += "%" + variavelTemporaria + " = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
             valorEsquerdo = variavelTemporaria;
         }
         if(valorDireito.chars().anyMatch(Character::isAlphabetic)){
             variavelTemporaria = String.valueOf(++contadorTemporarios);
             codigoIR += "%" + variavelTemporaria + " = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
             valorDireito = variavelTemporaria;
         }
         variavelTemporaria = String.valueOf(++contadorTemporarios);
        String tipoLLVM = getTipoDaVariavelLLVM(variavelAtual);
        if(tipoLLVM.equals("i32")){
            operador = getOperadorLLVM(operador, "int");
        }
        if(tipoLLVM.equals("double")){
            operador = getOperadorLLVM(operador, "double");
        }

        if(valorEsquerdo.chars().anyMatch(Character::isAlphabetic) && valorDireito.chars().anyMatch(Character::isAlphabetic)) {
            codigoIR += "%" + variavelTemporaria + " = " + operador + " " + tipoLLVM + " %" + valorEsquerdo + ", %" + valorDireito + "\n";
        }else if(valorEsquerdo.chars().anyMatch(Character::isAlphabetic)){
            codigoIR += "%" + variavelTemporaria + " = " + operador + " " + tipoLLVM + " %" + valorEsquerdo + ", " + valorDireito + "\n";
        }else if(valorDireito.chars().anyMatch(Character::isAlphabetic)){
            codigoIR += "%" + variavelTemporaria + " = " + operador + " " + tipoLLVM + " " + valorEsquerdo + ", %" + valorDireito + "\n";
        }
        this.operacoesAritmeticas.add(codigoIR);

        return variavelTemporaria;
    }
    @Override
    public String visitExpressao_multiplicativa(CSimplificadoParser.Expressao_multiplicativaContext ctx) {

        if(ctx.getChildCount() == 1){
            return visitChildren(ctx);
        }

        //System.out.println("visitExpressao_multiplicativa");
        String codigoIR = "";

        String valorEsquerdo = visit(ctx.getChild(0));
        //System.out.println("valorEsquerdo: " + valorEsquerdo);

        String operador = ctx.getChild(1).getText();
        //System.out.println("operador: " + operador);

        String valorDireito = visit(ctx.getChild(2));

        if(ctx.getChild(2).getChildCount() > 1) {
            valorDireito = "%" + valorDireito;
        }

        //System.out.println("valorDireito: " + valorDireito);


        String variavelTemporaria = String.valueOf(++contadorTemporarios);

        String tipoLLVM = getTipoDaVariavelLLVM(variavelAtual);

        if(tipoLLVM.equals("i32")){
            operador = getOperadorLLVM(operador, "int");
        }
        if(tipoLLVM.equals("double")){
            operador = getOperadorLLVM(operador, "double");
        }

        codigoIR = "%" + variavelTemporaria + " = " + operador + " " + tipoLLVM + " " + valorEsquerdo + ", " + valorDireito + "\n";
        this.operacoesAritmeticas.add(codigoIR);

        if(ctx.parent.getChildCount() == 1 ){
            return "%" +variavelTemporaria;
        }

        return variavelTemporaria;
    }
    @Override
    public String visitConstante(CSimplificadoParser.ConstanteContext ctx) {
        //System.out.println("visitConstante");
        return ctx.getText();
    }
    @Override
    public String visitFator(CSimplificadoParser.FatorContext ctx) {
        if(ctx.expressao() != null){
            return visit(ctx.expressao());
        }
        return visitChildren(ctx);
    }
    @Override
    public String visitEscrita(CSimplificadoParser.EscritaContext ctx) {
        if(ctx == null){
            return "";
        }
        if(this.temPrintln == false){
            temPrintln = true;
        }
        return visit(ctx.termoEscrita());
    }
    @Override
    public String visitTermoEscrita(CSimplificadoParser.TermoEscritaContext ctx) {
        if(ctx == null){
            return "";
        }
        String codigoIR = "";
        String tipo = getTipoDaVariavelLLVM(ctx.ID().getText());
        String variavelTemporaria = String.valueOf(contadorTemporarios++);
        String variavel = ctx.ID().getText();
        codigoIR += "%" + variavelTemporaria + " = load " + tipo + ", " + tipo + "* %" + variavel + "\n";
        if(tipo.equals("i32")){
            codigoIR += "call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @formatStringInt, i32 0, i32 0), i32 %" + variavelTemporaria + ")\n";
        }else{
            codigoIR += "call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @formatStringDouble, i32 0, i32 0), double %" + variavelTemporaria + ")\n";
        }
        return codigoIR;
    }
    @Override
    public String visitTermo(CSimplificadoParser.TermoContext ctx) {
        if(ctx.ID() != null){
            return ctx.ID().getText();
        }
        return visitChildren(ctx);
    }
    @Override
    public String visitSelecao(CSimplificadoParser.SelecaoContext ctx) {
        if(ctx == null){
            return "";
        }
        String codigoIR = "";
        String variavelTemporaria = visit(ctx.expressao());
        for(String op: this.operacoesRelacionais){
            codigoIR += op;
        }
        codigoIR += "br i1 %" + variavelTemporaria + ", label %if_true" + variavelTemporaria+ ", label %if_else" + variavelTemporaria + "\n";
        codigoIR += "if_true" + variavelTemporaria + ":";
        codigoIR += visit(ctx.bloco());
        codigoIR += "br label %if_end"+ variavelTemporaria + "\n";
        codigoIR += "if_else" + variavelTemporaria + ":";
        codigoIR += visit(ctx.senao());
        codigoIR += "br label %if_end"+ variavelTemporaria + "\n";
        codigoIR += "if_end" + variavelTemporaria + ":\n";
        this.operacoesRelacionais.clear();
        return codigoIR;
    }
    @Override
    public String visitSenao(CSimplificadoParser.SenaoContext ctx) {
        if(ctx.bloco() != null){
            return visit(ctx.bloco());
        }
        return "\n";
    }
    @Override
    public String visitExpressao_OU(CSimplificadoParser.Expressao_OUContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visitChildren(ctx);
        }
        //System.out.println("visitExpressao_relacional");

        String codigoIR = "";

        String valorEsquerdo = visit(ctx.getChild(0));
        //System.out.println("valorEsquerdo: " + valorEsquerdo);

        String operador = ctx.getChild(1).getText();
        //System.out.println("operador: " + operador);

        String valorDireito = visit(ctx.getChild(2));
        //System.out.println("valorDireito: " + valorDireito);

        String variavelTemporaria = String.valueOf(contadorTemporarios++);
        String tipoComparacao = "double";
        if(getTipoDaVariavelLLVM(valorEsquerdo).equals("i32") && getTipoDaVariavelLLVM(valorDireito).equals("i32")){
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            tipoComparacao = "i32";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("double") && getTipoDaVariavelLLVM(valorDireito).equals("double")) {
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("double") && getTipoDaVariavelLLVM(valorDireito).equals("i32")) {
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_i = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            codigoIR += "%" + valorDireito + "_l = sitofp i32 %" + valorDireito + "_i to double\n";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("i32") && getTipoDaVariavelLLVM(valorDireito).equals("double")){
            codigoIR += "%" + valorEsquerdo + "_i = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            codigoIR += "%" + valorEsquerdo + "_l = sitofp i32 %" + valorEsquerdo + "_i to double \n";
        }

        if(tipoComparacao.equals("i32")) {
            codigoIR += "%" + variavelTemporaria + " = " + getOperadorLLVM(operador,"int") + " " + tipoComparacao + " %" + valorEsquerdo + "_l, %" + valorDireito + "_l\n";
        }else{
            codigoIR += "%" + variavelTemporaria + " = " + getOperadorLLVM(operador,"double") + " " + tipoComparacao + " %" + valorEsquerdo + "_l, %" + valorDireito + "_l\n";
        }
        this.operacoesRelacionais.add(codigoIR);
        return variavelTemporaria;
    }
    @Override
    public String visitExpressao_E(CSimplificadoParser.Expressao_EContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visitChildren(ctx);
        }
        //System.out.println("visitExpressao_relacional");

        String codigoIR = "";

        String valorEsquerdo = visit(ctx.getChild(0));
        //System.out.println("valorEsquerdo: " + valorEsquerdo);

        String operador = ctx.getChild(1).getText();
        //System.out.println("operador: " + operador);

        String valorDireito = visit(ctx.getChild(2));
        //System.out.println("valorDireito: " + valorDireito);

        String variavelTemporaria = String.valueOf(contadorTemporarios++);
        String tipoComparacao = "double";
        if(getTipoDaVariavelLLVM(valorEsquerdo).equals("i32") && getTipoDaVariavelLLVM(valorDireito).equals("i32")){
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            tipoComparacao = "i32";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("double") && getTipoDaVariavelLLVM(valorDireito).equals("double")) {
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("double") && getTipoDaVariavelLLVM(valorDireito).equals("i32")) {
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_i = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            codigoIR += "%" + valorDireito + "_l = sitofp i32 %" + valorDireito + "_i to double\n";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("i32") && getTipoDaVariavelLLVM(valorDireito).equals("double")){
            codigoIR += "%" + valorEsquerdo + "_i = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            codigoIR += "%" + valorEsquerdo + "_l = sitofp i32 %" + valorEsquerdo + "_i to double \n";
        }

        if(tipoComparacao.equals("i32")) {
            codigoIR += "%" + variavelTemporaria + " = " + getOperadorLLVM(operador,"int") + " " + tipoComparacao + " %" + valorEsquerdo + "_l, %" + valorDireito + "_l\n";
        }else{
            codigoIR += "%" + variavelTemporaria + " = " + getOperadorLLVM(operador,"double") + " " + tipoComparacao + " %" + valorEsquerdo + "_l, %" + valorDireito + "_l\n";
        }
        this.operacoesRelacionais.add(codigoIR);
        return variavelTemporaria;
    }
    @Override
    public String visitExpressao_igualdade(CSimplificadoParser.Expressao_igualdadeContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visitChildren(ctx);
        }
        //System.out.println("visitExpressao_relacional");

        String codigoIR = "";

        String valorEsquerdo = visit(ctx.getChild(0));
        //System.out.println("valorEsquerdo: " + valorEsquerdo);

        String operador = ctx.getChild(1).getText();
        //System.out.println("operador: " + operador);

        String valorDireito = visit(ctx.getChild(2));
        //System.out.println("valorDireito: " + valorDireito);

        String variavelTemporaria = String.valueOf(contadorTemporarios++);
        String tipoComparacao = "double";
        if(getTipoDaVariavelLLVM(valorEsquerdo).equals("i32") && getTipoDaVariavelLLVM(valorDireito).equals("i32")){
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            tipoComparacao = "i32";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("double") && getTipoDaVariavelLLVM(valorDireito).equals("double")) {
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("double") && getTipoDaVariavelLLVM(valorDireito).equals("i32")) {
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_i = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            codigoIR += "%" + valorDireito + "_l = sitofp i32 %" + valorDireito + "_i to double\n";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("i32") && getTipoDaVariavelLLVM(valorDireito).equals("double")){
            codigoIR += "%" + valorEsquerdo + "_i = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            codigoIR += "%" + valorEsquerdo + "_l = sitofp i32 %" + valorEsquerdo + "_i to double \n";
        }

        if(tipoComparacao.equals("i32")) {
            codigoIR += "%" + variavelTemporaria + " = " + getOperadorLLVM(operador,"int") + " " + tipoComparacao + " %" + valorEsquerdo + "_l, %" + valorDireito + "_l\n";
        }else{
            codigoIR += "%" + variavelTemporaria + " = " + getOperadorLLVM(operador,"double") + " " + tipoComparacao + " %" + valorEsquerdo + "_l, %" + valorDireito + "_l\n";
        }
        this.operacoesRelacionais.add(codigoIR);
        return variavelTemporaria;
    }
    @Override
    public String visitExpressao_relacional(CSimplificadoParser.Expressao_relacionalContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visitChildren(ctx);
        }
        //System.out.println("visitExpressao_relacional");

        String codigoIR = "";

        String valorEsquerdo = visit(ctx.getChild(0));
        //System.out.println("valorEsquerdo: " + valorEsquerdo);

        String operador = ctx.getChild(1).getText();
        //System.out.println("operador: " + operador);

        String valorDireito = visit(ctx.getChild(2));
        //System.out.println("valorDireito: " + valorDireito);

        String variavelTemporaria = String.valueOf(contadorTemporarios++);
        String tipoComparacao = "double";
        if(getTipoDaVariavelLLVM(valorEsquerdo).equals("i32") && getTipoDaVariavelLLVM(valorDireito).equals("i32")){
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            tipoComparacao = "i32";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("double") && getTipoDaVariavelLLVM(valorDireito).equals("double")) {
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("double") && getTipoDaVariavelLLVM(valorDireito).equals("i32")) {
            codigoIR += "%" + valorEsquerdo + "_l = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_i = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            codigoIR += "%" + valorDireito + "_l = sitofp i32 %" + valorDireito + "_i to double\n";
        }else if(getTipoDaVariavelLLVM(valorEsquerdo).equals("i32") && getTipoDaVariavelLLVM(valorDireito).equals("double")){
            codigoIR += "%" + valorEsquerdo + "_i = load " + getTipoDaVariavelLLVM(valorEsquerdo) + ", " + getTipoDaVariavelLLVM(valorEsquerdo) + "* %" + valorEsquerdo + "\n";
            codigoIR += "%" + valorDireito + "_l = load " + getTipoDaVariavelLLVM(valorDireito) + ", " + getTipoDaVariavelLLVM(valorDireito) + "* %" + valorDireito + "\n";
            codigoIR += "%" + valorEsquerdo + "_l = sitofp i32 %" + valorEsquerdo + "_i to double \n";
        }

    if(tipoComparacao.equals("i32")) {
        codigoIR += "%" + variavelTemporaria + " = " + getOperadorLLVM(operador,"int") + " " + tipoComparacao + " %" + valorEsquerdo + "_l, %" + valorDireito + "_l\n";
    }else{
        codigoIR += "%" + variavelTemporaria + " = " + getOperadorLLVM(operador,"double") + " " + tipoComparacao + " %" + valorEsquerdo + "_l, %" + valorDireito + "_l\n";
    }
        this.operacoesRelacionais.add(codigoIR);
        return variavelTemporaria;
    }

}
