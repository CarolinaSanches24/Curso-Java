public class Veiculo {
    protected String marca;
    protected int ano;

    // Construtor
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }
    protected void exibirInformacoes() {
        System.out.println("Veículo da marca " + marca + ", ano " + ano);
    }
}
