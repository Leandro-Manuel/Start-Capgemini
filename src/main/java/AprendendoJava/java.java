package AprendendoJava;
public class java {
    public static void main(String[] args) {
        int media = 7;
        if(media >= 7) {
            if(media == 10) {
                System.out.println("Aprovado com nota máxima!");
            } else {
                System.out.println("Aprovado!");
            }
        } else {
            System.out.println("Reprovado");
        }
        
        int mes = 5; 
        
        switch(mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2: 
                System.out.println("Fevereiro");
                break;
            default: 
                System.out.println("Desconhecido!");
        }
    }
}
