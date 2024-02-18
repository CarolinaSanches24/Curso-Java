public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.teste = 9.0;
        aluno.prova = 7.5;
        aluno.setNome("Lorenzo");

        Professor professor = new Professor();
        professor.setNome("Oswaldo");
        professor.setSalario(1000);

        System.out.println(aluno.getMedia());
        System.out.println(aluno.getNome());


        System.out.println("Professor: "+professor.getNome());
        System.out.println("Salario líquido: "+ professor.getSalario());
    }
}