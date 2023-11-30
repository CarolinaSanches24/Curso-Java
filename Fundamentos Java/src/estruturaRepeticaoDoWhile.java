import java.util.Scanner;
public class estruturaRepeticaoDoWhile {
    public static void main (String[]args){
        int numero;
        do{
            System.out.println("Informe um número:\nPara sair Digite 0");
            Scanner entrada= new Scanner(System.in);
            numero= entrada.nextInt();
        }while(numero!=0);
        System.out.println("Encerrando o programa ...");
    }
}
