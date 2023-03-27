package br.sou.dev.analisadorlexico.classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Francisco
 */
public class TipoAnalise {
    public String token;
    public String lexema;
    public String descricao;
    public int linha;
    public int coluna;
    public boolean status;

    public TipoAnalise(String nome, String lexema, String descricao, int linha, int coluna, boolean status) {
        this.token = nome;
        this.lexema = lexema;
        this.descricao = descricao;
        this.linha = linha;
        this.coluna = coluna;
        this.status = status;
    }


}
