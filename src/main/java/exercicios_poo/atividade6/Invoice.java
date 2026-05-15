package exercicios_poo.atividade6;

public class Invoice {
    private int numero_item;
    private String descricao;
    private int quantidade;
    private float preco;
    
    public Invoice(int numero, String descricao, int qtd, float precoo) {
        this.setNumero_item(numero);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPreco(preco);     
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
        if(quantidade < 0) {
            this.quantidade = 0;
        }else {
            this.quantidade = quantidade;
        }
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    public void setPreco(float preco) {
        if(preco < 0) {
            this.preco = 0.0f;
        } else {
            this.preco = preco;
        }
    }
    
    public double getInvoiceAmount() {
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
