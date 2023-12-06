import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String>animais = new LinkedList<>();
        animais.add("Cachorro");
        animais.add("Vaca");
        animais.add("Pato");
        System.out.println(animais);
        animais.add(0,"Gato");
        System.out.println(animais);
    }
}