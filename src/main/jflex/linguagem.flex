
package br.sou.dev.analisadorlexico.classes;
%%

%{
private TipoAnalise analise(String token, String descricao, String lexema){
    return new TipoAnalise(token, lexema, descricao, yyline, yycolumn, true);
}
private TipoAnalise salvaErro(String descricao, String lexema){
    if(descricao == null){
        return new TipoAnalise(null, null, "O caractere " + lexema + " é inválido", yyline, yycolumn, false);
    }else{
        return new TipoAnalise(null, lexema, descricao, yyline, yycolumn, false);
    }
}

%}

%public
%class AnalisadorLexico
%type TipoAnalise
%line
%column
%unicode

BRANCO = [\n| |\t|\r]
D = [0-9]
L = [a-zA-Z_]
NUM_INT = {D}+
NUM_DEC = {D}+\.{D}+
ERRO_DEC = {D}+\.
ERRO_ID = {D}({L}|{D})+
ID = {L}({L}|{D})+
TEXTO = \".*\"
COMP = (">=" | "<=" | ">" | "<" | "!=" | "==")
COMENT = "//".*\n

%%

"int"                       { return analise("INT","Palavra reservada ", yytext()); }
"float"                       { return analise("FLOAT","Palavra reservada ", yytext()); }
"char"                       { return analise("CHAR","Palavra reservada ", yytext()); }
"boolean"                       { return analise("BOOLEAN","Palavra reservada ", yytext()); }
"void"                       { return analise("VOId","Palavra reservada ", yytext()); }
"if"                         { return analise("IF","Palavra reservada ", yytext()); }
"else"                         { return analise("ELSE","Palavra reservada ", yytext()); }
"for"                         { return analise("FOR","Palavra reservada ", yytext()); }
"while"                         { return analise("WHILE","Palavra reservada ", yytext()); }
"Scanf"                       { return analise("SCANF","Palavra reservada ", yytext()); }
"println"                         { return analise("PRINTLN","Palavra reservada ", yytext()); }
"main"                         { return analise("MAIN","Palavra reservada ", yytext()); }
"return"                         { return analise("RETURN","Palavra reservada ", yytext()); }

"="                         { return analise("=", "Operador de Atribuição =", yytext()); }

"+"                         { return analise("+", "Operador aritmético ", yytext()); }
"-"                         { return analise("-", "Operador aritmético ", yytext()); }
"*"                         { return analise("*", "Operador aritmético ", yytext()); }
"/"                         { return analise("/", "Operador aritmético ", yytext()); }
"%"                         { return analise("%", "Operador aritmético ", yytext()); }

"&&"                         { return analise("&&", "Operador lógico ", yytext()); }
"||"                         { return analise("||", "Operador lógico ", yytext()); }
"!"                         { return analise("!", "Operador lógico ", yytext()); }

"("                         { return analise("(", "Símbolo especial ", yytext()); }
")"                         { return analise(")", "Símbolo especial ", yytext()); }
"["                         { return analise("[", "Símbolo especial ", yytext()); }
"]"                         { return analise("]", "Símbolo especial ", yytext()); }
"{"                         { return analise("{", "Símbolo especial ", yytext()); }
"}"                         { return analise("}", "Símbolo especial ", yytext()); }
","                         { return analise(",", "Símbolo especial ", yytext()); }
";"                         { return analise(";", "Símbolo especial ", yytext()); }


{BRANCO}                     {  }
{ID}                         { return analise("ID", "Identificador", yytext()); }
{TEXTO}                         { return analise("TEXTO", "Constantes de texto", yytext()); }
{COMP}                         { return analise("COMP", "Operador", yytext()); }
{NUM_INT}                     { return analise("NUM_INT", "Número Inteiro", yytext()); }
{NUM_DEC}                     { return analise("NUM_DEC", "Número Decimal", yytext()); }
{ERRO_DEC}                     { return salvaErro("O número " + yytext() + " está sem as casas decimais", yytext()); }
{ERRO_ID}                     { return salvaErro("O identificador " + yytext() + " é inválido", yytext()); }
{COMENT}                     { return analise("COMENT", "Comentário", yytext()); }

. { return salvaErro(null, yytext()); }
