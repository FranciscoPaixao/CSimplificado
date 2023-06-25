// Generated from CSimplificado.g4 by ANTLR 4.13.0

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSimplificadoParser}.
 */
public interface CSimplificadoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CSimplificadoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CSimplificadoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#listaFuncoes}.
	 * @param ctx the parse tree
	 */
	void enterListaFuncoes(CSimplificadoParser.ListaFuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#listaFuncoes}.
	 * @param ctx the parse tree
	 */
	void exitListaFuncoes(CSimplificadoParser.ListaFuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(CSimplificadoParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(CSimplificadoParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void enterTipoRetorno(CSimplificadoParser.TipoRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void exitTipoRetorno(CSimplificadoParser.TipoRetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#tipoBase}.
	 * @param ctx the parse tree
	 */
	void enterTipoBase(CSimplificadoParser.TipoBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#tipoBase}.
	 * @param ctx the parse tree
	 */
	void exitTipoBase(CSimplificadoParser.TipoBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterTipoPrimitivo(CSimplificadoParser.TipoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitTipoPrimitivo(CSimplificadoParser.TipoPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(CSimplificadoParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(CSimplificadoParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(CSimplificadoParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(CSimplificadoParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(CSimplificadoParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(CSimplificadoParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(CSimplificadoParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(CSimplificadoParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(CSimplificadoParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(CSimplificadoParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterListaVariaveis(CSimplificadoParser.ListaVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitListaVariaveis(CSimplificadoParser.ListaVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#listaID}.
	 * @param ctx the parse tree
	 */
	void enterListaID(CSimplificadoParser.ListaIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#listaID}.
	 * @param ctx the parse tree
	 */
	void exitListaID(CSimplificadoParser.ListaIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(CSimplificadoParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(CSimplificadoParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(CSimplificadoParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(CSimplificadoParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(CSimplificadoParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(CSimplificadoParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#termoLeitura}.
	 * @param ctx the parse tree
	 */
	void enterTermoLeitura(CSimplificadoParser.TermoLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#termoLeitura}.
	 * @param ctx the parse tree
	 */
	void exitTermoLeitura(CSimplificadoParser.TermoLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#novoTermoLeitura}.
	 * @param ctx the parse tree
	 */
	void enterNovoTermoLeitura(CSimplificadoParser.NovoTermoLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#novoTermoLeitura}.
	 * @param ctx the parse tree
	 */
	void exitNovoTermoLeitura(CSimplificadoParser.NovoTermoLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#dimensao2}.
	 * @param ctx the parse tree
	 */
	void enterDimensao2(CSimplificadoParser.Dimensao2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#dimensao2}.
	 * @param ctx the parse tree
	 */
	void exitDimensao2(CSimplificadoParser.Dimensao2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(CSimplificadoParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(CSimplificadoParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#termoEscrita}.
	 * @param ctx the parse tree
	 */
	void enterTermoEscrita(CSimplificadoParser.TermoEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#termoEscrita}.
	 * @param ctx the parse tree
	 */
	void exitTermoEscrita(CSimplificadoParser.TermoEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#novoTermoEscrita}.
	 * @param ctx the parse tree
	 */
	void enterNovoTermoEscrita(CSimplificadoParser.NovoTermoEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#novoTermoEscrita}.
	 * @param ctx the parse tree
	 */
	void exitNovoTermoEscrita(CSimplificadoParser.NovoTermoEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(CSimplificadoParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(CSimplificadoParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(CSimplificadoParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(CSimplificadoParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(CSimplificadoParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(CSimplificadoParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(CSimplificadoParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(CSimplificadoParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#complementoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComplementoAtribuicao(CSimplificadoParser.ComplementoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#complementoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComplementoAtribuicao(CSimplificadoParser.ComplementoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(CSimplificadoParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(CSimplificadoParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(CSimplificadoParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(CSimplificadoParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentos(CSimplificadoParser.ListaArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentos(CSimplificadoParser.ListaArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(CSimplificadoParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(CSimplificadoParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(CSimplificadoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(CSimplificadoParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#expressao_OU}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_OU(CSimplificadoParser.Expressao_OUContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#expressao_OU}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_OU(CSimplificadoParser.Expressao_OUContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#expressao_E}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_E(CSimplificadoParser.Expressao_EContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#expressao_E}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_E(CSimplificadoParser.Expressao_EContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#expressao_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_atribuicao(CSimplificadoParser.Expressao_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#expressao_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_atribuicao(CSimplificadoParser.Expressao_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#expressao_igualdade}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_igualdade(CSimplificadoParser.Expressao_igualdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#expressao_igualdade}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_igualdade(CSimplificadoParser.Expressao_igualdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(CSimplificadoParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(CSimplificadoParser.Expressao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#expressao_aditiva}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aditiva(CSimplificadoParser.Expressao_aditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#expressao_aditiva}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aditiva(CSimplificadoParser.Expressao_aditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#expressao_multiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_multiplicativa(CSimplificadoParser.Expressao_multiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#expressao_multiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_multiplicativa(CSimplificadoParser.Expressao_multiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(CSimplificadoParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(CSimplificadoParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(CSimplificadoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(CSimplificadoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSimplificadoParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(CSimplificadoParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSimplificadoParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(CSimplificadoParser.ConstanteContext ctx);
}