// Generated from CSimplificado.g4 by ANTLR 4.13.0

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSimplificadoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSimplificadoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CSimplificadoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#listaFuncoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaFuncoes(CSimplificadoParser.ListaFuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoFuncao(CSimplificadoParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#tipoRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoRetorno(CSimplificadoParser.TipoRetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#tipoBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBase(CSimplificadoParser.TipoBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoPrimitivo(CSimplificadoParser.TipoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(CSimplificadoParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(CSimplificadoParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(CSimplificadoParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(CSimplificadoParser.PrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(CSimplificadoParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#listaVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaVariaveis(CSimplificadoParser.ListaVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#listaID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaID(CSimplificadoParser.ListaIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(CSimplificadoParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#listaComandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaComandos(CSimplificadoParser.ListaComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#leitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeitura(CSimplificadoParser.LeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#termoLeitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoLeitura(CSimplificadoParser.TermoLeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#novoTermoLeitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovoTermoLeitura(CSimplificadoParser.NovoTermoLeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#dimensao2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao2(CSimplificadoParser.Dimensao2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#escrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrita(CSimplificadoParser.EscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#termoEscrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoEscrita(CSimplificadoParser.TermoEscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#novoTermoEscrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovoTermoEscrita(CSimplificadoParser.NovoTermoEscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(CSimplificadoParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao(CSimplificadoParser.SenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(CSimplificadoParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(CSimplificadoParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#complementoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplementoAtribuicao(CSimplificadoParser.ComplementoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(CSimplificadoParser.ChamadaFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(CSimplificadoParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#listaArgumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentos(CSimplificadoParser.ListaArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(CSimplificadoParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(CSimplificadoParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#expressao_OU}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_OU(CSimplificadoParser.Expressao_OUContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#expressao_E}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_E(CSimplificadoParser.Expressao_EContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#expressao_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_atribuicao(CSimplificadoParser.Expressao_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#expressao_igualdade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_igualdade(CSimplificadoParser.Expressao_igualdadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#expressao_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_relacional(CSimplificadoParser.Expressao_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#expressao_aditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_aditiva(CSimplificadoParser.Expressao_aditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#expressao_multiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_multiplicativa(CSimplificadoParser.Expressao_multiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(CSimplificadoParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(CSimplificadoParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSimplificadoParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(CSimplificadoParser.ConstanteContext ctx);
}