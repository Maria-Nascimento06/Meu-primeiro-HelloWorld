import java.util.Scanner;

public class calculadora {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um valor para calcular o dobro: ");
        double numero = scanner.nextDouble();

        double resultado = calcularDobro(numero);

        System.out.println("O dobro de " + numero + " é: " + resultado);
        scanner.close();
    }

    //pesquisa

    public static double calcularDobro(double numero) {
        return numero * 2;




        }
    }


