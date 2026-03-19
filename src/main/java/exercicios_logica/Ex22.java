/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_logica;
import java.util.Scanner;
// Escreva um algoritmo que receba o preço de custo e o preço de venda de 40 produtos
// mostre como resultado se houve lucro, prejuizo ou empate para cada produto. 
// informe o valor de custo de cada produto, o valor de venda de cada produto, 
// a media de preco de custo e do preco de venda.
public class Ex22 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        float valor_custo, valor_venda; 
        float media_preco_custo = 0.0f;
        float media_preco_venda = 0.0f;
        for(int x=1; x<=40; x++) {
           
            System.out.println("Insira o valor de custo do produto " + x + ": ");
            valor_custo = input.nextFloat();
            media_preco_custo += valor_custo;
            
            System.out.println("Insira o valor da venda do produto " + x + ": ");
            valor_venda = input.nextFloat();
            media_preco_venda += valor_venda;
            
            if(valor_custo == valor_venda) {
                System.out.println("Não houve lucro!");
            } else {
                if(valor_venda > valor_custo) {
                    System.out.println("Houve lucro!");
                } else {
                    System.out.println("Houve prejuízo!");
                }
            }
            System.out.println("Valor de custo do produto: " + valor_custo);
            System.out.println("Valor de venda do produto " + valor_venda);
        }
        media_preco_custo /= 40;
        media_preco_venda /= 40;
        System.out.println("A media de preco de custo foi: " + media_preco_custo + " reais.");
        System.out.println("A media de preço de venda foi: " + media_preco_venda + " reais.");
    }
}
