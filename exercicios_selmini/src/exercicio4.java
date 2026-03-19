import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioMinimo, valorKwatt, conta;
        int qtdKwatt;

        System.out.println(" Informe o valor do salário mínimo : R$ ");
        salarioMinimo = teclado.nextDouble();
        System.out.println(" Informe a quantidade de quilowatt: ");
        qtdKwatt = teclado.nextInt();

        valorKwatt = salarioMinimo / 7 / 100;
        conta = qtdKwatt*valorKwatt;

        System.out.println(" Valor da conta: R$ " + conta);
        System.out.println(" Valor do quilowatt: R$ "+valorKwatt);
        System.out.println(" Valor da conta com 10% de desconto: R$ " + conta * 0.90 );




    }
}
