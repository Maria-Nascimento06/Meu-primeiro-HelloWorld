import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        String nome = "maria";
        String tipoConta = "Corente";
        double saldo = 2000.00;
        double opcao = 0;
        

        System.out.println("*****************************");
        System.out.println("\nNome do cliente:" + nome);
        System.out.println("Tipo conta:" + tipoConta);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("\n***************************");
        
        String menu = """
              ** Digite sua conta **
              1 - Consultar saldo
              2 - Transferir valor
              3 - Receber valor
              4 - Sair
              """;

        Scanner leitura = new Scanner(System.in);
        
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextln();
            
            if(opcao == 1){
                System.out.println("Osaldo atualizado é" + saldo);
            } else if (opcao == 2 ){
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if(valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo:" + saldo);
                }
            } else if (opcao == 3 ){
                System.out.println("Valor recebido");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo" + saldo);
            } 
            

        


        }
    }
}