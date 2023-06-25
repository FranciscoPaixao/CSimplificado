// Generated from CSimplificado.g4 by ANTLR 4.13.0

    package br.dev.sou.classes;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CSimplificadoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHAR=1, FLOAT=2, INT=3, BOOLEAN=4, VOID=5, MAIN=6, FUNC=7, IF=8, ELSE=9, 
		WHILE=10, RETURN=11, SCANF=12, PRINTLN=13, ADD=14, SUB=15, MUL=16, DIV=17, 
		MOD=18, OR=19, AND=20, EQ=21, NE=22, LT=23, GT=24, LE=25, GE=26, NOT=27, 
		ASSIGN=28, SEMICOLON=29, COMMA=30, LPAREN=31, RPAREN=32, LBRACKET=33, 
		RBRACKET=34, LBRACE=35, RBRACE=36, ID=37, NUM_INT=38, NUM_DEC=39, TEXTO=40, 
		WS=41, COMENTARIO=42, COMENTARIO_LINHA=43;
	public static final int
		RULE_program = 0, RULE_listaFuncoes = 1, RULE_declaracaoFuncao = 2, RULE_tipoRetorno = 3, 
		RULE_tipoBase = 4, RULE_tipoPrimitivo = 5, RULE_dimensao = 6, RULE_parametros = 7, 
		RULE_listaParametros = 8, RULE_principal = 9, RULE_bloco = 10, RULE_listaVariaveis = 11, 
		RULE_listaID = 12, RULE_comandos = 13, RULE_listaComandos = 14, RULE_leitura = 15, 
		RULE_termoLeitura = 16, RULE_novoTermoLeitura = 17, RULE_dimensao2 = 18, 
		RULE_escrita = 19, RULE_termoEscrita = 20, RULE_novoTermoEscrita = 21, 
		RULE_selecao = 22, RULE_senao = 23, RULE_enquanto = 24, RULE_atribuicao = 25, 
		RULE_complementoAtribuicao = 26, RULE_chamadaFuncao = 27, RULE_argumentos = 28, 
		RULE_listaArgumentos = 29, RULE_retorno = 30, RULE_expressao = 31, RULE_expressao_OU = 32, 
		RULE_expressao_OU2 = 33, RULE_expressao_E = 34, RULE_expressao_E2 = 35, 
		RULE_expressao_atribuicao = 36, RULE_expressao_igualdade = 37, RULE_expressao_relacional = 38, 
		RULE_expressao_aditiva = 39, RULE_expressao_aditiva2 = 40, RULE_expressao_multiplicativa = 41, 
		RULE_expressao_multiplicativa2 = 42, RULE_fator = 43, RULE_termo = 44, 
		RULE_constante = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "listaFuncoes", "declaracaoFuncao", "tipoRetorno", "tipoBase", 
			"tipoPrimitivo", "dimensao", "parametros", "listaParametros", "principal", 
			"bloco", "listaVariaveis", "listaID", "comandos", "listaComandos", "leitura", 
			"termoLeitura", "novoTermoLeitura", "dimensao2", "escrita", "termoEscrita", 
			"novoTermoEscrita", "selecao", "senao", "enquanto", "atribuicao", "complementoAtribuicao", 
			"chamadaFuncao", "argumentos", "listaArgumentos", "retorno", "expressao", 
			"expressao_OU", "expressao_OU2", "expressao_E", "expressao_E2", "expressao_atribuicao", 
			"expressao_igualdade", "expressao_relacional", "expressao_aditiva", "expressao_aditiva2", 
			"expressao_multiplicativa", "expressao_multiplicativa2", "fator", "termo", 
			"constante"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'char'", "'float'", "'int'", "'boolean'", "'void'", "'main'", 
			"'func'", "'if'", "'else'", "'while'", "'return'", "'scanf'", "'println'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "'&&'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'!'", "'='", "';'", "','", "'('", "')'", "'['", 
			"']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHAR", "FLOAT", "INT", "BOOLEAN", "VOID", "MAIN", "FUNC", "IF", 
			"ELSE", "WHILE", "RETURN", "SCANF", "PRINTLN", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "OR", "AND", "EQ", "NE", "LT", "GT", "LE", "GE", "NOT", "ASSIGN", 
			"SEMICOLON", "COMMA", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", 
			"RBRACE", "ID", "NUM_INT", "NUM_DEC", "TEXTO", "WS", "COMENTARIO", "COMENTARIO_LINHA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CSimplificado.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSimplificadoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ListaFuncoesContext listaFuncoes() {
			return getRuleContext(ListaFuncoesContext.class,0);
		}
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CSimplificadoParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			listaFuncoes();
			setState(93);
			principal();
			setState(94);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaFuncoesContext extends ParserRuleContext {
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public ListaFuncoesContext listaFuncoes() {
			return getRuleContext(ListaFuncoesContext.class,0);
		}
		public ListaFuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaFuncoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterListaFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitListaFuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitListaFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaFuncoesContext listaFuncoes() throws RecognitionException {
		ListaFuncoesContext _localctx = new ListaFuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaFuncoes);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				declaracaoFuncao();
				setState(97);
				listaFuncoes();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TipoRetornoContext tipoRetorno() {
			return getRuleContext(TipoRetornoContext.class,0);
		}
		public TerminalNode ID() { return getToken(CSimplificadoParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CSimplificadoParser.LPAREN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CSimplificadoParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitDeclaracaoFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitDeclaracaoFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			tipoRetorno();
			setState(103);
			match(ID);
			setState(104);
			match(LPAREN);
			setState(105);
			parametros();
			setState(106);
			match(RPAREN);
			setState(107);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoRetornoContext extends ParserRuleContext {
		public TipoBaseContext tipoBase() {
			return getRuleContext(TipoBaseContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSimplificadoParser.VOID, 0); }
		public TipoRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterTipoRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitTipoRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitTipoRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoRetornoContext tipoRetorno() throws RecognitionException {
		TipoRetornoContext _localctx = new TipoRetornoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipoRetorno);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				tipoBase();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoBaseContext extends ParserRuleContext {
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterTipoBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitTipoBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitTipoBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoBaseContext tipoBase() throws RecognitionException {
		TipoBaseContext _localctx = new TipoBaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipoBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			tipoPrimitivo();
			setState(114);
			dimensao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoPrimitivoContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(CSimplificadoParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(CSimplificadoParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(CSimplificadoParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CSimplificadoParser.BOOLEAN, 0); }
		public TipoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterTipoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitTipoPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitTipoPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoPrimitivoContext tipoPrimitivo() throws RecognitionException {
		TipoPrimitivoContext _localctx = new TipoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoPrimitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(CSimplificadoParser.LBRACKET, 0); }
		public TerminalNode NUM_INT() { return getToken(CSimplificadoParser.NUM_INT, 0); }
		public TerminalNode RBRACKET() { return getToken(CSimplificadoParser.RBRACKET, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(LBRACKET);
				setState(119);
				match(NUM_INT);
				setState(120);
				match(RBRACKET);
				setState(121);
				dimensao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public TipoBaseContext tipoBase() {
			return getRuleContext(TipoBaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(CSimplificadoParser.ID, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametros);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				tipoBase();
				setState(126);
				match(ID);
				setState(127);
				listaParametros();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametrosContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CSimplificadoParser.COMMA, 0); }
		public TipoBaseContext tipoBase() {
			return getRuleContext(TipoBaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(CSimplificadoParser.ID, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaParametros);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(COMMA);
				setState(133);
				tipoBase();
				setState(134);
				match(ID);
				setState(135);
				listaParametros();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrincipalContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CSimplificadoParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(CSimplificadoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CSimplificadoParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(MAIN);
			setState(141);
			match(LPAREN);
			setState(142);
			match(RPAREN);
			setState(143);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CSimplificadoParser.LBRACE, 0); }
		public ListaVariaveisContext listaVariaveis() {
			return getRuleContext(ListaVariaveisContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CSimplificadoParser.RBRACE, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LBRACE);
			setState(146);
			listaVariaveis();
			setState(147);
			listaComandos();
			setState(148);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaVariaveisContext extends ParserRuleContext {
		public TipoBaseContext tipoBase() {
			return getRuleContext(TipoBaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(CSimplificadoParser.ID, 0); }
		public ListaIDContext listaID() {
			return getRuleContext(ListaIDContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSimplificadoParser.SEMICOLON, 0); }
		public ListaVariaveisContext listaVariaveis() {
			return getRuleContext(ListaVariaveisContext.class,0);
		}
		public ListaVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterListaVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitListaVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitListaVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaVariaveisContext listaVariaveis() throws RecognitionException {
		ListaVariaveisContext _localctx = new ListaVariaveisContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listaVariaveis);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				tipoBase();
				setState(151);
				match(ID);
				setState(152);
				listaID();
				setState(153);
				match(SEMICOLON);
				setState(154);
				listaVariaveis();
				}
				break;
			case FUNC:
			case IF:
			case WHILE:
			case RETURN:
			case SCANF:
			case PRINTLN:
			case RBRACE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIDContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CSimplificadoParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(CSimplificadoParser.ID, 0); }
		public ListaIDContext listaID() {
			return getRuleContext(ListaIDContext.class,0);
		}
		public ListaIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterListaID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitListaID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitListaID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIDContext listaID() throws RecognitionException {
		ListaIDContext _localctx = new ListaIDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listaID);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(COMMA);
				setState(160);
				match(ID);
				setState(161);
				listaID();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSimplificadoParser.SEMICOLON, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandos);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				listaComandos();
				setState(166);
				match(SEMICOLON);
				setState(167);
				comandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaComandosContext extends ParserRuleContext {
		public List<LeituraContext> leitura() {
			return getRuleContexts(LeituraContext.class);
		}
		public LeituraContext leitura(int i) {
			return getRuleContext(LeituraContext.class,i);
		}
		public List<EscritaContext> escrita() {
			return getRuleContexts(EscritaContext.class);
		}
		public EscritaContext escrita(int i) {
			return getRuleContext(EscritaContext.class,i);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public List<ChamadaFuncaoContext> chamadaFuncao() {
			return getRuleContexts(ChamadaFuncaoContext.class);
		}
		public ChamadaFuncaoContext chamadaFuncao(int i) {
			return getRuleContext(ChamadaFuncaoContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CSimplificadoParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSimplificadoParser.SEMICOLON, i);
		}
		public List<SelecaoContext> selecao() {
			return getRuleContexts(SelecaoContext.class);
		}
		public SelecaoContext selecao(int i) {
			return getRuleContext(SelecaoContext.class,i);
		}
		public List<EnquantoContext> enquanto() {
			return getRuleContexts(EnquantoContext.class);
		}
		public EnquantoContext enquanto(int i) {
			return getRuleContext(EnquantoContext.class,i);
		}
		public List<RetornoContext> retorno() {
			return getRuleContexts(RetornoContext.class);
		}
		public RetornoContext retorno(int i) {
			return getRuleContext(RetornoContext.class,i);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitListaComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitListaComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listaComandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438969216L) != 0)) {
				{
				setState(181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCANF:
					{
					setState(172);
					leitura();
					}
					break;
				case PRINTLN:
					{
					setState(173);
					escrita();
					}
					break;
				case ID:
					{
					setState(174);
					atribuicao();
					}
					break;
				case FUNC:
					{
					setState(175);
					chamadaFuncao();
					setState(176);
					match(SEMICOLON);
					}
					break;
				case IF:
					{
					setState(178);
					selecao();
					}
					break;
				case WHILE:
					{
					setState(179);
					enquanto();
					}
					break;
				case RETURN:
					{
					setState(180);
					retorno();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(CSimplificadoParser.SCANF, 0); }
		public TerminalNode LPAREN() { return getToken(CSimplificadoParser.LPAREN, 0); }
		public TermoLeituraContext termoLeitura() {
			return getRuleContext(TermoLeituraContext.class,0);
		}
		public NovoTermoLeituraContext novoTermoLeitura() {
			return getRuleContext(NovoTermoLeituraContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CSimplificadoParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSimplificadoParser.SEMICOLON, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(SCANF);
			setState(187);
			match(LPAREN);
			setState(188);
			termoLeitura();
			setState(189);
			novoTermoLeitura();
			setState(190);
			match(RPAREN);
			setState(191);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoLeituraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CSimplificadoParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public TermoLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterTermoLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitTermoLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitTermoLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoLeituraContext termoLeitura() throws RecognitionException {
		TermoLeituraContext _localctx = new TermoLeituraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termoLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
			setState(194);
			dimensao2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NovoTermoLeituraContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CSimplificadoParser.COMMA, 0); }
		public TermoLeituraContext termoLeitura() {
			return getRuleContext(TermoLeituraContext.class,0);
		}
		public NovoTermoLeituraContext novoTermoLeitura() {
			return getRuleContext(NovoTermoLeituraContext.class,0);
		}
		public NovoTermoLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novoTermoLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterNovoTermoLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitNovoTermoLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitNovoTermoLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NovoTermoLeituraContext novoTermoLeitura() throws RecognitionException {
		NovoTermoLeituraContext _localctx = new NovoTermoLeituraContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_novoTermoLeitura);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(COMMA);
				setState(197);
				termoLeitura();
				setState(198);
				novoTermoLeitura();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dimensao2Context extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(CSimplificadoParser.LBRACKET, 0); }
		public Expressao_aditivaContext expressao_aditiva() {
			return getRuleContext(Expressao_aditivaContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(CSimplificadoParser.RBRACKET, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public Dimensao2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterDimensao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitDimensao2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitDimensao2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dimensao2Context dimensao2() throws RecognitionException {
		Dimensao2Context _localctx = new Dimensao2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_dimensao2);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(LBRACKET);
				setState(204);
				expressao_aditiva();
				setState(205);
				match(RBRACKET);
				setState(206);
				dimensao2();
				}
				break;
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
			case OR:
			case AND:
			case EQ:
			case NE:
			case LT:
			case GT:
			case LE:
			case GE:
			case ASSIGN:
			case SEMICOLON:
			case COMMA:
			case RPAREN:
			case RBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(CSimplificadoParser.PRINTLN, 0); }
		public TerminalNode LPAREN() { return getToken(CSimplificadoParser.LPAREN, 0); }
		public TermoEscritaContext termoEscrita() {
			return getRuleContext(TermoEscritaContext.class,0);
		}
		public NovoTermoEscritaContext novoTermoEscrita() {
			return getRuleContext(NovoTermoEscritaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CSimplificadoParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSimplificadoParser.SEMICOLON, 0); }
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(PRINTLN);
			setState(212);
			match(LPAREN);
			setState(213);
			termoEscrita();
			setState(214);
			novoTermoEscrita();
			setState(215);
			match(RPAREN);
			setState(216);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoEscritaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CSimplificadoParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public TerminalNode TEXTO() { return getToken(CSimplificadoParser.TEXTO, 0); }
		public TermoEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterTermoEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitTermoEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitTermoEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoEscritaContext termoEscrita() throws RecognitionException {
		TermoEscritaContext _localctx = new TermoEscritaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termoEscrita);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(ID);
				setState(219);
				dimensao2();
				}
				break;
			case NUM_INT:
			case NUM_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				constante();
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(TEXTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NovoTermoEscritaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CSimplificadoParser.COMMA, 0); }
		public TermoEscritaContext termoEscrita() {
			return getRuleContext(TermoEscritaContext.class,0);
		}
		public NovoTermoEscritaContext novoTermoEscrita() {
			return getRuleContext(NovoTermoEscritaContext.class,0);
		}
		public NovoTermoEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novoTermoEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterNovoTermoEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitNovoTermoEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitNovoTermoEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NovoTermoEscritaContext novoTermoEscrita() throws RecognitionException {
		NovoTermoEscritaContext _localctx = new NovoTermoEscritaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_novoTermoEscrita);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(COMMA);
				setState(225);
				termoEscrita();
				setState(226);
				novoTermoEscrita();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelecaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CSimplificadoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CSimplificadoParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CSimplificadoParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IF);
			setState(232);
			match(LPAREN);
			setState(233);
			expressao();
			setState(234);
			match(RPAREN);
			setState(235);
			bloco();
			setState(236);
			senao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SenaoContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CSimplificadoParser.ELSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitSenao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_senao);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(ELSE);
				setState(239);
				bloco();
				}
				break;
			case FUNC:
			case IF:
			case WHILE:
			case RETURN:
			case SCANF:
			case PRINTLN:
			case SEMICOLON:
			case RBRACE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CSimplificadoParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CSimplificadoParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CSimplificadoParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSimplificadoParser.SEMICOLON, 0); }
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(WHILE);
			setState(244);
			match(LPAREN);
			setState(245);
			expressao();
			setState(246);
			match(RPAREN);
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(247);
				bloco();
				}
				break;
			case SEMICOLON:
				{
				setState(248);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CSimplificadoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CSimplificadoParser.ASSIGN, 0); }
		public ComplementoAtribuicaoContext complementoAtribuicao() {
			return getRuleContext(ComplementoAtribuicaoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSimplificadoParser.SEMICOLON, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ID);
			setState(252);
			match(ASSIGN);
			setState(253);
			complementoAtribuicao();
			setState(254);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplementoAtribuicaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public ComplementoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complementoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterComplementoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitComplementoAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitComplementoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplementoAtribuicaoContext complementoAtribuicao() throws RecognitionException {
		ComplementoAtribuicaoContext _localctx = new ComplementoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_complementoAtribuicao);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case NOT:
			case LPAREN:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				expressao();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				chamadaFuncao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(CSimplificadoParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(CSimplificadoParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CSimplificadoParser.LPAREN, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CSimplificadoParser.RPAREN, 0); }
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_chamadaFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(FUNC);
			setState(261);
			match(ID);
			setState(262);
			match(LPAREN);
			setState(263);
			argumentos();
			setState(264);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argumentos);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case NOT:
			case LPAREN:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				expressao();
				setState(267);
				listaArgumentos();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgumentosContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CSimplificadoParser.COMMA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public ListaArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterListaArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitListaArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitListaArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgumentosContext listaArgumentos() throws RecognitionException {
		ListaArgumentosContext _localctx = new ListaArgumentosContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listaArgumentos);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(COMMA);
				setState(273);
				expressao();
				setState(274);
				listaArgumentos();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CSimplificadoParser.RETURN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSimplificadoParser.SEMICOLON, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(RETURN);
			setState(280);
			expressao();
			setState(281);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public Expressao_OUContext expressao_OU() {
			return getRuleContext(Expressao_OUContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			expressao_OU();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_OUContext extends ParserRuleContext {
		public Expressao_EContext expressao_E() {
			return getRuleContext(Expressao_EContext.class,0);
		}
		public Expressao_OU2Context expressao_OU2() {
			return getRuleContext(Expressao_OU2Context.class,0);
		}
		public Expressao_OUContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_OU; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_OU(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_OU(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_OU(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_OUContext expressao_OU() throws RecognitionException {
		Expressao_OUContext _localctx = new Expressao_OUContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressao_OU);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expressao_E();
			setState(286);
			expressao_OU2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_OU2Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(CSimplificadoParser.OR, 0); }
		public Expressao_EContext expressao_E() {
			return getRuleContext(Expressao_EContext.class,0);
		}
		public Expressao_OU2Context expressao_OU2() {
			return getRuleContext(Expressao_OU2Context.class,0);
		}
		public Expressao_OU2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_OU2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_OU2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_OU2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_OU2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_OU2Context expressao_OU2() throws RecognitionException {
		Expressao_OU2Context _localctx = new Expressao_OU2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressao_OU2);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(OR);
				setState(289);
				expressao_E();
				setState(290);
				expressao_OU2();
				}
				break;
			case SEMICOLON:
			case COMMA:
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_EContext extends ParserRuleContext {
		public Expressao_atribuicaoContext expressao_atribuicao() {
			return getRuleContext(Expressao_atribuicaoContext.class,0);
		}
		public Expressao_E2Context expressao_E2() {
			return getRuleContext(Expressao_E2Context.class,0);
		}
		public Expressao_EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_E; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_E(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_E(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_E(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_EContext expressao_E() throws RecognitionException {
		Expressao_EContext _localctx = new Expressao_EContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressao_E);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			expressao_atribuicao();
			setState(296);
			expressao_E2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_E2Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CSimplificadoParser.AND, 0); }
		public Expressao_atribuicaoContext expressao_atribuicao() {
			return getRuleContext(Expressao_atribuicaoContext.class,0);
		}
		public Expressao_E2Context expressao_E2() {
			return getRuleContext(Expressao_E2Context.class,0);
		}
		public Expressao_E2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_E2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_E2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_E2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_E2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_E2Context expressao_E2() throws RecognitionException {
		Expressao_E2Context _localctx = new Expressao_E2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressao_E2);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(AND);
				setState(299);
				expressao_atribuicao();
				setState(300);
				expressao_E2();
				}
				break;
			case OR:
			case SEMICOLON:
			case COMMA:
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_atribuicaoContext extends ParserRuleContext {
		public List<Expressao_igualdadeContext> expressao_igualdade() {
			return getRuleContexts(Expressao_igualdadeContext.class);
		}
		public Expressao_igualdadeContext expressao_igualdade(int i) {
			return getRuleContext(Expressao_igualdadeContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(CSimplificadoParser.ASSIGN, 0); }
		public Expressao_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_atribuicaoContext expressao_atribuicao() throws RecognitionException {
		Expressao_atribuicaoContext _localctx = new Expressao_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressao_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			expressao_igualdade();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(306);
				match(ASSIGN);
				setState(307);
				expressao_igualdade();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_igualdadeContext extends ParserRuleContext {
		public List<Expressao_relacionalContext> expressao_relacional() {
			return getRuleContexts(Expressao_relacionalContext.class);
		}
		public Expressao_relacionalContext expressao_relacional(int i) {
			return getRuleContext(Expressao_relacionalContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(CSimplificadoParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CSimplificadoParser.EQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(CSimplificadoParser.NE); }
		public TerminalNode NE(int i) {
			return getToken(CSimplificadoParser.NE, i);
		}
		public Expressao_igualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_igualdade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_igualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_igualdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_igualdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_igualdadeContext expressao_igualdade() throws RecognitionException {
		Expressao_igualdadeContext _localctx = new Expressao_igualdadeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressao_igualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			expressao_relacional();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NE) {
				{
				{
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				expressao_relacional();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_relacionalContext extends ParserRuleContext {
		public List<Expressao_aditivaContext> expressao_aditiva() {
			return getRuleContexts(Expressao_aditivaContext.class);
		}
		public Expressao_aditivaContext expressao_aditiva(int i) {
			return getRuleContext(Expressao_aditivaContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(CSimplificadoParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CSimplificadoParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CSimplificadoParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CSimplificadoParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(CSimplificadoParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(CSimplificadoParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(CSimplificadoParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(CSimplificadoParser.GE, i);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			expressao_aditiva();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) {
				{
				{
				setState(319);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				expressao_aditiva();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_aditivaContext extends ParserRuleContext {
		public Expressao_multiplicativaContext expressao_multiplicativa() {
			return getRuleContext(Expressao_multiplicativaContext.class,0);
		}
		public Expressao_aditiva2Context expressao_aditiva2() {
			return getRuleContext(Expressao_aditiva2Context.class,0);
		}
		public Expressao_aditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aditiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_aditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_aditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_aditiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_aditivaContext expressao_aditiva() throws RecognitionException {
		Expressao_aditivaContext _localctx = new Expressao_aditivaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressao_aditiva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			expressao_multiplicativa();
			setState(327);
			expressao_aditiva2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_aditiva2Context extends ParserRuleContext {
		public Expressao_multiplicativaContext expressao_multiplicativa() {
			return getRuleContext(Expressao_multiplicativaContext.class,0);
		}
		public Expressao_aditiva2Context expressao_aditiva2() {
			return getRuleContext(Expressao_aditiva2Context.class,0);
		}
		public TerminalNode ADD() { return getToken(CSimplificadoParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CSimplificadoParser.SUB, 0); }
		public Expressao_aditiva2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aditiva2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_aditiva2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_aditiva2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_aditiva2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_aditiva2Context expressao_aditiva2() throws RecognitionException {
		Expressao_aditiva2Context _localctx = new Expressao_aditiva2Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressao_aditiva2);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				expressao_multiplicativa();
				setState(331);
				expressao_aditiva2();
				}
				break;
			case OR:
			case AND:
			case EQ:
			case NE:
			case LT:
			case GT:
			case LE:
			case GE:
			case ASSIGN:
			case SEMICOLON:
			case COMMA:
			case RPAREN:
			case RBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_multiplicativaContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Expressao_multiplicativa2Context expressao_multiplicativa2() {
			return getRuleContext(Expressao_multiplicativa2Context.class,0);
		}
		public Expressao_multiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_multiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_multiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_multiplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_multiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_multiplicativaContext expressao_multiplicativa() throws RecognitionException {
		Expressao_multiplicativaContext _localctx = new Expressao_multiplicativaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressao_multiplicativa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			fator();
			setState(337);
			expressao_multiplicativa2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_multiplicativa2Context extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Expressao_multiplicativa2Context expressao_multiplicativa2() {
			return getRuleContext(Expressao_multiplicativa2Context.class,0);
		}
		public TerminalNode MUL() { return getToken(CSimplificadoParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CSimplificadoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CSimplificadoParser.MOD, 0); }
		public Expressao_multiplicativa2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_multiplicativa2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterExpressao_multiplicativa2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitExpressao_multiplicativa2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitExpressao_multiplicativa2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_multiplicativa2Context expressao_multiplicativa2() throws RecognitionException {
		Expressao_multiplicativa2Context _localctx = new Expressao_multiplicativa2Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressao_multiplicativa2);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(340);
				fator();
				setState(341);
				expressao_multiplicativa2();
				}
				break;
			case ADD:
			case SUB:
			case OR:
			case AND:
			case EQ:
			case NE:
			case LT:
			case GT:
			case LE:
			case GE:
			case ASSIGN:
			case SEMICOLON:
			case COMMA:
			case RPAREN:
			case RBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CSimplificadoParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CSimplificadoParser.SUB, 0); }
		public TerminalNode TEXTO() { return getToken(CSimplificadoParser.TEXTO, 0); }
		public TerminalNode NOT() { return getToken(CSimplificadoParser.NOT, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CSimplificadoParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CSimplificadoParser.RPAREN, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case ID:
			case NUM_INT:
			case NUM_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(346);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(349);
				termo();
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(TEXTO);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(NOT);
				setState(352);
				fator();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				match(LPAREN);
				setState(354);
				expressao();
				setState(355);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CSimplificadoParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_termo);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(ID);
				setState(360);
				dimensao2();
				}
				break;
			case NUM_INT:
			case NUM_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				constante();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(CSimplificadoParser.NUM_INT, 0); }
		public TerminalNode NUM_DEC() { return getToken(CSimplificadoParser.NUM_DEC, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSimplificadoListener ) ((CSimplificadoListener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSimplificadoVisitor ) return ((CSimplificadoVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==NUM_INT || _la==NUM_DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u016f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001e\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003p\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008b\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u009e\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a4"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ab\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00b6\b\u000e\n\u000e\f\u000e\u00b9"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ca\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00d2\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00df\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00e6\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00f2\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00fa\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0103\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u010f\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0116\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u0126\b!\u0001\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0130\b#\u0001$\u0001$\u0001"+
		"$\u0003$\u0135\b$\u0001%\u0001%\u0001%\u0005%\u013a\b%\n%\f%\u013d\t%"+
		"\u0001&\u0001&\u0001&\u0005&\u0142\b&\n&\f&\u0145\t&\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u014f\b(\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0159\b*\u0001+\u0003+\u015c"+
		"\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0166"+
		"\b+\u0001,\u0001,\u0001,\u0003,\u016b\b,\u0001-\u0001-\u0001-\u0000\u0000"+
		".\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0006\u0001\u0000\u0001"+
		"\u0004\u0001\u0000\u0015\u0016\u0001\u0000\u0017\u001a\u0001\u0000\u000e"+
		"\u000f\u0001\u0000\u0010\u0012\u0001\u0000&\'\u0165\u0000\\\u0001\u0000"+
		"\u0000\u0000\u0002d\u0001\u0000\u0000\u0000\u0004f\u0001\u0000\u0000\u0000"+
		"\u0006o\u0001\u0000\u0000\u0000\bq\u0001\u0000\u0000\u0000\nt\u0001\u0000"+
		"\u0000\u0000\f{\u0001\u0000\u0000\u0000\u000e\u0082\u0001\u0000\u0000"+
		"\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000"+
		"\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u009d\u0001\u0000\u0000"+
		"\u0000\u0018\u00a3\u0001\u0000\u0000\u0000\u001a\u00aa\u0001\u0000\u0000"+
		"\u0000\u001c\u00b7\u0001\u0000\u0000\u0000\u001e\u00ba\u0001\u0000\u0000"+
		"\u0000 \u00c1\u0001\u0000\u0000\u0000\"\u00c9\u0001\u0000\u0000\u0000"+
		"$\u00d1\u0001\u0000\u0000\u0000&\u00d3\u0001\u0000\u0000\u0000(\u00de"+
		"\u0001\u0000\u0000\u0000*\u00e5\u0001\u0000\u0000\u0000,\u00e7\u0001\u0000"+
		"\u0000\u0000.\u00f1\u0001\u0000\u0000\u00000\u00f3\u0001\u0000\u0000\u0000"+
		"2\u00fb\u0001\u0000\u0000\u00004\u0102\u0001\u0000\u0000\u00006\u0104"+
		"\u0001\u0000\u0000\u00008\u010e\u0001\u0000\u0000\u0000:\u0115\u0001\u0000"+
		"\u0000\u0000<\u0117\u0001\u0000\u0000\u0000>\u011b\u0001\u0000\u0000\u0000"+
		"@\u011d\u0001\u0000\u0000\u0000B\u0125\u0001\u0000\u0000\u0000D\u0127"+
		"\u0001\u0000\u0000\u0000F\u012f\u0001\u0000\u0000\u0000H\u0131\u0001\u0000"+
		"\u0000\u0000J\u0136\u0001\u0000\u0000\u0000L\u013e\u0001\u0000\u0000\u0000"+
		"N\u0146\u0001\u0000\u0000\u0000P\u014e\u0001\u0000\u0000\u0000R\u0150"+
		"\u0001\u0000\u0000\u0000T\u0158\u0001\u0000\u0000\u0000V\u0165\u0001\u0000"+
		"\u0000\u0000X\u016a\u0001\u0000\u0000\u0000Z\u016c\u0001\u0000\u0000\u0000"+
		"\\]\u0003\u0002\u0001\u0000]^\u0003\u0012\t\u0000^_\u0005\u0000\u0000"+
		"\u0001_\u0001\u0001\u0000\u0000\u0000`a\u0003\u0004\u0002\u0000ab\u0003"+
		"\u0002\u0001\u0000be\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000"+
		"d`\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0003\u0001\u0000"+
		"\u0000\u0000fg\u0003\u0006\u0003\u0000gh\u0005%\u0000\u0000hi\u0005\u001f"+
		"\u0000\u0000ij\u0003\u000e\u0007\u0000jk\u0005 \u0000\u0000kl\u0003\u0014"+
		"\n\u0000l\u0005\u0001\u0000\u0000\u0000mp\u0003\b\u0004\u0000np\u0005"+
		"\u0005\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000"+
		"p\u0007\u0001\u0000\u0000\u0000qr\u0003\n\u0005\u0000rs\u0003\f\u0006"+
		"\u0000s\t\u0001\u0000\u0000\u0000tu\u0007\u0000\u0000\u0000u\u000b\u0001"+
		"\u0000\u0000\u0000vw\u0005!\u0000\u0000wx\u0005&\u0000\u0000xy\u0005\""+
		"\u0000\u0000y|\u0003\f\u0006\u0000z|\u0001\u0000\u0000\u0000{v\u0001\u0000"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|\r\u0001\u0000\u0000\u0000}~\u0003"+
		"\b\u0004\u0000~\u007f\u0005%\u0000\u0000\u007f\u0080\u0003\u0010\b\u0000"+
		"\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082}\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u000f\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u001e\u0000\u0000\u0085"+
		"\u0086\u0003\b\u0004\u0000\u0086\u0087\u0005%\u0000\u0000\u0087\u0088"+
		"\u0003\u0010\b\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u008b\u0001"+
		"\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u0011\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u0006\u0000\u0000\u008d\u008e\u0005\u001f\u0000\u0000\u008e\u008f\u0005"+
		" \u0000\u0000\u008f\u0090\u0003\u0014\n\u0000\u0090\u0013\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005#\u0000\u0000\u0092\u0093\u0003\u0016\u000b"+
		"\u0000\u0093\u0094\u0003\u001c\u000e\u0000\u0094\u0095\u0005$\u0000\u0000"+
		"\u0095\u0015\u0001\u0000\u0000\u0000\u0096\u0097\u0003\b\u0004\u0000\u0097"+
		"\u0098\u0005%\u0000\u0000\u0098\u0099\u0003\u0018\f\u0000\u0099\u009a"+
		"\u0005\u001d\u0000\u0000\u009a\u009b\u0003\u0016\u000b\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0096"+
		"\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u0017"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u001e\u0000\u0000\u00a0\u00a1"+
		"\u0005%\u0000\u0000\u00a1\u00a4\u0003\u0018\f\u0000\u00a2\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003"+
		"\u001c\u000e\u0000\u00a6\u00a7\u0005\u001d\u0000\u0000\u00a7\u00a8\u0003"+
		"\u001a\r\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u001b\u0001\u0000\u0000\u0000\u00ac\u00b6\u0003\u001e"+
		"\u000f\u0000\u00ad\u00b6\u0003&\u0013\u0000\u00ae\u00b6\u00032\u0019\u0000"+
		"\u00af\u00b0\u00036\u001b\u0000\u00b0\u00b1\u0005\u001d\u0000\u0000\u00b1"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b2\u00b6\u0003,\u0016\u0000\u00b3\u00b6"+
		"\u00030\u0018\u0000\u00b4\u00b6\u0003<\u001e\u0000\u00b5\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u001d\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\f\u0000"+
		"\u0000\u00bb\u00bc\u0005\u001f\u0000\u0000\u00bc\u00bd\u0003 \u0010\u0000"+
		"\u00bd\u00be\u0003\"\u0011\u0000\u00be\u00bf\u0005 \u0000\u0000\u00bf"+
		"\u00c0\u0005\u001d\u0000\u0000\u00c0\u001f\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005%\u0000\u0000\u00c2\u00c3\u0003$\u0012\u0000\u00c3!\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0005\u001e\u0000\u0000\u00c5\u00c6\u0003"+
		" \u0010\u0000\u00c6\u00c7\u0003\"\u0011\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca#\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005!\u0000\u0000\u00cc\u00cd\u0003N\'\u0000\u00cd"+
		"\u00ce\u0005\"\u0000\u0000\u00ce\u00cf\u0003$\u0012\u0000\u00cf\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2%\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005\r\u0000\u0000\u00d4\u00d5\u0005\u001f"+
		"\u0000\u0000\u00d5\u00d6\u0003(\u0014\u0000\u00d6\u00d7\u0003*\u0015\u0000"+
		"\u00d7\u00d8\u0005 \u0000\u0000\u00d8\u00d9\u0005\u001d\u0000\u0000\u00d9"+
		"\'\u0001\u0000\u0000\u0000\u00da\u00db\u0005%\u0000\u0000\u00db\u00df"+
		"\u0003$\u0012\u0000\u00dc\u00df\u0003Z-\u0000\u00dd\u00df\u0005(\u0000"+
		"\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df)\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005\u001e\u0000\u0000\u00e1\u00e2\u0003(\u0014\u0000\u00e2"+
		"\u00e3\u0003*\u0015\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e0\u0001\u0000\u0000\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6+\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"\b\u0000\u0000\u00e8\u00e9\u0005\u001f\u0000\u0000\u00e9\u00ea\u0003>"+
		"\u001f\u0000\u00ea\u00eb\u0005 \u0000\u0000\u00eb\u00ec\u0003\u0014\n"+
		"\u0000\u00ec\u00ed\u0003.\u0017\u0000\u00ed-\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005\t\u0000\u0000\u00ef\u00f2\u0003\u0014\n\u0000\u00f0\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2/\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"\n\u0000\u0000\u00f4\u00f5\u0005\u001f\u0000\u0000\u00f5\u00f6\u0003>"+
		"\u001f\u0000\u00f6\u00f9\u0005 \u0000\u0000\u00f7\u00fa\u0003\u0014\n"+
		"\u0000\u00f8\u00fa\u0005\u001d\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa1\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005%\u0000\u0000\u00fc\u00fd\u0005\u001c\u0000\u0000\u00fd"+
		"\u00fe\u00034\u001a\u0000\u00fe\u00ff\u0005\u001d\u0000\u0000\u00ff3\u0001"+
		"\u0000\u0000\u0000\u0100\u0103\u0003>\u001f\u0000\u0101\u0103\u00036\u001b"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u01035\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0007\u0000\u0000"+
		"\u0105\u0106\u0005%\u0000\u0000\u0106\u0107\u0005\u001f\u0000\u0000\u0107"+
		"\u0108\u00038\u001c\u0000\u0108\u0109\u0005 \u0000\u0000\u01097\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0003>\u001f\u0000\u010b\u010c\u0003:\u001d"+
		"\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000"+
		"\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f9\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u001e\u0000\u0000"+
		"\u0111\u0112\u0003>\u001f\u0000\u0112\u0113\u0003:\u001d\u0000\u0113\u0116"+
		"\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0110"+
		"\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116;\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0005\u000b\u0000\u0000\u0118\u0119\u0003"+
		">\u001f\u0000\u0119\u011a\u0005\u001d\u0000\u0000\u011a=\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0003@ \u0000\u011c?\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0003D\"\u0000\u011e\u011f\u0003B!\u0000\u011fA\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0005\u0013\u0000\u0000\u0121\u0122\u0003D\"\u0000"+
		"\u0122\u0123\u0003B!\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0126"+
		"\u0001\u0000\u0000\u0000\u0125\u0120\u0001\u0000\u0000\u0000\u0125\u0124"+
		"\u0001\u0000\u0000\u0000\u0126C\u0001\u0000\u0000\u0000\u0127\u0128\u0003"+
		"H$\u0000\u0128\u0129\u0003F#\u0000\u0129E\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0005\u0014\u0000\u0000\u012b\u012c\u0003H$\u0000\u012c\u012d\u0003"+
		"F#\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000"+
		"\u0000\u012f\u012a\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u0130G\u0001\u0000\u0000\u0000\u0131\u0134\u0003J%\u0000\u0132"+
		"\u0133\u0005\u001c\u0000\u0000\u0133\u0135\u0003J%\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135I\u0001\u0000"+
		"\u0000\u0000\u0136\u013b\u0003L&\u0000\u0137\u0138\u0007\u0001\u0000\u0000"+
		"\u0138\u013a\u0003L&\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013d"+
		"\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013cK\u0001\u0000\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013e\u0143\u0003N\'\u0000\u013f\u0140\u0007\u0002"+
		"\u0000\u0000\u0140\u0142\u0003N\'\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144M\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0147\u0003R)\u0000\u0147\u0148"+
		"\u0003P(\u0000\u0148O\u0001\u0000\u0000\u0000\u0149\u014a\u0007\u0003"+
		"\u0000\u0000\u014a\u014b\u0003R)\u0000\u014b\u014c\u0003P(\u0000\u014c"+
		"\u014f\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e"+
		"\u0149\u0001\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f"+
		"Q\u0001\u0000\u0000\u0000\u0150\u0151\u0003V+\u0000\u0151\u0152\u0003"+
		"T*\u0000\u0152S\u0001\u0000\u0000\u0000\u0153\u0154\u0007\u0004\u0000"+
		"\u0000\u0154\u0155\u0003V+\u0000\u0155\u0156\u0003T*\u0000\u0156\u0159"+
		"\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0153"+
		"\u0001\u0000\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159U\u0001"+
		"\u0000\u0000\u0000\u015a\u015c\u0007\u0003\u0000\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0001"+
		"\u0000\u0000\u0000\u015d\u0166\u0003X,\u0000\u015e\u0166\u0005(\u0000"+
		"\u0000\u015f\u0160\u0005\u001b\u0000\u0000\u0160\u0166\u0003V+\u0000\u0161"+
		"\u0162\u0005\u001f\u0000\u0000\u0162\u0163\u0003>\u001f\u0000\u0163\u0164"+
		"\u0005 \u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u015b\u0001"+
		"\u0000\u0000\u0000\u0165\u015e\u0001\u0000\u0000\u0000\u0165\u015f\u0001"+
		"\u0000\u0000\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0166W\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0005%\u0000\u0000\u0168\u016b\u0003$\u0012\u0000"+
		"\u0169\u016b\u0003Z-\u0000\u016a\u0167\u0001\u0000\u0000\u0000\u016a\u0169"+
		"\u0001\u0000\u0000\u0000\u016bY\u0001\u0000\u0000\u0000\u016c\u016d\u0007"+
		"\u0005\u0000\u0000\u016d[\u0001\u0000\u0000\u0000\u001ddo{\u0082\u008a"+
		"\u009d\u00a3\u00aa\u00b5\u00b7\u00c9\u00d1\u00de\u00e5\u00f1\u00f9\u0102"+
		"\u010e\u0115\u0125\u012f\u0134\u013b\u0143\u014e\u0158\u015b\u0165\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}