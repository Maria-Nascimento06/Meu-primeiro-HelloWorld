import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        // Igual a
        if (numero1 == numero2) {
            System.out.println(numero1 + " é igual a " + numero2);
        } else {
            System.out.println(numero1 + " não é igual a " + numero2);
        }

        // Diferente de
        if (numero1 != numero2) {
            System.out.println(numero1 + " é diferente de " + numero2);
        }

        // Maior que
        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        }

        // Menor que
        if (numero1 < numero2) {
            System.out.println(numero1 + " é menor que " + numero2);
        }

        // Maior ou igual a
        if (numero1 >= numero2) {
            System.out.println(numero1 + " é maior ou igual a " + numero2);
        }

        // Menor ou igual a
        if (numero1 <= numero2) {
            System.out.println(numero1 + " é menor ou igual a " + numero2);
        }
    }
}
