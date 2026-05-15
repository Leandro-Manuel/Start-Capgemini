package exercicios_logica;
import java.util.Scanner;
/*
Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua média (aritmética);
*/
public class Ex5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String nome = input.nextLine();
        float media = 0.0f;
        
        float[] notas = new float[3];
        for(int x=0; x<3; x++) {
            System.out.print("Insira sua " + (x+1) + " nota: ");
            notas[x] = input.nextFloat();
            media += notas[x];
        }
        
        System.out.println("------------");
        System.out.println("Média do aluno: " + media/3);
        
    }
}
