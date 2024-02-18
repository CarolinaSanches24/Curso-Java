import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> listaComidasTipicas = new LinkedList<>();
        listaComidasTipicas.add("Vatapá");
        listaComidasTipicas.add(0,"Tacacá");

        System.out.println("Saida");

        Iterator<String> iterator = listaComidasTipicas.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}