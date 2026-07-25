package academy.devdojo.maratonajava.javacore.Minterfaces.test.PagamentoTest;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Pagamento.CartaoCredito;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Pagamento.Pix;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Pagamento.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Pagamento.Boleto;

public class PagamentoTest01 {
    public static void main(String[] args) {


        CartaoCredito transacao01 = new CartaoCredito(TipoPagamento.CARTAO_CREDITO);
        Pix transacao02 = new Pix (TipoPagamento.PIX);
        Boleto transacao03 = new Boleto(TipoPagamento.BOLETO);

        transacao01.valorPagamento();
        transacao02.valorPagamento();
        transacao03.valorPagamento();

        transacao01.validar();
        transacao02.validar();
        transacao03.validar();
    }
}
