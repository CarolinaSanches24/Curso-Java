
import javax.swing.JOptionPane;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    Queue<Integer> filaPares = new LinkedList<>();

    public boolean FilaVazia(){
        return filaPares.isEmpty();
    }
    public  void FilaCheia(){
        if (filaPares.size() >= 5) {
            JOptionPane.showMessageDialog(null, "A fila está cheia.");
        } else {
            JOptionPane.showMessageDialog(null, "A fila não está cheia.");
        }

    }

    public void adicionarNumeroPar(int number){
        if (number % 2 == 0) {
            if (filaPares.size() < 10) {
                filaPares.add(number);
            } else {
                JOptionPane.showMessageDialog(null, "A fila está cheia. Não é possível adicionar mais números.");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número inteiro: ");
            int number = Integer.parseInt(input);
            main.adicionarNumeroPar(number);
        }

        JOptionPane.showMessageDialog(null,"Numeros Pares : "+main.filaPares);
        System.out.println(main.FilaVazia());
        main.FilaCheia();
    }
}