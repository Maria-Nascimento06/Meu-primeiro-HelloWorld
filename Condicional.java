public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2012;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 4.6;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento em que os cliente estão curtindo");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println();
        }

        }
    }