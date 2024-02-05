import java.util.Scanner;
import java.util.ArrayList;
public class For {
    public static void main(String[] args) {
        double media;

        Scanner input = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i <=5; i++) {
            System.out.println("Aluno "+(i+1));
            System.out.println("Digite a " +(i+1)+"ª nota:");
            double nota = input.nextDouble();
            notas.add(nota);
        }

            double soma = 0;
            for (double nota:notas){
                soma+= nota;
            }
             media = soma/notas.size();
        System.out.println("A média das notas é: "+media);

    }
}
