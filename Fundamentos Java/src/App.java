import java.util.Scanner;
public class App {
    public static void main(String[] args){
        // System.out.println("Informe seu nome");

        // String palavra;
        // Scanner entrada = new Scanner(System.in);
        // palavra= entrada.next();
        
        // System.out.println("Operadores Aritméticos");

        // double numA, numB, total;
        // numA=5;
        // numB=3;
        // total = numA+numB;
        // System.out.println(total);
        // total = numA/numB;
        // System.out.println(total);
        // total = numA%numB;
        // System.out.println(total);
        // System.out.println("Operadores Lógicos");
        // int a,b;
        // a= 4;
        // b=8;
        // System.out.println( a>b &&b==8);
        // System.out.println( a>b ||b==8);
        // System.out.println("Estrutura Condicional Simples");
        // int nota = 6;
        // if(nota>=5){
        //     System.out.println("Aprovado\n Parabéns!" + palavra);
        // }
        // System.out.println("Estrutura Composta ");
        //  int nota = 6;
        // if(nota>=5){
        //     System.out.println("Aprovado.\n Parabéns!" + palavra);
        // }else{
        //     System.out.println("Reprovado.\n Parabéns!" + palavra);
        // }
        // System.out.println("Condicional Aninhada ");
        // int nota = 2;
        // if(nota>=5){
        //     System.out.println("Aprovado");
        // }else if(nota>=3 && nota<5){
        //     System.out.println("Exame");
        // }else{
        //     System.out.println("Aluno Reprovado");
        // }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar aluno:");
        System.out.println("2- Cadastrar Notas:");
        System.out.println("3 - Listar alunos e nota:");

        int numero = entrada.nextInt();
        switch(numero){
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
