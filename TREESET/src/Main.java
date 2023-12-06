import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet <Integer> numeros= new TreeSet<>();
        numeros.add(8);
        numeros.add(6);
        numeros.add(7);
        System.out.println(numeros);
        boolean result = numeros.remove(6);
        System.out.println("Removeu?"+result);
        numeros.removeAll(numeros);
        System.out.println(numeros);
    }
}