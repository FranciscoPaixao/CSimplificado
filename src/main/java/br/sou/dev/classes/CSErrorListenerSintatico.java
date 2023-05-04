package br.sou.dev.classes;

import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class CSErrorListenerSintatico extends BaseErrorListener {

    private List<String> erros = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line, int charPositionInLine,
            String msg,
            RecognitionException e) {
        erros.add("Erro sintático [" + line + "," + charPositionInLine + "]: " + msg);
    }

    public List<String> getErrosSintaticos() {
        return erros;
    }
}
