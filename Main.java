import java.util.Scanner; //<--- Aqui eu importei um interpretador de JAVA para ajudar o JAVA a entender o que o usuario digita

class Banco { //<-- criando uma classe chamada banco
    private double quantidade; //<-- aqui eu criei uma função que não sera chamada, para o JAVA entender que estou 
    private double meses;
    
    
    public Banco(double quantidade, double meses) {
        this.quantidade = quantidade;
        this.meses = meses;
    }
    
    public double calcularBanco() {
        return quantidade * meses / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a quantidade: ");
        int quantidadeInt = entrada.nextInt();
        
        System.out.print("Digite o tempo que quer deixar: ");
        int mesesInt = entrada.nextInt();
        
        Banco ret = new Banco(quantidadeInt, mesesInt);
        
        double Banco = ret.calcularBanco();
        
        System.out.println("Seu total é de R$: " + Banco);
    }
}