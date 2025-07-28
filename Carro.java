public class Carro {
    String nome;
    int anoDeLancamento;
    String marca;
    int ipvaPago;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;

    //metodo

    void exibeFichaTecnica() {
        System.out.println("O carro é:" + nome);
        System.out.println("O seu ano de Lançamento é:" + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacao;

    }
}










