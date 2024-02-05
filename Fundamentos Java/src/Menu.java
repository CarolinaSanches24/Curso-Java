import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        char character = '-';
        int repeat = 30;
        String repeatString = String.valueOf(character).repeat(repeat);
        Scanner input = new Scanner(System.in);
        int opcao;
        String funcao = "";

        do {
            System.out.println(repeatString);
            System.out.println("Menu Principal");
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("[1] - Aluno\n"+
                               "[2] - Professor\n"+
                               "[3] - Coordenador\n"+
                               "[0] - Sair\n");

            System.out.println("Qual opcao deseja?:");
            opcao = input.nextInt();

            if(opcao == 0)
                break;

            switch (opcao){
                case 1 :
                    funcao = "Aluno";
                    break;
                case 2:
                    funcao = "Professor";
                    break;
                case 3:
                    funcao = "Coordenador";
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Você Selecionou a opção "+ funcao);
        }while(true);
        System.out.println("Fim");
    }
}
