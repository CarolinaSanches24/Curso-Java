import java.util.Scanner;

class Excecao extends Exception{
    public Excecao(String message){
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       int opcao = 1 ;

       do{
           System.out.println("Digite o número 1 ou 2: ");

           try{
               opcao= input.nextInt();
               switch (opcao){
                   case 1:
                       System.out.println("Você digitou a opção "+opcao);
                       break;
                   case 2:
                       System.out.println("Você digitou a opção "+opcao);
                       break;
                   default:
                       throw new Excecao("Erro: Opção inválida!");

               }
           }catch (Excecao excecao){
               System.out.println(excecao.getMessage());
           }finally {
               System.out.println("------- fim do programa --------");
           }
       }while(opcao!=0);
    }
}