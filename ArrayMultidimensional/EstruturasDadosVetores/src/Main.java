import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];

        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um número:");
            vetor[i]= input.nextInt();
            soma+=vetor[i];
        }
        System.out.println(soma);
    }
}