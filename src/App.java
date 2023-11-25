import java.util.Scanner;
public class App {
    public static void main(String[] args){
        System.out.println("Informe seu nome");

        String palavra;
        Scanner entrada = new Scanner(System.in);
        palavra= entrada.next();
        System.out.println(palavra);
    }
}
