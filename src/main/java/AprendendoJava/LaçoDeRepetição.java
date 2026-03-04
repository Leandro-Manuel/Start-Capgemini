/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendendoJava;
import java.util.Scanner;
public class LaçoDeRepetição {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        for(int x=0; x<=10; x++) {
            System.out.println("O valor de X é " + x);
        }
        
        System.out.println("Digite um numero menor que 10: ");
        
        int numero = input.nextInt();
        // podemos utilizar variavel fora do for e incremento dentro do escopo do laco de repeticao
        for(; numero <= 10;) {
            System.out.println("O numero é " + numero);
            numero++;
        }
    }
    
}
