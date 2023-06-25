/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.classes;

import antlr.CSimplificadoBaseVisitor;
import antlr.CSimplificadoParser;
import org.bytedeco.llvm.global.*;
import org.bytedeco.llvm.LLVM.*;

/**
 *
 * @author Francisco
 */
public class CSLLVMBuilderVisitor extends CSimplificadoBaseVisitor<LLVMValueRef> {

    private LLVMBuilderRef builder;
    private LLVMModuleRef module;

    public CSLLVMBuilderVisitor() {
        LLVM.LLVMInitializeCore(LLVM.LLVMGetGlobalPassRegistry());

        this.module = LLVM.LLVMModuleCreateWithName("codigo.c");
        this.builder = LLVM.LLVMCreateBuilder();
    }
    public String ObterIR() {
        return LLVM.LLVMPrintModuleToString(module).getString();
    }
    @Override
public LLVMValueRef visitExpressao_relacional(CSimplificadoParser.Expressao_relacionalContext ctx) {

    LLVMValueRef valorEsquerdo = visit(ctx.expressao_aditiva(0));

    if (ctx.getChildCount() == 1) {
        return valorEsquerdo;
    }

    LLVMValueRef valorDireito = visit(ctx.expressao_aditiva(1));

    String operador = ctx.getChild(1).getText();

    int tipoEsquerdo = LLVM.LLVMGetTypeKind(LLVM.LLVMTypeOf(valorEsquerdo));
    int tipoDireito = LLVM.LLVMGetTypeKind(LLVM.LLVMTypeOf(valorDireito));

    if(tipoEsquerdo == LLVM.LLVMIntegerTypeKind) {
        valorEsquerdo = LLVM.LLVMBuildSIToFP(builder, valorEsquerdo, LLVM.LLVMDoubleType(), "int_to_float");
    }
    if(tipoDireito == LLVM.LLVMIntegerTypeKind) {
        valorDireito = LLVM.LLVMBuildSIToFP(builder, valorDireito, LLVM.LLVMDoubleType(), "int_to_float");
    }

    LLVMValueRef result;
    switch (operador) {
        case "<":
            result = LLVM.LLVMBuildFCmp(builder, LLVM.LLVMRealOLT, valorEsquerdo, valorDireito, "ltResult");
            break;
        case ">":
            result = LLVM.LLVMBuildFCmp(builder, LLVM.LLVMRealOGT, valorEsquerdo, valorDireito, "gtResult");
            break;
        case "<=":
            result = LLVM.LLVMBuildFCmp(builder, LLVM.LLVMRealOLE, valorEsquerdo, valorDireito, "leResult");
            break;
        case ">=":
            result = LLVM.LLVMBuildFCmp(builder, LLVM.LLVMRealOGE, valorEsquerdo, valorDireito, "geResult");
            break;
        default:
            throw new RuntimeException("Operador relacional desconhecido: " + operador);
    }

    return result;
}
 @Override
    public LLVMValueRef visitExpressao_aditiva(CSimplificadoParser.Expressao_aditivaContext ctx) {
        LLVMValueRef valorEsquerdo = visit(ctx.expressao_multiplicativa(0));

        if (ctx.getChildCount() == 1) {
            return valorEsquerdo;
        }

        LLVMValueRef valorDireito = visit(ctx.expressao_multiplicativa(1));

        String operador = ctx.getChild(1).getText();

        int tipoEsquerdo = LLVM.LLVMGetTypeKind(LLVM.LLVMTypeOf(valorEsquerdo));
        int tipoDireito = LLVM.LLVMGetTypeKind(LLVM.LLVMTypeOf(valorDireito));


        Boolean ehInteiro = true;

        if(tipoEsquerdo == LLVM.LLVMIntegerTypeKind && tipoDireito == LLVM.LLVMDoubleTypeKind) {
            valorEsquerdo = LLVM.LLVMBuildSIToFP(builder, valorEsquerdo, LLVM.LLVMDoubleType(), "int_to_float");
            ehInteiro = false;
        }
        if(tipoDireito == LLVM.LLVMIntegerTypeKind && tipoEsquerdo == LLVM.LLVMDoubleTypeKind) {
            valorDireito = LLVM.LLVMBuildSIToFP(builder, valorDireito, LLVM.LLVMDoubleType(), "int_to_float");
            ehInteiro = false;
        }

        LLVMValueRef result;
        if(ehInteiro){
            switch (operador){
                case "+":
                    result = LLVM.LLVMBuildAdd(builder, valorEsquerdo, valorDireito, "addResult");
                    break;
                case "-":
                    result = LLVM.LLVMBuildSub(builder, valorEsquerdo, valorDireito, "subResult");
                    break;
                default:
                    throw new RuntimeException("Operador aditivo desconhecido: " + operador);
            }
        }else {
            switch (operador) {
                case "+":
                    result = LLVM.LLVMBuildFAdd(builder, valorEsquerdo, valorDireito, "addResult");
                    break;
                case "-":
                    result = LLVM.LLVMBuildFSub(builder, valorEsquerdo, valorDireito, "subResult");
                    break;
                default:
                    throw new RuntimeException("Operador aditivo desconhecido: " + operador);
            }
        }
        return result;
    }
}
