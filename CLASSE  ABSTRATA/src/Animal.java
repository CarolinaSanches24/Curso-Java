abstract public class Animal {
    private String nome;

    //Construtor
    public Animal (String nome){
        this.nome = nome;
    }

    // Método abstrato que será implementado pelas subclasses
    abstract void emitirSom();

    //Método concreto

    public void dormir(){
        System.out.println(nome + " está dormindo ...");
    }
    //Método concreto
    public void mover(){
        System.out.println(nome + " está se movendo ...");
    }

}
