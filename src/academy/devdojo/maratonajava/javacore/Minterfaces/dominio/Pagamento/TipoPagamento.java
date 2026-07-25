package academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Pagamento;

public enum TipoPagamento {
    CARTAO_CREDITO ("Cartão de Crédito", 150.0),
    PIX ("Pix", 150.0),
    BOLETO ("Boleto", 150.0);

    TipoPagamento(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    private final String nome;
    private final double valor;

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
