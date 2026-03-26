import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Escreva um número de tres digitos: ");
        int nomero = teclado.nextInt();

        int dezena = (nomero / 10) % 10;
        System.out.println(" A dezena é: " + dezena);

    }
}
