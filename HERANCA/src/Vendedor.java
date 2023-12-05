public class Vendedor extends Pessoa {
    double comissao;
   public void mostrarNaTelaResultado() {
        System.out.println("Detalhes do Vendedor:");
        System.out.println("Nome: " + nome);
        System.out.println("Comissão: " + comissao + "\n");
    }
}
