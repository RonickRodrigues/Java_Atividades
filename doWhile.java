import java.util.Locale;
import java.util.Scanner;

public class doWhile {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char condicao = ' ';

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double temp = sc.nextDouble();
            temp = ((temp * 9) / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", temp);
            System.out.println("Deseja repetir (s/n)?");
            condicao = sc.next().charAt(0);

        } while (condicao != 'n');

        sc.close();
    }
}
