package meus.exercicios.poo.tipopagamento.test;

import meus.exercicios.poo.tipopagamento.dominio.Pedido;
import meus.exercicios.poo.tipopagamento.dominio.TipoPagamento;

public class PedidoTest {
    public static void main(String[] args) {
        Pedido pedido01 = new Pedido(10, TipoPagamento.CARTAO_CREDITO);
        pedido01.processarPagamento();
    }
}
