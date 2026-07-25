package meus.exercicios.poo.tipopagamento.dominio;

public interface EstrategiaPagamento {
    public abstract double calcularTotal(double valorOriginal);
}
