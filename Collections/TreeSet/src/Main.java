import java.util.Iterator;
import java.util.TreeSet;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
                // Criando um TreeSet de Integers
                TreeSet<Integer> conjunto = new TreeSet<>();

                // Adicionando elementos ao conjunto
                conjunto.add(10);
                conjunto.add(5);
                conjunto.add(20);

                // Iterando sobre os elementos do conjunto
        Iterator<Integer> iterator = conjunto.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // Verificando se o conjunto contém um elemento específico
        System.out.println("Contém 10? " + conjunto.contains(10)); // Saída: true

        // Removendo um elemento do conjunto
        conjunto.remove(5);

    }
}