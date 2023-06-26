/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.classes;

import antlr.CSimplificadoBaseListener;
import antlr.CSimplificadoLexer;
import antlr.CSimplificadoParser;

import java.util.*;

/**
 * @author Francisco
 */
public class CSErrorListenerSemantico extends CSimplificadoBaseListener {

    private CSimplificadoLexer lexer;
    private HashMap<String, String> listaConstantes = new HashMap<>();
    //private Deque<HashMap<String, String>> listaVariaveis = new ArrayDeque<>();
    private HashMap<String, HashMap<String, String>> listaVariaveis = new HashMap<>();
    private HashMap<String, String> listaFuncoes = new HashMap<>();
    private HashMap<String, ArrayList<String>> listaParametrosFuncoes = new HashMap<>();
    private ArrayList<String> tempParametrosAtuais;
    private List<String> erros = new ArrayList<>();
    private String tempTipoBase;
    private String tempTipoRetorno;
    private int tempContadorParametros;
    private int tempContadorParametrosRequeridosRestantes;


    private boolean ehFuncao = false;
    private boolean ehChamadaFuncao = false;
    private boolean precisaDefinirRetorno = false;
    private boolean definiuRetorno = false;
    private boolean ehAtribuicaoDeRetorno = false;
    private boolean ehDeclaracaoFuncao = false;
    private boolean ehRetornoFuncao = false;
    private boolean ehAtribuicao = false;

    private String variavelAtribuicao;
    private String funcaoAtual;
    private String funcaoChamada;

    public CSErrorListenerSemantico(CSimplificadoLexer lexer) {

        this.lexer = lexer;
    }

    public HashMap<String, HashMap<String, String>> getListaVariaveis() {
        return listaVariaveis;
    }

    @Override
    public void enterBloco(CSimplificadoParser.BlocoContext ctx) {
        System.out.println("Entrou no bloco");
        if (ehFuncao) {
            return;
        }
        this.funcaoAtual = "main";
        listaVariaveis.put(funcaoAtual, new HashMap<>());
    }

    @Override
    public void exitBloco(CSimplificadoParser.BlocoContext ctx) {
        System.out.println("Saiu do bloco");
    }

    public List<String> getErrosSemanticos() {

        return erros;
    }

    @Override
    public void enterListaVariaveis(CSimplificadoParser.ListaVariaveisContext ctx) {
        if (ctx.ID() == null || ctx.tipoBase() == null) {
            return;
        }

        if (listaVariaveis.get(funcaoAtual).containsKey(ctx.ID().getText())) {
            int linha = ctx.getStart().getLine();
            int coluna = ctx.getStart().getCharPositionInLine() + 1;
            erros.add("Erro semântico [" + linha + ", " + coluna + "]: variável " + ctx.ID().getText() + " já declarada");
            return;
        }

        tempTipoBase = ctx.tipoBase().getText();

        listaVariaveis.get(funcaoAtual).put(ctx.ID().getText(), tempTipoBase);
    }

    @Override
    public void enterListaID(CSimplificadoParser.ListaIDContext ctx) {
        if (ctx.ID() == null) {
            return;
        }
        if (listaVariaveis.get(funcaoAtual).containsKey(ctx.ID().getText())) {
            int linha = ctx.getStart().getLine();
            int coluna = ctx.getStart().getCharPositionInLine() + 1;
            erros.add("Erro semântico [" + linha + ", " + coluna + "]: variável " + ctx.ID().getText() + " já declarada");
            return;
        }
        listaVariaveis.get(funcaoAtual).put(ctx.ID().getText(), tempTipoBase);
    }

    @Override
    public void exitListaVariaveis(CSimplificadoParser.ListaVariaveisContext ctx) {
        tempTipoBase = "";
    }

    public String ObterNomeToken(int token) {
        return lexer.getVocabulary().getSymbolicName(token);
    }

