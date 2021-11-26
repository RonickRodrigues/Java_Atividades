import java.util.Scanner;

public class TestBitABit {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000; //pode ser o numero 32 que convertido em numero binário é 0010 0000, a sigla 'ob' antes do valor da variavel mask representa que o numero inserido é um numero binário
        int n = sc.nextInt();

        if((n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }

        sc.close();
    }
}
