package meus.exercicios.poo.pagamento.dominio;

public class CartaoCredito implements Pagamento{
    private double valor;
    private static final double juros = 0.05;

    @Override
    public void processarPagamento(double valor) {
        double valorAlterado = valor + valor * juros;
        System.out.println("Cartão de Crédito - Valor final - R$"+valorAlterado);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
