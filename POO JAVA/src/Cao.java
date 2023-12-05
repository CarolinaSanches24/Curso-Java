public class Cao {
    String nome;
    String cor;
    int idade;
    double peso;
    public Cao(){
        cor="Caramelo";
    }
    public Cao(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public void Anda(){
        System.out.println("Estou andando ..." +cor);
    }
    public void DadosCao(){
        System.out.println("Meu cão se chama:" +nome+" \nEle tem "+ idade+" anos");
    }
}
