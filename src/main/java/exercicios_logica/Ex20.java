package exercicios_logica;
import java.util.Scanner;
/*
A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
*/
public class Ex20 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int qtdCarros = 0;
        int qtdCarros2000 = 0;
        
        float valorFinal = 0.0f;
        float valorDesconto = 0.0f;
        
        char opcao = 'S';
        while(opcao == 'S') {
            System.out.print("Digite o valor do carro: ");
            float valorCarro = input.nextFloat();
            System.out.print("Digite o ano do carro: ");
            int anoCarro = input.nextInt();
            
            if(anoCarro <= 2000) {
                valorDesconto = valorCarro * 0.12f;
                valorFinal = valorCarro - valorDesconto;
                qtdCarros2000++;
            }else {
                valorDesconto = valorCarro * 0.07f;
                valorFinal = valorCarro - valorDesconto;
                qtdCarros++;
            }
            
            System.out.println("Desconto: " + valorDesconto);
            System.out.println("Valor final: " + valorFinal);
            
            System.out.print("Deseja calcular desconto de outro carro? (S)-Sim / (N)-Não: ");
            opcao = input.next().charAt(0);
        }
        System.out.println("Total de carros até 2000: " + qtdCarros2000);
        System.out.println("Total de carros geral: " + (qtdCarros + qtdCarros2000));
    }
}
