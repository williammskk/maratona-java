package meus.exercicios.poo.pagamento.test;

import meus.exercicios.poo.pagamento.dominio.*;

public class VendaTest {
    public static void main(String[] args) {
        CartaoCredito venda01 = new CartaoCredito();
        Pix venda02 = new Pix();
        Boleto venda03 = new Boleto();
        CartaoDebito venda04 = new CartaoDebito();

        Pagamento[] pagamentos = {venda01, venda02, venda03, venda04};

        for (Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento(500);
        }
    }
}
