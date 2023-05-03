package br.sou.dev.classes;

import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class CSErrorListener extends BaseErrorListener {
    private final List<String> syntaxErrors = new ArrayList<>();
    private final List<String> lexicalErrors = new ArrayList<>();

    public List<String> getSyntaxErrors() {
        return syntaxErrors;
    }

    public List<String> getLexicalErrors() {
        return lexicalErrors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        syntaxErrors.add("Erro sintático na linha " + line + ", posição " + charPositionInLine + ": " + msg);
    }

    public void reportLexerError(Lexer lexer, String message, RecognitionException e) {
        lexicalErrors.add("Erro léxico na linha " + lexer.getLine() + ", posição " + lexer.getCharPositionInLine() + ": " + message);
    }
}
