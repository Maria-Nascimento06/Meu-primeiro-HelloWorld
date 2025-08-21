//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Lista de alunos e nota em matemática");

        Matematica minhaMateria = new Matematica();

        minhaMateria.getNome();
        minhaMateria.getNota();
        minhaMateria.setNome("Fernanda");
        minhaMateria.setNota(7.4);


        minhaMateria.getNome2();
        minhaMateria.getNota2();
        minhaMateria.setNome2("Luis");
        minhaMateria.setNota2(3.2);


        minhaMateria.getNome3();
        minhaMateria.getNota3();
        minhaMateria.setNome3("Alex") ;
        minhaMateria.setNota3(8.6);


        minhaMateria.getNome4();
        minhaMateria.getNota4();
        minhaMateria.setNome4("Gabriella");
        minhaMateria.setNota4(1.1);


        minhaMateria.getNome5();
        minhaMateria.getNota5();
        minhaMateria.setNome5("Ana");
        minhaMateria.setNota5(10.0);


        minhaMateria.exibeFichaTecnica();


        }
    }
