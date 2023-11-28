import java.util.Scanner;

public class switchCase {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar aluno:");
        System.out.println("2- Cadastrar Notas:");
        System.out.println("3 - Listar alunos e nota:");

        int numero = entrada.nextInt();
        switch(numero) {
            case 1:
                System.out.println("Vamos cadastrar Aluno");
                break;
            case 2:
                System.out.println("Vamos cadastrar nota");
            case 3:
                System.out.println("Listar Alunos");
                break;
            default:
                System.out.println("O numero e invalido!");
        }
    }
}
