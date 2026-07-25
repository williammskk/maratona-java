package meus.exercicios.poo.pedidorestaurante.dominio;

public class PedidoLocal extends Pedido implements Processavel{
    public PedidoLocal(String numeroPedido, double valorTotal, StatusPedido status) {
        super(numeroPedido, valorTotal, status);
    }

    @Override
    public void processar() {
        this.status = StatusPedido.EM_PREPARO;
        System.out.println("Pedido #"+this.numeroPedido+" sendo preparado na mesa 5");
    }
}
