import discentes.Aluno;
import discentes.AlunoSuperior;

public class Main {
    public static void main(String[] args) {
        AlunoSuperior aluno = new AlunoSuperior();

//        aluno.nome = "Carol";
        aluno.setNome("Carol");
        aluno.teste = 9;
        aluno.prova = 10;
        System.out.println(aluno.getMedia());
        System.out.println(aluno.getNome());
    }
}