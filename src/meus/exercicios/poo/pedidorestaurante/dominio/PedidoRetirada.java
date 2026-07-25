package meus.exercicios.poo.pedidorestaurante.dominio;

public class PedidoRetirada extends Pedido implements Processavel{
    public PedidoRetirada(String numeroPedido, double valorTotal, StatusPedido status) {
        super(numeroPedido, valorTotal, status);
    }

    @Override
    public void processar() {
        this.status = StatusPedido.PRONTO;
        System.out.println("Pedido #"+this.numeroPedido+" pronto para retirada no balcão");
    }
}
