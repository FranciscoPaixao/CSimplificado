/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.analisadorlexico;

/**
 *
 * @author Francisco
 */
public class ALToken {
    public String nome;
    public String valor;
    public String descricao;
    public int linha;
    public int coluna;
    public boolean status;

    public ALToken(String nome, String valor, String descricao, int linha, int coluna, boolean status) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.linha = linha;
        this.coluna = coluna;
        this.status = status;
    }


}
