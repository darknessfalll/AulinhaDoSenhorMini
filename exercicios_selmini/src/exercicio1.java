import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Insira valor da base : ");
        double base = sc.nextDouble();
        System.out.println(" Valor da base é:"+base);


        System.out.println("Insira valor da altura:");
        double altura = sc.nextDouble();
        System.out.println(" Valor da altura é: "+ altura);

        double perimetro = 2*( base + altura);
        System.out.println(" O perimetro é: "+ perimetro);

    }
}

