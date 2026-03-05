package classes;

public class Pessoa {
    private String nome;
    private float altura;
    private float peso;
    
    public Pessoa(String nome, float altura, float peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }
    
    public Pessoa() {
        
    }
    
    public float calcularIMC() {
        float result = peso / (altura * altura);
        return result;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getAltura() {
        return this.altura;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getPeso() {
        return this.peso;
    }
}
