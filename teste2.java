import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();
        if (numero > 0 ){
            System.out.println("O número é positivo ");
        } else if (numero < 0) {
            System.out.println(numero + " é um número negativo.");
        } else {
            System.out.println(numero + " O número é zero.");
        }


        }



    }

