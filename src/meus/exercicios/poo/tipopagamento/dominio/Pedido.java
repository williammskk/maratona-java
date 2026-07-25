package meus.exercicios.poo.tipopagamento.dominio;

public class Pedido {
    private double valorOriginal;
    private TipoPagamento tipoPagamento;

    public Pedido(double valorOriginal, TipoPagamento tipoPagamento) {
        this.valorOriginal = valorOriginal;
        this.tipoPagamento = tipoPagamento;
    }

    public void processarPagamento(){
        System.out.println("Valor a pagar: "+tipoPagamento.calcularTotal(this.valorOriginal));
    }
}
