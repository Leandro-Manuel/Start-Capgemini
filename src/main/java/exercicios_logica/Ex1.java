package exercicios_logica;
import java.util.Scanner;

/* 
Faça um algoritmo que receba dois números e exiba o resultado da sua soma.
*/
public class Ex1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("insira um numero: ");
        float numero1 = input.nextFloat();
        System.out.print("insira outro numero: ");
        float numero2 = input.nextFloat();
        
        System.out.println("Soma dos numeros: " + (numero1 + numero2));
    }         
}
