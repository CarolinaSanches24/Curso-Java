import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaFrutas = new ArrayList<>();

        listaFrutas.add("Banana");
        listaFrutas.add("Morango");
        listaFrutas.add("Uva");

        listaFrutas.remove(0);

        for(String fruta:listaFrutas){
            System.out.println(fruta);
        }
        System.out.println(listaFrutas.get(1));
    }
}