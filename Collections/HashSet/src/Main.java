import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String>listaAlimentos = new HashSet<>();
        listaAlimentos.add("Arroz");
        listaAlimentos.add("Feijão");

        Iterator<String> iterator = listaAlimentos.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Tamanho do HashSet="+listaAlimentos.size());
        System.out.println("HashSet Original :"+listaAlimentos);
        System.out.println("Remover do HashSet:"+ listaAlimentos.remove("Arroz"));
        System.out.println("Verificando se Feijão está presente:"+listaAlimentos.contains("Feijão"));
        System.out.println("HashSet atualizado:"+listaAlimentos);
    }
}