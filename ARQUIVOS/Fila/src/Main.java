import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Fila filaPedidos = new FilaPedidos();

        // Adicionando alguns pedidos
        filaPedidos.adicionarPedido(new Pedido("Cliente1", "Produto1"));
        filaPedidos.adicionarPedido(new Pedido("Cliente2", "Produto2"));
        filaPedidos.adicionarPedido(new Pedido("Cliente3", "Produto3"));

        // Processando pedidos
        filaPedidos.processarProximoPedido();
        filaPedidos.processarProximoPedido();
        filaPedidos.processarProximoPedido();
        filaPedidos.processarProximoPedido();


    }
}