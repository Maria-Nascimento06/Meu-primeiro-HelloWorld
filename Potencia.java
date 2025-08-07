import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o número em que deseja elevar ao quadrado :");
        var value1 = scanner.nextInt();

        System.out.printf("A potencia de %s é %s\n", value1, Math.pow(value1, 2) );
    }
}
