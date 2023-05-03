/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.sou.dev.csimplificado;

import br.sou.dev.classes.Controlador;
import br.sou.dev.classes.DescSimbolo;
import java.io.IOException;

/**
 *
 * @author Francisco
 */
public class TesteControlador {

    public static void main(String[] args) throws IOException {
        Controlador controlador = new Controlador();
        String arquivo = "C:\\Users\\Francisco\\Documents\\teste.c";
        controlador.LerArquivo(arquivo);
        controlador.FazerAnalise();
        System.out.println("teste");
        System.out.println(controlador.errorListener.getLexicalErrors());

    }
}
