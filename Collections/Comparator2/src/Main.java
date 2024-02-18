import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> compras = new ArrayList<Produto>();
        compras.add(new Produto(123,"Blusa",520));
        compras.add(new Produto(234,"Meia",213));
        compras.add(new Produto(345,"Casaco",101));
        compras.add(new Produto(456,"Boné",59));
        compras.add(new Produto(567,"Camisa",10));

        System.out.println("Lista antes da ordenação:");

        for(Produto shop: compras){
            System.out.println(shop.quantidadeEstoque+" "+shop.nomeProduto+" "+shop.codigoProduto);
        }

        System.out.println();

        System.out.println("Lista depois da ordenação:");

        Collections.sort(compras, new EstoqueComparator());

        for(Produto shop: compras){
            System.out.println(shop.quantidadeEstoque+" "+shop.nomeProduto+" "+shop.codigoProduto);
        }
    }
}