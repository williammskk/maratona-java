package academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Pagamento;

public class CartaoCredito implements Pagamento {
    private TipoPagamento tipoPagamento;

    public CartaoCredito(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public void validar() {
        System.out.println("Validando pagamento com "+tipoPagamento.getNome()+"...");
    }

    @Override
    public void valorPagamento() {
        System.out.println("pagamento com "+tipoPagamento.getNome()+": R$"+tipoPagamento.getValor());
    }
}