    @Override
    public void enterFator(CSimplificadoParser.FatorContext ctx) {
        if (ctx.getStart() == null) {
            return;
        }
        System.out.println("Entrou no fator");

        if (ctx.getStart().getType() == CSimplificadoParser.ID) {
            String identificador = ctx.getStart().getText();

            if (!listaVariaveis.get(funcaoAtual).containsKey(ctx.getStart().getText())) {
                int linha = ctx.getStart().getLine();
                int coluna = ctx.getStart().getCharPositionInLine() + 1;
                erros.add("Erro semântico [" + linha + ", " + coluna + "]: variável " + identificador + " não declarada");
                return;
            }
        }
        Set<Integer> tipoConstante = new HashSet<>(Arrays.asList(
                CSimplificadoParser.NUM_INT,
                CSimplificadoParser.NUM_DEC,
                CSimplificadoParser.TRUE,
                CSimplificadoParser.FALSE,
                CSimplificadoParser.TEXTO
        ));
        if (tipoConstante.contains(ctx.getStart().getType()) || ehChamadaFuncao || ehAtribuicao || ehRetornoFuncao || ehFuncao) {
            String tipoAceito;
            String tipoVariavel;

            if (ehChamadaFuncao) {
                tipoAceito = listaParametrosFuncoes.get(funcaoChamada).get(tempContadorParametros);
            } else if (ehFuncao) {
                tipoAceito = listaFuncoes.get(funcaoAtual);
            } else {
                tipoAceito = listaVariaveis.get(funcaoAtual).get(variavelAtribuicao);
            }

            if (tipoConstante.contains(ctx.getStart().getType())) {
                tipoVariavel = ObterTipoConstante(ctx.getStart().getType());
            } else if (ehFuncao) {
                tipoVariavel = listaVariaveis.get(funcaoAtual).get(ctx.getStart().getText());
            } else if (ehRetornoFuncao) {
                //tipoVariavel = listaFuncoes.get(funcaoChamada); // testar
                tipoVariavel = tempTipoRetorno;
            } else {
                tipoVariavel = listaVariaveis.get(funcaoAtual).get(ctx.getStart().getText());
            }
            if (!tipoAceito.equals(tipoVariavel)) {
                int linha = ctx.getStart().getLine();
                int coluna = ctx.getStart().getCharPositionInLine() + 1;
                if (ehChamadaFuncao) {
                    erros.add("Erro semântico [" + linha + ", " + coluna + "]: O tipo da variável '" + ctx.getStart().getText() + "' (" + tipoVariavel + ") não é compatível com o tipo do parâmetro (" + tipoAceito + ") requerido pela função '" + funcaoChamada + "'");
                } else if (ehAtribuicao) {
                    erros.add("Erro semântico [" + linha + ", " + coluna + "]: O tipo da variável '" + ctx.getStart().getText() + "' (" + tipoVariavel + ") não é compatível com o tipo da variável " + variavelAtribuicao + " (" + tipoAceito + ")");
                } else {
                    erros.add("Erro semântico [" + linha + ", " + coluna + "]: O tipo da variável '" + ctx.getStart().getText() + "' (" + tipoVariavel + ") não é compatível com o tipo de retorno da função (" + tipoAceito + ")");
                }
                return;
            }
        }
        if (ehChamadaFuncao) {
            tempContadorParametros++;
            tempContadorParametrosRequeridosRestantes--;
        }
        if(ehAtribuicaoDeRetorno){
            definiuRetorno = true;
        }
    }

    @Override
    public void enterConstante(CSimplificadoParser.ConstanteContext ctx) {
        if (ctx.getStart().getText() == null) {
            return;
        }
        String valorConstante = ctx.getStart().getText();
        String tipoConstante = listaConstantes.get(valorConstante);
        listaConstantes.put(valorConstante, ObterTipoConstante(ctx.getStart().getType()));
    }

