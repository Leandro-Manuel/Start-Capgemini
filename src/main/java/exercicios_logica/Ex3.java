package exercicios_logica;

import java.util.Scanner;

/*
Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
total percorrida pelo automóvel e o total de combustível gasto;
*/

class Calculo {
    public float calcularConsumo(float distanciaKm, float combustivelLitro) {
        return distanciaKm / combustivelLitro;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var calculo = new Calculo();
        System.out.print("Insira a distancia percorrida em KM: ");
        float distancia = input.nextFloat();
        System.out.print("Insira a quantidade de combustivel gasto em litro: ");
        float combustivel = input.nextFloat();
        
        System.out.println("O consumo médio de combustivel por km e: " + calculo.calcularConsumo(distancia, combustivel) + " KM/L");
    }
}
