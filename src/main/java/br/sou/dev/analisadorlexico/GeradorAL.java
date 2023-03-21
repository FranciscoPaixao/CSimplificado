/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.analisadorlexico;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GeradorAL {

    public static void main(String[] args) throws IOException {

        String pasta = Paths.get("").toAbsolutePath().toString() + "/src/main/java/br/sou/dev/analisadorlexico/";
        
        String caminho = pasta + "linguagem.flex";
        
        File arquivo = new File(caminho);

        jflex.Main.generate(arquivo);
        RemoverTexto(pasta + "AnalisadorLexico.java", "return null;");

    }

    public static void RemoverTexto(String arquivoCaminho, String texto) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(arquivoCaminho)));
            content = content.replaceAll(texto, "");
            FileWriter writer = new FileWriter(arquivoCaminho);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
