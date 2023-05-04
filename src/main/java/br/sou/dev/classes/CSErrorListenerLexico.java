package br.sou.dev.classes;

import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class CSErrorListenerLexico extends BaseErrorListener {
    private List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if (offendingSymbol != null) {
            String symbol = offendingSymbol.toString();
            if (symbol.equals("<EOF>")) {
                errors.add("Erro léxico [" + line + ", " + charPositionInLine + "]: fim de arquivo inesperado");
            } else {
                errors.add("Erro léxico [" + line + ", " + charPositionInLine + "]: símbolo '" + symbol + "' inválido");
            }
        } else {
            errors.add("Erro léxico [" + line + ", " + charPositionInLine + "]: " + msg);
        }
    }

    public List<String> getErrosLexicos() {
        return errors;
    }

}
