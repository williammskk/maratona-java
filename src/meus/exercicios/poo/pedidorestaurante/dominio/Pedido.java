package meus.exercicios.poo.pedidorestaurante.dominio;

public abstract class Pedido {
    protected String numeroPedido;
    protected double valorTotal;
    protected StatusPedido status;

    public Pedido(String numeroPedido, double valorTotal, StatusPedido status) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
