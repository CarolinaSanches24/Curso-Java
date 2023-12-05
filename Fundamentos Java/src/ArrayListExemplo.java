import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExemplo {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();
        System.out.println("Nome do usuário:");
        Scanner entrada= new Scanner(System.in);
        String nome = entrada.next();
        usuarios.add(nome);
        System.out.println(usuarios);

        usuarios.add(usuarios.indexOf(nome),nome);
        System.out.println(usuarios);
        usuarios.remove(nome);
        System.out.println(usuarios);
        usuarios.clear();
        System.out.println(usuarios);
    }
}
