import  java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(3);
        listaNumeros.add(2);
        //Ordena de forma descrescente
        Comparator<Integer> comparator = Collections.reverseOrder();

        Collections.sort(listaNumeros, comparator);
        System.out.println("Elementos depois da ordenação:");

        for(Integer numero:listaNumeros)
            System.out.println(numero);
    }
}