    private String ObterTipoConstante(int tokenID) {
        String nomeToken = lexer.getVocabulary().getSymbolicName(tokenID);
        switch (nomeToken) {
            case "TRUE":
            case "FALSE":
                return "boolean";
            case "NUM_DEC":
                return "float";
            case "NUM_INT":
                return "int";
            case "TEXTO":
                return "char";
        }
        return nomeToken;
    }

    @Override
    public void enterAtribuicao(CSimplificadoParser.AtribuicaoContext ctx) {
        if (ctx.ID() == null) {
            return;
        }
        System.out.println("Entrou na atribuição");

        if (!listaVariaveis.get(funcaoAtual).containsKey(ctx.ID().getText())) {
            int linha = ctx.getStart().getLine();
            int coluna = ctx.getStart().getCharPositionInLine() + 1;
            erros.add("Erro semântico [" + linha + ", " + coluna + "]: variável " + ctx.ID().getText() + " não declarada");
            return;
        }
        ehAtribuicao = true;
        tempTipoBase = listaVariaveis.get(funcaoAtual).get(ctx.ID().getText());
        variavelAtribuicao = ctx.ID().getText();

    }

    @Override
    public void exitAtribuicao(CSimplificadoParser.AtribuicaoContext ctx) {
        System.out.println("Saiu da atribuição");
        ehAtribuicao = false;
        tempTipoBase = "";
        variavelAtribuicao = "";
    }

    @Override
    public void enterDeclaracaoFuncao(CSimplificadoParser.DeclaracaoFuncaoContext ctx) {
        this.ehFuncao = true;
        this.funcaoAtual = ctx.ID().getText();
        this.listaVariaveis.put(funcaoAtual, new HashMap<>());

        if (ctx.ID() == null || ctx.tipoRetorno() == null) {
            return;
        }
        if (listaFuncoes.containsKey(ctx.ID().getText())) {
            int linha = ctx.getStart().getLine();
            int coluna = ctx.getStart().getCharPositionInLine() + 1;
            erros.add("Erro semântico [" + linha + ", " + coluna + "]: função " + ctx.ID().getText() + " já declarada");
            return;
        }

        tempParametrosAtuais = new ArrayList<>();
        if(!ctx.tipoRetorno().getText().equals("void")){
            precisaDefinirRetorno = true;
        }


        listaFuncoes.put(ctx.ID().getText(), ctx.tipoRetorno().getText());

        System.out.println("Entrou na funcao");
    }

    @Override
    public void enterTipoRetorno(CSimplificadoParser.TipoRetornoContext ctx) {
        if (ctx.getStart().getText() == null) {
            return;
        }
        System.out.println("Entrou no tipo retorno");
        tempTipoRetorno = ctx.getStart().getText();
        ehRetornoFuncao = true;
    }
    @Override
    public void enterRetorno(CSimplificadoParser.RetornoContext ctx) {
        if (ctx.getStart().getText() == null) {
            return;
        }
        System.out.println("Entrou no retorno");
        if(precisaDefinirRetorno){
            ehAtribuicaoDeRetorno = true;
        }
    }
    @Override
    public void enterParametros(CSimplificadoParser.ParametrosContext ctx) {
        if (ctx.ID() == null || ctx.tipoBase() == null) {
            return;
        }
        String tempTipoBase = ctx.tipoBase().getText();
        String tempNomeParametro = ctx.ID().getText();

        System.out.println("Entrou no parametros");
        if (listaVariaveis.get(funcaoAtual).containsKey(ctx.ID().getText())) {
            int linha = ctx.getStart().getLine();
            int coluna = ctx.getStart().getCharPositionInLine() + 1;
            erros.add("Erro semântico [" + linha + ", " + coluna + "]: variável " + tempNomeParametro + " já declarada");
            return;
        }

        tempParametrosAtuais.add(tempTipoBase);

        listaVariaveis.get(funcaoAtual).put(ctx.ID().getText(), tempTipoBase);
    }

