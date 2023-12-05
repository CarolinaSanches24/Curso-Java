public class Main {
    public static void main(String[] args) {

        Cao cachorro= new Cao();
        cachorro.nome="Bob";
        cachorro.Anda();
        Cao dog = new Cao("Yuri",5);
        dog.DadosCao();

        Aluno a = new Aluno();
        a.setNome("João");
        System.out.println(a.getNome());

        Usuario user = new Usuario();
        user.setIdade(5);
        if(user.VerificarIdade()){
            System.out.println("ele é idoso");
        }else{
            System.out.println("é novinho");
        }

    }
}