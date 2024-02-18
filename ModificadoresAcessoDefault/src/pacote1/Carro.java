package pacote1;

public class Carro {
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibirCor() {
        System.out.println("Cor: " + cor);
    }
}