    @Override
    public void enterListaParametros(CSimplificadoParser.ListaParametrosContext ctx) {
        if (ctx.ID() == null) {
            return;
        }
        String tempTipoBase = ctx.tipoBase().getText();
        String tempNomeParametro = ctx.ID().getText();
        if (listaVariaveis.get(funcaoAtual).containsKey(ctx.ID().getText())) {
            int linha = ctx.getStart().getLine();
            int coluna = ctx.getStart().getCharPositionInLine() + 1;
            erros.add("Erro semântico [" + linha + ", " + coluna + "]: variável " + tempNomeParametro + " já declarada");
            return;
        }

        tempParametrosAtuais.add(tempTipoBase);

        listaVariaveis.get(funcaoAtual).put(ctx.ID().getText(), tempTipoBase);
    }

    @Override
    public void exitDeclaracaoFuncao(CSimplificadoParser.DeclaracaoFuncaoContext ctx) {
        this.ehFuncao = false;
        this.ehRetornoFuncao = false;
        this.tempTipoRetorno = "";
        this.listaParametrosFuncoes.put(ctx.ID().getText(), tempParametrosAtuais);

        if(precisaDefinirRetorno){
            if(!definiuRetorno) {
                int linha = ctx.getStart().getLine();
                int coluna = ctx.getStart().getCharPositionInLine() + 1;
                erros.add("Erro semântico [" + linha + ", " + coluna + "]: função '" + ctx.ID().getText() + "' requer retorno do tipo '" + listaFuncoes.get(ctx.ID().getText()) + "'");
            }
        }
        precisaDefinirRetorno = false;
        definiuRetorno = false;
        ehAtribuicaoDeRetorno = false;

    }

    @Override
    public void enterChamadaFuncao(CSimplificadoParser.ChamadaFuncaoContext ctx) {
        if (ctx.ID() == null) {
            return;
        }
        int linha = ctx.getStart().getLine();
        int coluna = ctx.getStart().getCharPositionInLine() + 1;

        System.out.println("Entrou na chamada de funcao");
        if (!listaFuncoes.containsKey(ctx.ID().getText())) {
            erros.add("Erro semântico [" + linha + ", " + coluna + "]: função " + ctx.ID().getText() + " não declarada");
            return;
        }
        if(ehAtribuicao){
            String tipoAceito = listaVariaveis.get(funcaoAtual).get(variavelAtribuicao);
            String tipoRecebido = listaFuncoes.get(ctx.ID().getText());
            if(!tipoAceito.equals(tipoRecebido)){

                erros.add("Erro semântico [" + linha + ", " + coluna + "]: O tipo da variável '" + variavelAtribuicao + "' (" + tipoAceito + ") não é compatível com o tipo de retorno da função '" + ctx.ID().getText() + "' (" + tipoRecebido + ")");
                return;
            }
        }

        this.funcaoChamada = ctx.ID().getText();
        this.ehChamadaFuncao = true;
        this.tempContadorParametros = 0;
        this.tempParametrosAtuais = listaParametrosFuncoes.get(funcaoChamada);
        this.tempContadorParametrosRequeridosRestantes = tempParametrosAtuais.size();
    }

    @Override
    public void exitChamadaFuncao(CSimplificadoParser.ChamadaFuncaoContext ctx) {
        System.out.println("Saiu da chamada de funcao");
        this.ehChamadaFuncao = false;
        if (tempContadorParametrosRequeridosRestantes != 0) {
            int linha = ctx.getStart().getLine();
            int coluna = ctx.getStart().getCharPositionInLine() + 1;
            erros.add("Erro semântico [" + linha + ", " + coluna + "]: A função '" + funcaoChamada + "' requer " + listaParametrosFuncoes.get(funcaoChamada).size() + " argumento(s), mas " + tempContadorParametros + " atende(m) aos requisitos foi(ram) passado(s)");
        }
    }
}
