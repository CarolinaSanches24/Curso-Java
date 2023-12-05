import java.util.ArrayList;

public class listArrayList {
    public static void main(String[] args) {
        ArrayList<String>estados = new ArrayList<>();
        estados.add("Espirito Santo");
        estados.add("Ceará");
        estados.add("Rio de Janeiro");
        estados.add("Amazonas");

        estados.remove("Ceará");
        if(estados.contains("Amazonas")){
            System.out.println("true");
        }

        System.out.println(estados);

    }
}
