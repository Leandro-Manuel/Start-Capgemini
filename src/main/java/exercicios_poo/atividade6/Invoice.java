/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_poo.atividade6;

public class Invoice {
    private int numero_item;
    private String descricao;
    private int quantidade;
    private float preco;
    
    public Invoice(int numero, String descricao, int qtd, float precoo) {
        if(qtd < 0) {
            this.quantidade = 0;
        }else {
            this.quantidade = qtd;
        }
        if(precoo < 0) {
            this.preco = 0.0f;
        }else {
            this.preco = precoo;
        }
        this.numero_item = numero;
        this.descricao = descricao;
    }
    
    public int getNumero_item() {
        return this.numero_item;
    }
    
    public void setNumero_item(int numero) {
        this.numero_item = numero;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public float getInvoiceAmount() {
        return quantidade * preco;
    }
    
    public void getRelatorio() {
        System.out.println("---------------------");
        System.out.println("Número do item: " + this.numero_item);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço unitário: " + this.preco);
        System.out.println("Preço total a pagar: " + getInvoiceAmount());
        System.out.println("---------------------");
    }
}
