/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/* 
Faça um algoritmo que receba "N" numeros e mostre positivo, negativo ou zero para cada numero
*/
import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
       var input = new Scanner(System.in); 
       System.out.println("Quantidade de numeros: ");
       int quantidade = input.nextInt();
       for(int x=0; x<quantidade; x++) {
           System.out.println("Insira um numero: ");
           int numero = input.nextInt();
           if(numero != 0) {
               if(numero > 0) {
                   System.out.println("O número é positivo!");
               } else {
                   System.out.println("O número é negativo!");
               }
           } else {
               System.out.println("O número é 0!");
           }
       }
       
    }
}
