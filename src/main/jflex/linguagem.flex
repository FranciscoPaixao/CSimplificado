
package br.sou.dev.analisadorlexico;
%%

%{

private void imprimir(String descricao, String lexema) {
    System.out.println(lexema + " - " + descricao);
}

%}

%public
%class AnalisadorLexico
%type ALToken
%line
%column
%unicode

BRANCO = [\n| |\t|\r]
D = [0-9]
L = [a-zA-Z_]
NUM_INT = {D}+
NUM_DEC = {D}+\.{D}+
ID = {L}({L}|{D})+
TEXTO = \".*\"
COMP = (">=" | "<=" | ">" | "<" | "!=" | "==")
COMENT = "//".*\n

%%

"int"                       { imprimir("Palavra reservada int", yytext()); }
"float"                       { imprimir("Palavra reservada float", yytext()); }
"char"                       { imprimir("Palavra reservada char", yytext()); }
"boolean"                       { imprimir("Palavra reservada boolean", yytext()); }
"void"                       { imprimir("Palavra reservada void", yytext()); }
"if"                         { imprimir("Palavra reservada if", yytext()); }
"else"                         { imprimir("Palavra reservada else", yytext()); }
"for"                         { imprimir("Palavra reservada for", yytext()); }
"while"                         { imprimir("Palavra reservada while", yytext()); }
"scanf"                       { imprimir("Palavra reservada scanf", yytext()); }
"println"                         { imprimir("Palavra reservada println", yytext()); }
"main"                         { imprimir("Palavra reservada main", yytext()); }
"return"                         { imprimir("Palavra reservada return", yytext()); }

"="                         { imprimir("Operador de Atribuição =", yytext()); }

"+"                         { imprimir("Operador aritmético +", yytext()); }
"-"                         { imprimir("Operador aritmético -", yytext()); }
"*"                         { imprimir("Operador aritmético *", yytext()); }
"/"                         { imprimir("Operador aritmético /", yytext()); }
"%"                         { imprimir("Operador aritmético %", yytext()); }

"&&"                         { imprimir("Operador lógico &&", yytext()); }
"||"                         { imprimir("Operador lógico ||", yytext()); }
"!"                         { imprimir("Operador lógico !", yytext()); }

"=>"                         { imprimir("Operador de Comparação =>", yytext()); }
">="                         { imprimir("Operador de Comparação >=", yytext()); }
"<"                         { imprimir("Operador de Comparação <", yytext()); }
"<="                         { imprimir("Operador de Comparação <=", yytext()); }
"!="                         { imprimir("Operador de Comparação !=", yytext()); }
"=="                         { imprimir("Operador de Comparação ==", yytext()); }

"("                         { imprimir("Símbolo especial (", yytext()); }
")"                         { imprimir("Símbolo especial )", yytext()); }
"["                         { imprimir("Símbolo especial [", yytext()); }
"]"                         { imprimir("Símbolo especial ]", yytext()); }
"{"                         { imprimir("Símbolo especial {", yytext()); }
"}"                         { imprimir("Símbolo especial }", yytext()); }
","                         { imprimir("Símbolo especial ,", yytext()); }
";"                         { imprimir("Símbolo especial ;", yytext()); }


{BRANCO}                     { imprimir("Espaço em branco/tab/linha", ""); }
{ID}                         { imprimir("Identificador", yytext()); }
{TEXTO}                         { imprimir("TEXTO", yytext()); }
{COMP}                         { imprimir("Operador", yytext()); }
{NUM_INT}                     { imprimir("Número Inteiro", yytext()); }
{NUM_DEC}                     { imprimir("Número Decimal", yytext()); }
{COMENT}                     { System.out.println("Comentario" + yytext()); }

. { System.out.println("Caractere inválido (" + yytext() + ") na linha " + yyline + ", coluna " + yycolumn); }
