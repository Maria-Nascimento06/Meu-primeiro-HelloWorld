import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] perguntas = {
                "Qual é o animal simbolo da fauna brasileira❓",
                "Qual é o nome do famoso carnaval que ocorre em Salvador?❓",
                "Qual é o estado brasileiro conhecido por sua rica cultura afro-brasileira❓",
                "Qual é a festa popular brasileira que ocorre antes da Quaresma❓",
                "Qual é o instrumento musical típico do Nordeste brasileiro❓"
        };

        String[] respostas = {
                "onça-pintada",
                "carnaval de salvador",
                "bahia",
                "carnaval",
                "sanfona"
        };
        int pontos = 0;

        System.out.println(" \uD83D\uDCAA\uD83C\uDFFB Bem-vindo ao Quiz da Cultura Brasileira!");

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + perguntas[i]);
            String respostaUsuario = leitor.nextLine();

            if (respostaUsuario.equalsIgnoreCase(respostas[i])) {
                System.out.println("✅ Correto!");
                pontos++;
            } else {
                System.out.println("❌ Errado. A resposta certa é: " + respostas[i]);
            }
            System.out.println(); // Espaço entre perguntas
        }

        System.out.println("🏆 Você acertou\n" + pontos + "\nde\n" + perguntas.length + " perguntas.");

        double mediaAcertos = 0;
        double acertos = 0;
        int totalDeAcertos = 0;

        if (acertos <= 4) {
            System.out.println("Parabéns! Tu é um rei da cultura BR \uD83E\uDD73\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");
        } else {
            System.out.println("Quem sabe mais na próxima :( \uD83D\uDC94");

            System.out.println();
        }





        }
    }



