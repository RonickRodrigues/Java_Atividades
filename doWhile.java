import java.util.Scanner;

public class doWhile {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp = 0;
        char condicao = ' ';

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            temp = sc.nextDouble();
            temp = ((temp * 9) / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f", temp);
            System.out.println("Deseja repetir (s/n)?");
            sc.next().charAt(0);

        } while (condicao != 's');

        sc.close();
    }
}
