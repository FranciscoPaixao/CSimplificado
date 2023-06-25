package br.sou.dev.classes;


import antlr.CSimplificadoBaseListener;
import antlr.CSimplificadoParser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Francisco
 */
public class CSGeradorIRListener extends CSimplificadoBaseListener {
    @Override
    public void enterDeclaracaoFuncao(CSimplificadoParser.DeclaracaoFuncaoContext ctx) {
        String nomeFuncao = ctx.ID().getText();
        String tipoRetorno = ctx.tipoRetorno().getText();
        String parametros = ctx.parametros().getText();
        String codigoIR = "define " + tipoRetorno + " @" + nomeFuncao + "(" + parametros + ") {\n";

        System.out.println("Função: " + nomeFuncao);
        System.out.println(codigoIR);
    }
}
