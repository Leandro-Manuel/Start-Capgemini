/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Insira o nome da pessoa: ");
        String nome = input.nextLine();
        System.out.print("Insira a altura da pessoa: ");
        float altura = input.nextFloat();
        System.out.print("Insira o peso da pessoa: ");
        float peso = input.nextFloat();
        
        Pessoa pessoa1 = new Pessoa(nome,altura,peso);
        System.out.println("IMC: " + pessoa1.calcularIMC());
        
        Pessoa pessoa2 = new Pessoa();
        System.out.print("Insira o nome da pessoa: ");
        pessoa2.setNome(input.next());
        System.out.print("Insira a altura da pessoa: ");
        pessoa2.setAltura(input.nextFloat());
        System.out.print("Insira o peso da pessoa: ");
        pessoa2.setPeso(input.nextFloat());
        
        System.out.println("IMC: " + pessoa2.calcularIMC());
        
    }
}
