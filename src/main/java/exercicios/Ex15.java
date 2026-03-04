package exercicios;
// Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Insira um numero inteiro: ");
        int numero = input.nextInt();
        
        if(numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo de 100 a 200.");
        } else {
            System.out.println("Não está no intervalo!");
        }
    }
}
