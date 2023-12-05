public class Matrizes {
    public static void main(String[] args) {
        int [][]dados=new int[3][3];
        for (int i=0; i<dados.length;i++){
            for(int j=0; j<dados.length;j++){
                dados[i][j]=j;

            }
        }
        for (int[] dado : dados) {
            for (int i : dado) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
