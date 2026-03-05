/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var vendedor = new Vendedor();
        vendedor.setNome("Leandro");
        vendedor.setCpf("123");
        vendedor.setDataNascimento(new Date());
        vendedor.setSalario(1000.0f);
        vendedor.setComissaoPorItem(55.50f);
        vendedor.setTotalItensVendidos(64);
        
        System.out.println("Salário final: " + vendedor.calcularSalario());
        
        var motorista = new Motorista();
    }
 }
