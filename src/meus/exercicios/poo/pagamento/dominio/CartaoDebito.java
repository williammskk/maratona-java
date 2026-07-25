package meus.exercicios.poo.pagamento.dominio;

public class CartaoDebito implements Pagamento{
    private double valor;
    private static final double desconto = 0.02;

    @Override
    public void processarPagamento(double valor) {
        double valorAlterado = valor - valor * desconto;
        System.out.println("Cartão de Débito - Valor final - R$"+valorAlterado);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
