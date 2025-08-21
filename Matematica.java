public class Matematica {
    private String nome;
    private double nota;
    private String nome2;
    private double nota2;
    private String nome3;
    private double nota3;
    private String nome4;
    private double nota4;
    private String nome5;
    private double nota5;

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setNome4(String nome4) {
        this.nome4 = nome4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public void setNome5(String nome5) {
        this.nome5 = nome5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public String getNome2() {
        return nome2;
    }

    public double getNota2() {
        return nota2;
    }

    public String getNome3() {
        return nome3;
    }

    public double getNota3() {
        return nota3;
    }

    public String getNome4() {
        return nome4;
    }

    public double getNota4() {
        return nota4;
    }

    public String getNome5() {
        return nome5;
    }

    public double getNota5() {
        return nota5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    void exibeFichaTecnica(){
        System.out.println("O aluno:" + nome);
        System.out.println("Tem a nota:" + nota);
        System.out.println("O aluno:" + nome2 );
        System.out.println("Tem a nota:" + nota2);
        System.out.println("O aluno:" + nome3);
        System.out.println("Tem a nota:" + nota3);
        System.out.println("O aluno:" + nome4);
        System.out.println("Tem a nota:" + nota4);
        System.out.println("O aluno:" + nome5);
        System.out.println("Tem a nota:" + nota5);
    }
}
