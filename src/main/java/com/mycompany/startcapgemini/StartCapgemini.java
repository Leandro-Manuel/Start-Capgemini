/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.startcapgemini;

import java.util.Scanner;

/**
 *
 * @author niifh
 */

class Greetings {
    public String getGreetings() {
        return "Olá mundo!";
    }
    public String getSalute(String nome) {
        return "Bem-vindo, " + nome;
    }
}

public class StartCapgemini {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println(new Greetings().getGreetings());
        System.out.println("Insira seu nome: ");
        String nome = input.nextLine();
        System.out.println(new Greetings().getSalute(nome));
    }
}
