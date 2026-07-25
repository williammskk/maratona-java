package meus.exercicios.poo.pagamento.dominio;

public class Pix implements  Pagamento{
    private double valor;
    private static final double desconto = 0.05;


    @Override
    public void processarPagamento(double valor) {
        double valorAlterado = valor - valor * desconto;
        System.out.println("Pix - Valor final - R$"+valorAlterado);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
