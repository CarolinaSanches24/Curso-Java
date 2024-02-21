import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplasExcessoes {
    Scanner scanner = new Scanner(System.in);
    int valor;

    void multiplaExcecao(){
    try{
        System.out.println("Digite o numerador: ");
        valor = scanner.nextInt();

        int resultado = valor/3;
        System.out.println(resultado);
    }catch(ArithmeticException erro) {
        System.out.println("AritmeticException => "+ erro.getMessage());
    }catch(InputMismatchException err) {
        System.out.println("InputMismatchException => "+err.getMessage());
    }catch(Exception er){
        System.out.println("Exception: => "+ er.getMessage());
    }finally{
        System.out.println("Fim");
    }
    }
}
