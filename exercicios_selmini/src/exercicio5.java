import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" Adicione hora trabalhada:");
        int hora = sc.nextInt();


        System.out.println(" Adicione valor hora-aula: ");
        double valor = sc.nextDouble();

        double salario_bruto = hora*valor;

        double inss = salario_bruto*22/100;
        System.out.println("O valor do inss é: ");
        double salario_liquido = salario_bruto-inss;
        System.out.println("Seu salário é: "+ salario_liquido);

    }
}
