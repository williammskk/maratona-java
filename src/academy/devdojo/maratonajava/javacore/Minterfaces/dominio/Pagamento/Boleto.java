package academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Pagamento;

public class Boleto implements Pagamento {
    private TipoPagamento tipoPagamento;

    public Boleto(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public void valorPagamento() {
        System.out.println("pagamento com "+tipoPagamento.getNome()+": R$"+tipoPagamento.getValor());
    }
}
