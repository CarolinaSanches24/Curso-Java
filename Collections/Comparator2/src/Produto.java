public class Produto {
    int codigoProduto;
    String nomeProduto;
    int quantidadeEstoque;

    //Método construtor
    Produto(int codigoProduto, String nomeProduto, int qtestoque)
    {
        this.codigoProduto= codigoProduto;
        this.quantidadeEstoque = qtestoque;
        this.nomeProduto = nomeProduto;
    }
}
