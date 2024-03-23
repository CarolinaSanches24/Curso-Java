import java.util.LinkedList;
import java.util.Queue;

public class FilaPedidos implements Fila{
    private Queue<Pedido> fila;

    public FilaPedidos(){
        fila = new LinkedList<>();
    }
    @Override
    public void adicionarPedido(Pedido pedido) {
    fila.add(pedido);
        System.out.println("Pedido adicionado : Cliente - "+ pedido.getCliente()+", Produto - "+pedido.getProduto());
    }

    @Override
    public Pedido processarProximoPedido() {
        Pedido proximoPedido = fila.poll();
        if(proximoPedido !=null){
            System.out.println("Pedido processado: Cliente - " + proximoPedido.getCliente()+", Produto - "+proximoPedido.getProduto());
        }else{
            System.out.println("Não há pedidos na fila");
        }
        return proximoPedido;
    }
}
