public class Carro extends Veiculo{
    private String modelo; // Atributo privado

    // Construtor
    public Carro(String marca, int ano, String modelo) {
        super(marca, ano); // Chamada ao construtor da superclasse Veiculo
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        exibirInformacoes(); // Chama o método protegido da superclasse Veiculo
        System.out.println("Modelo: " + modelo);
    }
}
