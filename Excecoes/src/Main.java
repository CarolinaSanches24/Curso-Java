import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o dividendo: ");
        Integer dividendo = input.nextInt();

        System.out.println("Informe o divisor");
        Integer divisor = input.nextInt();

        try{
            if(divisor ==0){
                throw new ArithmeticException("Divisão por zero");
            }

            Integer quociente = dividendo/divisor;
            System.out.println("Resultado: "+quociente);
        }catch (ArithmeticException e){
            System.out.println("Causa: "+e.getCause());
            System.out.println("Mensagem: "+e.getMessage());
            System.out.println("Tipo de exceção: "+e.getClass().getCanonicalName());
            System.out.println("Ops! Não foi possível obter o resultado");
        }

        MultiplasExcessoes excecao = new MultiplasExcessoes();
        excecao.multiplaExcecao();

        ArrayException array = new ArrayException();
        array.exemploArrayException();

    }
}