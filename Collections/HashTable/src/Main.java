import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

                // Criando uma Hashtable para armazenar nomes e idades
                Hashtable<String, Integer> tabelaIdades = new Hashtable<>();

                // Adicionando elementos à Hashtable usando o método put()
                tabelaIdades.put("João", 30);
                tabelaIdades.put("Maria", 25);
                tabelaIdades.put("Carlos", 40);
                tabelaIdades.put("Ana", 35);

                // Imprimindo a Hashtable
                System.out.println("Hashtable de idades: " + tabelaIdades);

                // Acessando um valor usando a chave usando o método get()
                System.out.println("Idade de Maria: " + tabelaIdades.get("Maria"));

                // Verificando se a Hashtable contém uma chave específica usando containsKey()
                if (tabelaIdades.containsKey("Pedro")) {
                    System.out.println("Pedro está presente na Hashtable.");
                } else {
                    System.out.println("Pedro não está presente na Hashtable.");
                }

                // Verificando se a Hashtable contém um valor específico usando containsValue()
                if (tabelaIdades.containsValue(25)) {
                    System.out.println("25 anos está presente na Hashtable.");
                } else {
                    System.out.println("25 anos não está presente na Hashtable.");
                }

                // Removendo um elemento da Hashtable usando remove()
                tabelaIdades.remove("Carlos");

                // Imprimindo a Hashtable após a remoção
                System.out.println("Hashtable após a remoção de Carlos: " + tabelaIdades);
    }
}