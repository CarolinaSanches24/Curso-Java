import java.util.Random;
import java.util.Scanner;
public class loteria {
    public static void main(String[] args) {
        System.out.println("Sistema Loteria");
        Random gerador = new Random();
        int numero = gerador.nextInt(100);
        System.out.println("Informe o número da sua Aposta:");
        Scanner entrada = new Scanner(System.in);
        int aposta = entrada.nextInt();
       if(aposta ==numero){
           System.out.println("Parabéns");
       }else{
           System.out.println("Fim de Jogo");
       }
       System.out.println("O número sorteado foi:" + numero);
    }
}
