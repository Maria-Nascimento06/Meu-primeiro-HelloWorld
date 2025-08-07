import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Quantos anos voce tem?");
        var age = scanner.nextInt();

        System.out.println("Voce é emancipado?");
        var isEmancipated = scanner.nextBoolean();

        var canDrive = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Voce pode dirigir? (%s)", canDrive);

    }
}
