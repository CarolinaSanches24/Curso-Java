public class utilizandoMatrizes {
    public static void main(String[] args) {
        int[][] matriz ={{9,8,7},{5,3,2},{6,6,7}};
        int []maiorLinha = new int[3];
        int[]menorColuna= new int[3];
        for(int i=0; i<matriz.length;i++){
            maiorLinha[i]=0;
        }
        for(int itemColuna=0; itemColuna<matriz.length;itemColuna++){
            menorColuna[itemColuna]=10;
        }
        for(int i=0; i<matriz.length;i++){
            if(matriz[0][i]>maiorLinha[0]){
                maiorLinha[0]=matriz[0][i];
            }
        }
        for(int i=0; i<matriz.length;i++){
            if(matriz[1][i]>maiorLinha[1]){
                maiorLinha[1]=matriz[1][i];
            }
        }
        for(int i=0; i<matriz.length;i++){
            if(matriz[2][i]>maiorLinha[2]){
                maiorLinha[2]=matriz[2][i];
            }
        }
        for (int[] ints : matriz) {
            if (ints[0] < menorColuna[0]) {
                menorColuna[0] = ints[0];

            }
        }
        for (int[] ints : matriz) {
            if (ints[1] < menorColuna[1]) {
                menorColuna[1] = ints[1];

            }
        }
        for (int[] ints : matriz) {
            if (ints[2] < menorColuna[2]) {
                menorColuna[2] = ints[2];

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               if(maiorLinha[i]==menorColuna[j]){
                   System.out.println("Ponto de sela:"+maiorLinha[i]);
               }

            }

        }

        System.out.println("Maior elemento na linha 0:"+maiorLinha[0]+
                "\nMaior elemento da linha 1:"+maiorLinha[1]+
                "\nMaior elemento da linha 2:"+maiorLinha[2]);
        System.out.print("Menor elemento na coluna 0:"+menorColuna[0]+
                "\nMenor elemento da coluna 1:"+menorColuna[1]+
                "\nMenor elemento da coluna 2:"+menorColuna[2]);

    }
}
