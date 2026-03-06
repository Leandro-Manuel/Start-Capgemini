package exercicios;
import java.util.Scanner;

/*
Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
dos dois números lidos
*/

public class Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Digite um numero: ");
        numero1 = input.nextInt();
        System.out.print("Digite outro numero: ");
        numero2 = input.nextInt();
        
        System.out.println("A soma dos dois numeros e: " + (numero1 + numero2));
        System.out.println("A subtracao dos dois numeros e:" + (numero1 - numero2));
        System.out.println("A multiplicacao de dois numeros e: " + (numero1 * numero2));
        System.out.println("A divisao dos dois numeros e: " + (numero1 / numero2));
    }
    
}
