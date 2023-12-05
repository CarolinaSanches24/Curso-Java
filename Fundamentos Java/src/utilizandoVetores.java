public class utilizandoVetores {
    public static void main(String[] args) {
        int [] passarosPorDia={2,5,0,7,4,1,3,0,2,5,0,1,3,1};

        int numeroTotalPassaros = 0;
        int numeroTotalPassarosSemana = 0;
        int numeroTotalPassarosSegundaSemana = 0;
        for(int i=0; i<passarosPorDia.length;i++){
            numeroTotalPassaros+=passarosPorDia[i];
        }
        for(int x=0; x<7;x++){
            numeroTotalPassarosSemana+=passarosPorDia[x];
        }
        for(int z=7; z<14;z++){
            numeroTotalPassarosSegundaSemana+=passarosPorDia[z];
        }
        System.out.println("Número total de pássaros:"+numeroTotalPassaros+
                "\nNúmero total pássaros na primeira semana:"+numeroTotalPassarosSemana+
                "\nNúmero total de pássaros na segunda semana:"+numeroTotalPassarosSegundaSemana);
    }
}
