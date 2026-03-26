import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Escreva seu numero: ");

        int numero = teclado.nextInt();

        int unidade = numero%10;
        numero /=10;
        int dezena = numero%10;
        numero /=10;
        int centena = numero%10;

        int invertido = unidade*100 + dezena*10 + centena;
        System.out.println(" Seu numero inverso é: " + invertido);



    }
}
