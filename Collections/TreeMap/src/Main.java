import java.sql.SQLOutput;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<Integer, String> mapaNomes = new TreeMap<>();
        mapaNomes.put(1,"MAURICIO");
        mapaNomes.put(2,"CAROL");

        System.out.println("TreeMap de Nomes : "+mapaNomes);
        System.out.println("Chaves: "+mapaNomes.keySet());
        System.out.println("Valores: "+mapaNomes.values());
        System.out.println("Chave/valor: "+mapaNomes.entrySet());
    }
}