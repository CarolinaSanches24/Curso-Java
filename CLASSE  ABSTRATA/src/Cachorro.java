public class Cachorro extends Animal {
    public Cachorro(String nome){
        super(nome);
    }
    // Implementação do método abstrato emitirSom() da classe Animal
    @Override
    void emitirSom(){
        System.out.println("Au au");
    }
}
