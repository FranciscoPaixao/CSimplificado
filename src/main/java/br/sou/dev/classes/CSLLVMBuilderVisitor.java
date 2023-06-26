/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.classes;

import antlr.CSimplificadoBaseVisitor;
import antlr.CSimplificadoParser;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.llvm.global.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.LLVMAbortProcessAction;
import static org.bytedeco.llvm.global.LLVM.LLVMAddFunction;
import static org.bytedeco.llvm.global.LLVM.LLVMAppendBasicBlock;
import static org.bytedeco.llvm.global.LLVM.LLVMBuildRet;
import static org.bytedeco.llvm.global.LLVM.LLVMConstInt;
import static org.bytedeco.llvm.global.LLVM.LLVMCreateBuilder;
import static org.bytedeco.llvm.global.LLVM.LLVMDisposeBuilder;
import static org.bytedeco.llvm.global.LLVM.LLVMDisposeMessage;
import static org.bytedeco.llvm.global.LLVM.LLVMDisposeModule;
import static org.bytedeco.llvm.global.LLVM.LLVMFunctionType;
import static org.bytedeco.llvm.global.LLVM.LLVMInitializeNativeAsmParser;
import static org.bytedeco.llvm.global.LLVM.LLVMInitializeNativeAsmPrinter;
import static org.bytedeco.llvm.global.LLVM.LLVMInitializeNativeTarget;
import static org.bytedeco.llvm.global.LLVM.LLVMInt32Type;
import static org.bytedeco.llvm.global.LLVM.LLVMLinkInMCJIT;
import static org.bytedeco.llvm.global.LLVM.LLVMModuleCreateWithName;
import static org.bytedeco.llvm.global.LLVM.LLVMPositionBuilderAtEnd;
import static org.bytedeco.llvm.global.LLVM.LLVMPrintModuleToString;
import static org.bytedeco.llvm.global.LLVM.LLVMVerifyModule;

/**
 *
 * @author Francisco
 */
public class CSLLVMBuilderVisitor extends CSimplificadoBaseVisitor<LLVMValueRef> {

    private LLVMContextRef context;
    private LLVMModuleRef module;
    private LLVMBuilderRef builder;

    public CSLLVMBuilderVisitor() {
        LLVMLinkInMCJIT();
        LLVMInitializeNativeTarget();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();

        module = LLVMModuleCreateWithName("my_module");
        builder = LLVMCreateBuilder();
    }
    public LLVMModuleRef getModule() {
        return module;
    }

    public LLVMBuilderRef getBuilder() {
        return builder;
    }
    @Override
    public LLVMValueRef visitPrincipal(CSimplificadoParser.PrincipalContext ctx) {
        LLVMTypeRef returnType = LLVMInt32Type();
        LLVMTypeRef funcType = LLVMFunctionType(returnType, new LLVMTypeRef(null), 0, 0);
        LLVMValueRef mainFunc = LLVMAddFunction(module, "main", funcType);

        LLVMBasicBlockRef entry = LLVMAppendBasicBlock(mainFunc, "entry");
        LLVMPositionBuilderAtEnd(builder, entry);

        LLVMValueRef constant = LLVMConstInt(LLVMInt32Type(), 0, 0);
        LLVMBuildRet(builder, constant);

        return mainFunc;
    }
    public void ExibirCodigo(LLVMValueRef valueRef) {

        BytePointer bytePointer = new BytePointer(LLVM.LLVMGetValueName(valueRef));

        String stringValue = bytePointer.getString();

        System.out.println(stringValue);
        System.out.println("Teste");

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
        ExibirCodigo(result);
        return result;
    }
}
