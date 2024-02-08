public class Main {
    public static void main(String[] args) {
        int [][] matriz = new int[2][3]; //linhas e colunas

        matriz[0][0] = 1; //primeira linha 0 primeira coluna 0
        matriz[0][1]=2; // primeira linha segunda coluna
        matriz [0][2]= 3; // primeira linha terceira coluna
        matriz [1][0]= 4; //segunda linha primeira coluna
        matriz [1][1]= 5; // segunda linha segunda coluna
        matriz [1][2] = 6; // segunda linha terceira coluna

        // Imprime a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}