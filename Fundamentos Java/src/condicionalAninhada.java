import java.util.Scanner;
public class condicionalAninhada {
    public static void main(String[]args){
        System.out.println("Condicional Aninhada ");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma nota: ");
        int nota = entrada.nextInt();
        if(nota>=5){
            System.out.println("Aprovado");
        }else if(nota>=3 && nota<5){
            System.out.println("Exame");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }
}
