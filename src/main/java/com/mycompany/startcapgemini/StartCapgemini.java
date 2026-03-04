package com.mycompany.startcapgemini;

import java.util.Scanner;

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
        var nome = input.nextLine();
        System.out.println(new Greetings().getSalute(nome));
        input.close();
        
        // comentário de linha
        
        /* 
            comentários em blocos
            varias linhas
        */
        
        /** 
            comentários de documentação
        */
        
        int idade = 10;
        float peso = 15.5f;
        double peso_mais = 15.555d;
        char letra = 'd';
        byte ponto = 2;
        boolean ativo = true;
        String name = "Leandro";
        
        System.out.println(ativo);
    }
}
