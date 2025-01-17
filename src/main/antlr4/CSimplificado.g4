grammar CSimplificado;
@header {
    package antlr;
}
program: listaFuncoes principal EOF;

listaFuncoes: declaracaoFuncao listaFuncoes |;

declaracaoFuncao: tipoRetorno ID LPAREN parametros RPAREN bloco;

tipoRetorno: tipoBase | VOID;

tipoBase: tipoPrimitivo dimensao;

tipoPrimitivo: CHAR | FLOAT | INT | BOOLEAN;

dimensao: LBRACKET NUM_INT RBRACKET dimensao |;

parametros: tipoBase ID listaParametros |;

listaParametros: COMMA tipoBase ID listaParametros |;

principal: MAIN LPAREN RPAREN bloco;

bloco: LBRACE listaVariaveis secaoComandos RBRACE;

listaVariaveis: tipoBase ID listaID SEMICOLON listaVariaveis |;

listaID: COMMA tipoBase ID listaID |;


secaoComandos: listaComandos | ;

listaComandos: comando listaComandos? ;

comando: leitura
       | escrita
       | atribuicao
       | chamadaFuncao SEMICOLON
       | selecao
       | enquanto
       | retorno
       ;
leitura:
	SCANF LPAREN termoLeitura novoTermoLeitura RPAREN SEMICOLON;

termoLeitura: ID dimensao2;

novoTermoLeitura: COMMA termoLeitura novoTermoLeitura |;

dimensao2: LBRACKET expressao_aditiva RBRACKET dimensao2 |;

escrita:
	PRINTLN LPAREN termoEscrita RPAREN SEMICOLON;

termoEscrita: constante | ID;

selecao: IF LPAREN expressao RPAREN bloco senao;

senao: ELSE bloco |;

enquanto: WHILE LPAREN expressao RPAREN (bloco | SEMICOLON);

atribuicao: ID ASSIGN complementoAtribuicao SEMICOLON;

complementoAtribuicao: expressao | chamadaFuncao;

chamadaFuncao:
	FUNC ID LPAREN argumentos RPAREN;
argumentos: expressao listaArgumentos |;

listaArgumentos: COMMA expressao listaArgumentos |;

retorno: RETURN expressao SEMICOLON;

expressao:
    expressao_OU;
expressao_OU:
    expressao_E (OR expressao_E)*;
expressao_E:
    expressao_atribuicao (AND expressao_atribuicao)*;
expressao_atribuicao:
    expressao_igualdade (ASSIGN expressao_igualdade)*;

expressao_igualdade:
	expressao_relacional ((EQ | NE) expressao_relacional)*;
expressao_relacional:
	expressao_aditiva ((LT | GT | LE | GE) expressao_aditiva)*;
expressao_aditiva:
    expressao_multiplicativa ((ADD | SUB) expressao_multiplicativa)*;
expressao_multiplicativa: fator ((MUL | DIV | MOD) fator)*;

fator:
	(ADD | SUB)? termo
	| TEXTO
	| NOT fator
	| LPAREN expressao RPAREN;
termo: ID dimensao2 | constante;

constante: NUM_INT | NUM_DEC;

CHAR: 'char';
FLOAT: 'float';
INT: 'int';
BOOLEAN: 'boolean';
TRUE: 'true';
FALSE: 'false';
VOID: 'void';
MAIN: 'main';
FUNC: 'func';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
RETURN: 'return';
SCANF: 'scanf';
PRINTLN: 'println';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';
OR: '||';
AND: '&&';
EQ: '==';
NE: '!=';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
NOT: '!';
ASSIGN: '=';
SEMICOLON: ';';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{';
RBRACE: '}';
TEXTO: '"' (ESC|.)*? '"';
fragment ESC : '\\"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUM_INT: [0-9]+;
NUM_DEC: [0-9]+ '.' [0-9]+;


WS: [ \t\r\n]+ -> skip;
COMENTARIO: '/*' .*? '*/' -> skip;
COMENTARIO_LINHA: '//' .*? ('\r' | '\n' | EOF) -> skip;