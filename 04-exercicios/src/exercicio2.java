import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" CELCIUS PARA FAHRENHEINT");

        System.out.println(" Digite valor CELCIUS :");
        double celcius = sc.nextDouble();

        double farenheint = celcius*9/5+32;
        System.out.println(" O valor em FAHRENHEINT é: "+ farenheint);


    }
}
