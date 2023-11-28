import java.util.Scanner;
public class condicionalComposta {
    public static void main(String[]args){
     System.out.println("Estrutura Composta ");
    Scanner entrada = new Scanner(System.in);
     System.out.println("Informe a nota:");
    int nota = entrada.nextInt();
     if(nota>=5){
        System.out.println("Aprovado.\n Parabéns!");
    }else{
        System.out.println("Reprovado.");
    }
    }
}
