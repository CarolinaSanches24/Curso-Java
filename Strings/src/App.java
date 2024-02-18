public class App {
    public static void main(String[] args){
        String nome = "Carol";
        String sobrenome = "Moraes";
        String nomeGuerra = new String("Carol");

        if(nome==nomeGuerra){
            System.out.println("Nomes iguais");
        }else{
            System.out.println("Nomes diferentes");
        }
        if (nome==sobrenome){
            System.out.println("Nomes iguais");
        }else{
            System.out.println("Nomes diferentes");
        }

        Equals equals = new Equals();
        equals.mostrarResultado(nome, nomeGuerra);

        MetodosStrings metodos = new MetodosStrings();

        metodos.mostrarMetodosStrings(nome);

        StringManipulator manipulator = new StringManipulator();
        manipulator.metodoBuffer(nome,sobrenome);

    }
}
