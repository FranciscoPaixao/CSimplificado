// Generated from CSimplificado.g4 by ANTLR 4.13.0

    package antlr;

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
		CHAR=1, FLOAT=2, INT=3, BOOLEAN=4, TRUE=5, FALSE=6, VOID=7, MAIN=8, FUNC=9, 
		IF=10, ELSE=11, WHILE=12, RETURN=13, SCANF=14, PRINTLN=15, ADD=16, SUB=17, 
		MUL=18, DIV=19, MOD=20, OR=21, AND=22, EQ=23, NE=24, LT=25, GT=26, LE=27, 
		GE=28, NOT=29, ASSIGN=30, SEMICOLON=31, COMMA=32, LPAREN=33, RPAREN=34, 
		LBRACKET=35, RBRACKET=36, LBRACE=37, RBRACE=38, TEXTO=39, ID=40, NUM_INT=41, 
		NUM_DEC=42, WS=43, COMENTARIO=44, COMENTARIO_LINHA=45;
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
		RULE_expressao_E = 33, RULE_expressao_atribuicao = 34, RULE_expressao_igualdade = 35, 
		RULE_expressao_relacional = 36, RULE_expressao_aditiva = 37, RULE_expressao_multiplicativa = 38, 
		RULE_fator = 39, RULE_termo = 40, RULE_constante = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "listaFuncoes", "declaracaoFuncao", "tipoRetorno", "tipoBase", 
			"tipoPrimitivo", "dimensao", "parametros", "listaParametros", "principal", 
			"bloco", "listaVariaveis", "listaID", "comandos", "listaComandos", "leitura", 
			"termoLeitura", "novoTermoLeitura", "dimensao2", "escrita", "termoEscrita", 
			"novoTermoEscrita", "selecao", "senao", "enquanto", "atribuicao", "complementoAtribuicao", 
			"chamadaFuncao", "argumentos", "listaArgumentos", "retorno", "expressao", 
			"expressao_OU", "expressao_E", "expressao_atribuicao", "expressao_igualdade", 
			"expressao_relacional", "expressao_aditiva", "expressao_multiplicativa", 
			"fator", "termo", "constante"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'char'", "'float'", "'int'", "'boolean'", "'true'", "'false'", 
			"'void'", "'main'", "'func'", "'if'", "'else'", "'while'", "'return'", 
			"'scanf'", "'println'", "'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "'&&'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'!'", "'='", "';'", "','", 
			"'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHAR", "FLOAT", "INT", "BOOLEAN", "TRUE", "FALSE", "VOID", "MAIN", 
			"FUNC", "IF", "ELSE", "WHILE", "RETURN", "SCANF", "PRINTLN", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "OR", "AND", "EQ", "NE", "LT", "GT", "LE", "GE", 
			"NOT", "ASSIGN", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "LBRACE", "RBRACE", "TEXTO", "ID", "NUM_INT", "NUM_DEC", 
			"WS", "COMENTARIO", "COMENTARIO_LINHA"
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
			setState(84);
			listaFuncoes();
			setState(85);
			principal();
			setState(86);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				declaracaoFuncao();
				setState(89);
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
			setState(94);
			tipoRetorno();
			setState(95);
			match(ID);
			setState(96);
			match(LPAREN);
			setState(97);
			parametros();
			setState(98);
			match(RPAREN);
			setState(99);
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				tipoBase();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
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
			setState(105);
			tipoPrimitivo();
			setState(106);
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
			setState(108);
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(LBRACKET);
				setState(111);
				match(NUM_INT);
				setState(112);
				match(RBRACKET);
				setState(113);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				tipoBase();
				setState(118);
				match(ID);
				setState(119);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(COMMA);
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
			setState(132);
			match(MAIN);
			setState(133);
			match(LPAREN);
			setState(134);
			match(RPAREN);
			setState(135);
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
			setState(137);
			match(LBRACE);
			setState(138);
			listaVariaveis();
			setState(139);
			listaComandos();
			setState(140);
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
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				tipoBase();
				setState(143);
				match(ID);
				setState(144);
				listaID();
				setState(145);
				match(SEMICOLON);
				setState(146);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(COMMA);
				setState(152);
				match(ID);
				setState(153);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				listaComandos();
				setState(158);
				match(SEMICOLON);
				setState(159);
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
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511690752L) != 0)) {
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCANF:
					{
					setState(164);
					leitura();
					}
					break;
				case PRINTLN:
					{
					setState(165);
					escrita();
					}
					break;
				case ID:
					{
					setState(166);
					atribuicao();
					}
					break;
				case FUNC:
					{
					setState(167);
					chamadaFuncao();
					setState(168);
					match(SEMICOLON);
					}
					break;
				case IF:
					{
					setState(170);
					selecao();
					}
					break;
				case WHILE:
					{
					setState(171);
					enquanto();
					}
					break;
				case RETURN:
					{
					setState(172);
					retorno();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(177);
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
			setState(178);
			match(SCANF);
			setState(179);
			match(LPAREN);
			setState(180);
			termoLeitura();
			setState(181);
			novoTermoLeitura();
			setState(182);
			match(RPAREN);
			setState(183);
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
			setState(185);
			match(ID);
			setState(186);
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
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(COMMA);
				setState(189);
				termoLeitura();
				setState(190);
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
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(LBRACKET);
				setState(196);
				expressao_aditiva();
				setState(197);
				match(RBRACKET);
				setState(198);
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
			setState(203);
			match(PRINTLN);
			setState(204);
			match(LPAREN);
			setState(205);
			termoEscrita();
			setState(206);
			novoTermoEscrita();
			setState(207);
			match(RPAREN);
			setState(208);
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
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(ID);
				setState(211);
				dimensao2();
				}
				break;
			case TRUE:
			case FALSE:
			case NUM_INT:
			case NUM_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				constante();
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(COMMA);
				setState(217);
				termoEscrita();
				setState(218);
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
			setState(223);
			match(IF);
			setState(224);
			match(LPAREN);
			setState(225);
			expressao();
			setState(226);
			match(RPAREN);
			setState(227);
			bloco();
			setState(228);
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
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(ELSE);
				setState(231);
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
			setState(235);
			match(WHILE);
			setState(236);
			match(LPAREN);
			setState(237);
			expressao();
			setState(238);
			match(RPAREN);
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(239);
				bloco();
				}
				break;
			case SEMICOLON:
				{
				setState(240);
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
			setState(243);
			match(ID);
			setState(244);
			match(ASSIGN);
			setState(245);
			complementoAtribuicao();
			setState(246);
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
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case ADD:
			case SUB:
			case NOT:
			case LPAREN:
			case TEXTO:
			case ID:
			case NUM_INT:
			case NUM_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				expressao();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
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
			setState(252);
			match(FUNC);
			setState(253);
			match(ID);
			setState(254);
			match(LPAREN);
			setState(255);
			argumentos();
			setState(256);
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
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case ADD:
			case SUB:
			case NOT:
			case LPAREN:
			case TEXTO:
			case ID:
			case NUM_INT:
			case NUM_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				expressao();
				setState(259);
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
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(COMMA);
				setState(265);
				expressao();
				setState(266);
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
			setState(271);
			match(RETURN);
			setState(272);
			expressao();
			setState(273);
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
			setState(275);
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
		public List<Expressao_EContext> expressao_E() {
			return getRuleContexts(Expressao_EContext.class);
		}
		public Expressao_EContext expressao_E(int i) {
			return getRuleContext(Expressao_EContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CSimplificadoParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CSimplificadoParser.OR, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			expressao_E();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(278);
				match(OR);
				setState(279);
				expressao_E();
				}
				}
				setState(284);
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
	public static class Expressao_EContext extends ParserRuleContext {
		public List<Expressao_atribuicaoContext> expressao_atribuicao() {
			return getRuleContexts(Expressao_atribuicaoContext.class);
		}
		public Expressao_atribuicaoContext expressao_atribuicao(int i) {
			return getRuleContext(Expressao_atribuicaoContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CSimplificadoParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CSimplificadoParser.AND, i);
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
		enterRule(_localctx, 66, RULE_expressao_E);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expressao_atribuicao();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(286);
				match(AND);
				setState(287);
				expressao_atribuicao();
				}
				}
				setState(292);
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
	public static class Expressao_atribuicaoContext extends ParserRuleContext {
		public List<Expressao_igualdadeContext> expressao_igualdade() {
			return getRuleContexts(Expressao_igualdadeContext.class);
		}
		public Expressao_igualdadeContext expressao_igualdade(int i) {
			return getRuleContext(Expressao_igualdadeContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CSimplificadoParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CSimplificadoParser.ASSIGN, i);
		}
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
		enterRule(_localctx, 68, RULE_expressao_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			expressao_igualdade();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSIGN) {
				{
				{
				setState(294);
				match(ASSIGN);
				setState(295);
				expressao_igualdade();
				}
				}
				setState(300);
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
		enterRule(_localctx, 70, RULE_expressao_igualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			expressao_relacional();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NE) {
				{
				{
				setState(302);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(303);
				expressao_relacional();
				}
				}
				setState(308);
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
		enterRule(_localctx, 72, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			expressao_aditiva();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) {
				{
				{
				setState(310);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(311);
				expressao_aditiva();
				}
				}
				setState(316);
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
		public List<Expressao_multiplicativaContext> expressao_multiplicativa() {
			return getRuleContexts(Expressao_multiplicativaContext.class);
		}
		public Expressao_multiplicativaContext expressao_multiplicativa(int i) {
			return getRuleContext(Expressao_multiplicativaContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(CSimplificadoParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(CSimplificadoParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(CSimplificadoParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(CSimplificadoParser.SUB, i);
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
		enterRule(_localctx, 74, RULE_expressao_aditiva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			expressao_multiplicativa();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(318);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(319);
				expressao_multiplicativa();
				}
				}
				setState(324);
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
	public static class Expressao_multiplicativaContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(CSimplificadoParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(CSimplificadoParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CSimplificadoParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CSimplificadoParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(CSimplificadoParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(CSimplificadoParser.MOD, i);
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
		enterRule(_localctx, 76, RULE_expressao_multiplicativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			fator();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) {
				{
				{
				setState(326);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(327);
				fator();
				}
				}
				setState(332);
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
		enterRule(_localctx, 78, RULE_fator);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case ADD:
			case SUB:
			case ID:
			case NUM_INT:
			case NUM_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(333);
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

				setState(336);
				termo();
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(TEXTO);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(NOT);
				setState(339);
				fator();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(LPAREN);
				setState(341);
				expressao();
				setState(342);
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
		enterRule(_localctx, 80, RULE_termo);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(ID);
				setState(347);
				dimensao2();
				}
				break;
			case TRUE:
			case FALSE:
			case NUM_INT:
			case NUM_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
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
		public TerminalNode TRUE() { return getToken(CSimplificadoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSimplificadoParser.FALSE, 0); }
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
		enterRule(_localctx, 82, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6597069766752L) != 0)) ) {
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
		"\u0004\u0001-\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001]\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003h\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006t\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007{\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0083\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0096\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u009c\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a3"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ae\b\u000e\n"+
		"\u000e\f\u000e\u00b1\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00c2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00ca\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d7\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00de\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00ea\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00f2\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u00fb\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0107\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u010e\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0005 \u0119\b \n \f \u011c\t \u0001!\u0001!\u0001!\u0005"+
		"!\u0121\b!\n!\f!\u0124\t!\u0001\"\u0001\"\u0001\"\u0005\"\u0129\b\"\n"+
		"\"\f\"\u012c\t\"\u0001#\u0001#\u0001#\u0005#\u0131\b#\n#\f#\u0134\t#\u0001"+
		"$\u0001$\u0001$\u0005$\u0139\b$\n$\f$\u013c\t$\u0001%\u0001%\u0001%\u0005"+
		"%\u0141\b%\n%\f%\u0144\t%\u0001&\u0001&\u0001&\u0005&\u0149\b&\n&\f&\u014c"+
		"\t&\u0001\'\u0003\'\u014f\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u0159\b\'\u0001(\u0001(\u0001(\u0003"+
		"(\u015e\b(\u0001)\u0001)\u0001)\u0000\u0000*\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPR\u0000\u0006\u0001\u0000\u0001\u0004\u0001\u0000\u0017"+
		"\u0018\u0001\u0000\u0019\u001c\u0001\u0000\u0010\u0011\u0001\u0000\u0012"+
		"\u0014\u0002\u0000\u0005\u0006)*\u015c\u0000T\u0001\u0000\u0000\u0000"+
		"\u0002\\\u0001\u0000\u0000\u0000\u0004^\u0001\u0000\u0000\u0000\u0006"+
		"g\u0001\u0000\u0000\u0000\bi\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000"+
		"\u0000\fs\u0001\u0000\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010"+
		"\u0082\u0001\u0000\u0000\u0000\u0012\u0084\u0001\u0000\u0000\u0000\u0014"+
		"\u0089\u0001\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018"+
		"\u009b\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c"+
		"\u00af\u0001\u0000\u0000\u0000\u001e\u00b2\u0001\u0000\u0000\u0000 \u00b9"+
		"\u0001\u0000\u0000\u0000\"\u00c1\u0001\u0000\u0000\u0000$\u00c9\u0001"+
		"\u0000\u0000\u0000&\u00cb\u0001\u0000\u0000\u0000(\u00d6\u0001\u0000\u0000"+
		"\u0000*\u00dd\u0001\u0000\u0000\u0000,\u00df\u0001\u0000\u0000\u0000."+
		"\u00e9\u0001\u0000\u0000\u00000\u00eb\u0001\u0000\u0000\u00002\u00f3\u0001"+
		"\u0000\u0000\u00004\u00fa\u0001\u0000\u0000\u00006\u00fc\u0001\u0000\u0000"+
		"\u00008\u0106\u0001\u0000\u0000\u0000:\u010d\u0001\u0000\u0000\u0000<"+
		"\u010f\u0001\u0000\u0000\u0000>\u0113\u0001\u0000\u0000\u0000@\u0115\u0001"+
		"\u0000\u0000\u0000B\u011d\u0001\u0000\u0000\u0000D\u0125\u0001\u0000\u0000"+
		"\u0000F\u012d\u0001\u0000\u0000\u0000H\u0135\u0001\u0000\u0000\u0000J"+
		"\u013d\u0001\u0000\u0000\u0000L\u0145\u0001\u0000\u0000\u0000N\u0158\u0001"+
		"\u0000\u0000\u0000P\u015d\u0001\u0000\u0000\u0000R\u015f\u0001\u0000\u0000"+
		"\u0000TU\u0003\u0002\u0001\u0000UV\u0003\u0012\t\u0000VW\u0005\u0000\u0000"+
		"\u0001W\u0001\u0001\u0000\u0000\u0000XY\u0003\u0004\u0002\u0000YZ\u0003"+
		"\u0002\u0001\u0000Z]\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000"+
		"\\X\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0003\u0001\u0000"+
		"\u0000\u0000^_\u0003\u0006\u0003\u0000_`\u0005(\u0000\u0000`a\u0005!\u0000"+
		"\u0000ab\u0003\u000e\u0007\u0000bc\u0005\"\u0000\u0000cd\u0003\u0014\n"+
		"\u0000d\u0005\u0001\u0000\u0000\u0000eh\u0003\b\u0004\u0000fh\u0005\u0007"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0007"+
		"\u0001\u0000\u0000\u0000ij\u0003\n\u0005\u0000jk\u0003\f\u0006\u0000k"+
		"\t\u0001\u0000\u0000\u0000lm\u0007\u0000\u0000\u0000m\u000b\u0001\u0000"+
		"\u0000\u0000no\u0005#\u0000\u0000op\u0005)\u0000\u0000pq\u0005$\u0000"+
		"\u0000qt\u0003\f\u0006\u0000rt\u0001\u0000\u0000\u0000sn\u0001\u0000\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000t\r\u0001\u0000\u0000\u0000uv\u0003\b"+
		"\u0004\u0000vw\u0005(\u0000\u0000wx\u0003\u0010\b\u0000x{\u0001\u0000"+
		"\u0000\u0000y{\u0001\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0005 \u0000\u0000"+
		"}~\u0003\b\u0004\u0000~\u007f\u0005(\u0000\u0000\u007f\u0080\u0003\u0010"+
		"\b\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000"+
		"\u0000\u0082|\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0011\u0001\u0000\u0000\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085"+
		"\u0086\u0005!\u0000\u0000\u0086\u0087\u0005\"\u0000\u0000\u0087\u0088"+
		"\u0003\u0014\n\u0000\u0088\u0013\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"%\u0000\u0000\u008a\u008b\u0003\u0016\u000b\u0000\u008b\u008c\u0003\u001c"+
		"\u000e\u0000\u008c\u008d\u0005&\u0000\u0000\u008d\u0015\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0003\b\u0004\u0000\u008f\u0090\u0005(\u0000\u0000"+
		"\u0090\u0091\u0003\u0018\f\u0000\u0091\u0092\u0005\u001f\u0000\u0000\u0092"+
		"\u0093\u0003\u0016\u000b\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0001\u0000\u0000\u0000\u0095\u008e\u0001\u0000\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0017\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005 \u0000\u0000\u0098\u0099\u0005(\u0000\u0000\u0099\u009c\u0003"+
		"\u0018\f\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0097\u0001\u0000"+
		"\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u0019\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0003\u001c\u000e\u0000\u009e\u009f\u0005\u001f"+
		"\u0000\u0000\u009f\u00a0\u0003\u001a\r\u0000\u00a0\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u001b\u0001\u0000\u0000"+
		"\u0000\u00a4\u00ae\u0003\u001e\u000f\u0000\u00a5\u00ae\u0003&\u0013\u0000"+
		"\u00a6\u00ae\u00032\u0019\u0000\u00a7\u00a8\u00036\u001b\u0000\u00a8\u00a9"+
		"\u0005\u001f\u0000\u0000\u00a9\u00ae\u0001\u0000\u0000\u0000\u00aa\u00ae"+
		"\u0003,\u0016\u0000\u00ab\u00ae\u00030\u0018\u0000\u00ac\u00ae\u0003<"+
		"\u001e\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a6\u0001\u0000\u0000\u0000\u00ad\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\u000e\u0000\u0000\u00b3\u00b4\u0005!\u0000"+
		"\u0000\u00b4\u00b5\u0003 \u0010\u0000\u00b5\u00b6\u0003\"\u0011\u0000"+
		"\u00b6\u00b7\u0005\"\u0000\u0000\u00b7\u00b8\u0005\u001f\u0000\u0000\u00b8"+
		"\u001f\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005(\u0000\u0000\u00ba\u00bb"+
		"\u0003$\u0012\u0000\u00bb!\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005 "+
		"\u0000\u0000\u00bd\u00be\u0003 \u0010\u0000\u00be\u00bf\u0003\"\u0011"+
		"\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2#\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005#\u0000\u0000\u00c4"+
		"\u00c5\u0003J%\u0000\u00c5\u00c6\u0005$\u0000\u0000\u00c6\u00c7\u0003"+
		"$\u0012\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c3\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca%\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u000f\u0000"+
		"\u0000\u00cc\u00cd\u0005!\u0000\u0000\u00cd\u00ce\u0003(\u0014\u0000\u00ce"+
		"\u00cf\u0003*\u0015\u0000\u00cf\u00d0\u0005\"\u0000\u0000\u00d0\u00d1"+
		"\u0005\u001f\u0000\u0000\u00d1\'\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		"(\u0000\u0000\u00d3\u00d7\u0003$\u0012\u0000\u00d4\u00d7\u0003R)\u0000"+
		"\u00d5\u00d7\u0005\'\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		")\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005 \u0000\u0000\u00d9\u00da\u0003"+
		"(\u0014\u0000\u00da\u00db\u0003*\u0015\u0000\u00db\u00de\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000\u0000"+
		"\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de+\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0005\n\u0000\u0000\u00e0\u00e1\u0005!\u0000\u0000\u00e1"+
		"\u00e2\u0003>\u001f\u0000\u00e2\u00e3\u0005\"\u0000\u0000\u00e3\u00e4"+
		"\u0003\u0014\n\u0000\u00e4\u00e5\u0003.\u0017\u0000\u00e5-\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0005\u000b\u0000\u0000\u00e7\u00ea\u0003\u0014"+
		"\n\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea/\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0005\f\u0000\u0000\u00ec\u00ed\u0005!\u0000\u0000\u00ed"+
		"\u00ee\u0003>\u001f\u0000\u00ee\u00f1\u0005\"\u0000\u0000\u00ef\u00f2"+
		"\u0003\u0014\n\u0000\u00f0\u00f2\u0005\u001f\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f21\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0005(\u0000\u0000\u00f4\u00f5\u0005\u001e\u0000"+
		"\u0000\u00f5\u00f6\u00034\u001a\u0000\u00f6\u00f7\u0005\u001f\u0000\u0000"+
		"\u00f73\u0001\u0000\u0000\u0000\u00f8\u00fb\u0003>\u001f\u0000\u00f9\u00fb"+
		"\u00036\u001b\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb5\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\t"+
		"\u0000\u0000\u00fd\u00fe\u0005(\u0000\u0000\u00fe\u00ff\u0005!\u0000\u0000"+
		"\u00ff\u0100\u00038\u001c\u0000\u0100\u0101\u0005\"\u0000\u0000\u0101"+
		"7\u0001\u0000\u0000\u0000\u0102\u0103\u0003>\u001f\u0000\u0103\u0104\u0003"+
		":\u001d\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000"+
		"\u0000\u0000\u0106\u0102\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000"+
		"\u0000\u0000\u01079\u0001\u0000\u0000\u0000\u0108\u0109\u0005 \u0000\u0000"+
		"\u0109\u010a\u0003>\u001f\u0000\u010a\u010b\u0003:\u001d\u0000\u010b\u010e"+
		"\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0108"+
		"\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e;\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005\r\u0000\u0000\u0110\u0111\u0003>"+
		"\u001f\u0000\u0111\u0112\u0005\u001f\u0000\u0000\u0112=\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0003@ \u0000\u0114?\u0001\u0000\u0000\u0000\u0115"+
		"\u011a\u0003B!\u0000\u0116\u0117\u0005\u0015\u0000\u0000\u0117\u0119\u0003"+
		"B!\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011bA\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011d\u0122\u0003D\"\u0000\u011e\u011f\u0005\u0016\u0000\u0000\u011f"+
		"\u0121\u0003D\"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0124"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123C\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0125\u012a\u0003F#\u0000\u0126\u0127\u0005\u001e\u0000"+
		"\u0000\u0127\u0129\u0003F#\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129"+
		"\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0001\u0000\u0000\u0000\u012bE\u0001\u0000\u0000\u0000\u012c\u012a"+
		"\u0001\u0000\u0000\u0000\u012d\u0132\u0003H$\u0000\u012e\u012f\u0007\u0001"+
		"\u0000\u0000\u012f\u0131\u0003H$\u0000\u0130\u012e\u0001\u0000\u0000\u0000"+
		"\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133G\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0135\u013a\u0003J%\u0000\u0136\u0137\u0007"+
		"\u0002\u0000\u0000\u0137\u0139\u0003J%\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013bI\u0001\u0000\u0000\u0000"+
		"\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0142\u0003L&\u0000\u013e\u013f"+
		"\u0007\u0003\u0000\u0000\u013f\u0141\u0003L&\u0000\u0140\u013e\u0001\u0000"+
		"\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143K\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u014a\u0003N\'\u0000"+
		"\u0146\u0147\u0007\u0004\u0000\u0000\u0147\u0149\u0003N\'\u0000\u0148"+
		"\u0146\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"M\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u014f"+
		"\u0007\u0003\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0159"+
		"\u0003P(\u0000\u0151\u0159\u0005\'\u0000\u0000\u0152\u0153\u0005\u001d"+
		"\u0000\u0000\u0153\u0159\u0003N\'\u0000\u0154\u0155\u0005!\u0000\u0000"+
		"\u0155\u0156\u0003>\u001f\u0000\u0156\u0157\u0005\"\u0000\u0000\u0157"+
		"\u0159\u0001\u0000\u0000\u0000\u0158\u014e\u0001\u0000\u0000\u0000\u0158"+
		"\u0151\u0001\u0000\u0000\u0000\u0158\u0152\u0001\u0000\u0000\u0000\u0158"+
		"\u0154\u0001\u0000\u0000\u0000\u0159O\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0005(\u0000\u0000\u015b\u015e\u0003$\u0012\u0000\u015c\u015e\u0003R"+
		")\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000"+
		"\u0000\u015eQ\u0001\u0000\u0000\u0000\u015f\u0160\u0007\u0005\u0000\u0000"+
		"\u0160S\u0001\u0000\u0000\u0000\u001d\\gsz\u0082\u0095\u009b\u00a2\u00ad"+
		"\u00af\u00c1\u00c9\u00d6\u00dd\u00e9\u00f1\u00fa\u0106\u010d\u011a\u0122"+
		"\u012a\u0132\u013a\u0142\u014a\u014e\u0158\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}