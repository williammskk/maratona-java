package meus.exercicios.poo.pagamento.dominio;

public class Boleto implements Pagamento{
    private double valor;

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto - Valor final - R$"+valor+" - Vence em 3 dias.");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}