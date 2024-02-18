import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String>linguagensProgramcao = new HashMap<>();
        linguagensProgramcao.put(1,"C++"); //Adiciona chave valor
        linguagensProgramcao.put(2,"Java");
        linguagensProgramcao.put(3,"Python");

        System.out.println("Contéudo do HashMap: "+linguagensProgramcao);
        System.out.println("Elemento da chave 2: "+linguagensProgramcao.get(2));
        System.out.println("Chaves: "+linguagensProgramcao.keySet());
        System.out.println("Valores: "+linguagensProgramcao.values());
        System.out.println("Chave/valor: "+linguagensProgramcao.entrySet());
    }
}