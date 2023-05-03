package br.sou.dev.classes;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import java.util.ArrayList;
import java.util.List;

public class CSimplificadoErrorListener extends BaseErrorListener {
    private List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String error = "Erro de sintaxe na linha " + line + ", posição " + charPositionInLine + ": " + msg;
        errors.add(error);
    }
    
    public List<String> getErrors() {
        return errors;
    }
}
