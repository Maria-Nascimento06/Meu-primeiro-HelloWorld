import java.util.Scanner;

public class Aritmeticos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        var value1 = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        var value2 = scanner.nextInt();

        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2 );

    }
}


//podendo trocar "+" por "/" para fazer outras contas, assim em diante
//Mudando o "scanner.nextInt();" para "scanner.nextFloat();" quando quiser numeros com ponto/vírgula
