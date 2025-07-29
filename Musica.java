public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    //metodo

    void exibeFichaTecnica() {
        System.out.println("A musica é:" + titulo);
        System.out.println("Feito pelo artista:" + artista);
    }

    void avalia (double nota ){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double pegaMedia(){
        return avaliacao / numAvaliacoes;
    }



}
