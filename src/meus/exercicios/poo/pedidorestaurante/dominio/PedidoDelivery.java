package meus.exercicios.poo.pedidorestaurante.dominio;

public class PedidoDelivery extends Pedido implements Processavel{
    public PedidoDelivery(String numeroPedido, double valorTotal, StatusPedido status) {
        super(numeroPedido, valorTotal, status);
    }

    @Override
    public void processar() {
        this.status = StatusPedido.EM_PREPARO;
        System.out.println("Pedido #"+this.numeroPedido+" saindo para entrega no endereço: Rua das Flores, 123");
    }
}
