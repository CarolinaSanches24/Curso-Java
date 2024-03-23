import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int [][]matriz = new int [5][5]; //[linhas][colunas]
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                sum +=matriz[i][j];
            }
        }
        System.out.println("A soma dos 25 valores é:" +sum);


    }
}