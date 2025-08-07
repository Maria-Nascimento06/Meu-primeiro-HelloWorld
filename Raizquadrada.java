import java.util.Scanner;

public class Raizquadrada {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o número em que deseja saber a raiz quadrada:");
        var value1 = scanner.nextInt();

        System.out.printf("A raiz quadrada de %s é %s\n", value1, Math.sqrt(value1) );


    }
}
