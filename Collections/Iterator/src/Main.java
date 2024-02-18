import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Maça");
        listaFrutas.add("Banana");
        listaFrutas.add("Pera");

        Iterator<String>iterator = listaFrutas.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}