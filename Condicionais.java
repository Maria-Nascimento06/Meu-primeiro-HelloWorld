import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        var name = scanner.next();

        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();

        System.out.println("Voce é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.println("Bem vindo :)");
            System.out.printf("%s, voce tem %s anos e pode dirigir \n", name, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, apesar de voce ter %s anos, voce é emancipado é pode dirigir \n", name, age);
        } else {
            System.out.printf("%s, voce não pode dirigir \n", name);
        }

        System.out.println("Fim da execução");
    }
}
