package pacote2;

import pacote1.Carro;

public class OutroPacote {
    public static void main(String[] args) {
        Carro carroAmarelo = new Carro();
        carroAmarelo.setCor("Amarelo");

        carroAmarelo.exibirCor();
    }
}