public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());



        Nome meuNome = new Nome();
        meuNome.meuNome = "Maria Eduarda";
        meuNome.idade = 19;
        meuNome.corFavorita = "Amarelo";
        meuNome.comidaFavorita = "Lasanha";

        meuNome.exibeFichaTecnica();


        Carro meuCarro = new Carro();
        meuCarro.nome = "Onix Premier";
        meuCarro.anoDeLancamento = 2012;
        meuCarro.marca = "Chevrolet Onix";
        meuCarro.ipvaPago = 265252;
        meuCarro.somaDasAvaliacoes = 9;
        meuCarro.totalDeAvaliacao = 5;

        meuCarro.exibeFichaTecnica();
        meuCarro.avalia(2);
        meuCarro.avalia(8);
        meuCarro.avalia(5);

        System.out.println(meuCarro.somaDasAvaliacoes);
        System.out.println(meuCarro.totalDeAvaliacao);
        System.out.println(meuCarro.pegaMedia());









    }
}