import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
try {
    System.out.println("Digite um valor:");
    int valor = s.nextInt();
    System.out.println(valor);
}catch (Exception e){
    System.out.println("ERRO - Valor não é um número");

}
    }
}