/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sou.dev.analisadorlexico;

import java.io.File;
import java.nio.file.Paths;

public class GeradorAL {

    public static void main(String[] args) {

        String rootPath = Paths.get("").toAbsolutePath(). toString();

        File file = new File(rootPath + "/src/main/java/br/sou/dev/analisadorlexico/linguagem.flex");

        jflex.Main.generate(file);

    }
}