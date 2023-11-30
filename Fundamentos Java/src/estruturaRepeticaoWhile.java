import java.util.Scanner;
public class estruturaRepeticaoWhile {
    public static void main(String[]args){
        int opcao=1;
        while(opcao!=0) {
            System.out.println("Digite um valor qualquer ou 0 para sair");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
        }
    }
}
