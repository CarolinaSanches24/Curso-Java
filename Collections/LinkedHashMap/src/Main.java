import java.util.LinkedHashMap;
import java.util.LinkedHashSet;


public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String>listaClientes = new LinkedHashMap<>();

        listaClientes.put("vava","Oswaldo");
        listaClientes.put("gisa","Gisele");
        listaClientes.put("gigi","Geovana");

        System.out.println("LinkedHashMap1: "+listaClientes);

        LinkedHashMap<String, String>novalistaClientes = new LinkedHashMap<>(listaClientes);
        novalistaClientes.put("Jubis","Juliana");
        System.out.println("Nova LinkedHashMap2:"+novalistaClientes);
    }
}