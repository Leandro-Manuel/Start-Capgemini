package exercicios_poo.atividade6;
import java.util.Scanner;

/*
atividade 6 da lista de exercicios de POO
*/

/*
neste exercicio eu aprendi que podemos usar verificacoes no metodo construtor,
mas o ideal seria utilizar verificacoes nos metodos set's da classe e usa-las no
metodo construtor, isso deixa o codigo muito facil de entender e legivel.
alem disso, quando fazemos verificacoes somente no metodo construtor, os metodos set
ainda poderam ser utilizados para burlar nossa regra 
*/

class Menu {
    public String getMenu() {
        return "Bem-vindo ao sistema!\nCadastre um item para receber a fatura!";
    }
}

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int numero, quantidade; String descricao; float preco;
        int continuar = 1;
        do {
            System.out.println(new Menu().getMenu());
            System.out.print("Insira o numero do item: ");
            numero = input.nextInt();
            input.nextLine();
            System.out.print("Insira a descricao do item: ");
            descricao = input.nextLine();
            System.out.print("Insira a quantidade comprada: ");
            quantidade = input.nextInt();
            System.out.print("Insira o preco unitario do produto: ");
            preco = input.nextFloat();
            
            var fatura = new Invoice(numero,descricao,quantidade,preco);
            System.out.println("Valor total da fatura: " + fatura.getInvoiceAmount());
            fatura.getRelatorio();
            System.out.println("Deseja continuar? 1-sim: ");
            continuar = input.nextInt();
        }while(continuar == 1);
    }
    
}
