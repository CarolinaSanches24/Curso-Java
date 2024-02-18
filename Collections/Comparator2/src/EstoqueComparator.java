import java.util.Comparator;

public class EstoqueComparator implements Comparator<Produto> {
    public int compare(Produto produto1, Produto produto2){
        if(produto1.quantidadeEstoque==produto2.quantidadeEstoque)
            return 0;
        else if(produto1.quantidadeEstoque>produto2.quantidadeEstoque)
            return 1;
        else
            return -1;
    }
}
