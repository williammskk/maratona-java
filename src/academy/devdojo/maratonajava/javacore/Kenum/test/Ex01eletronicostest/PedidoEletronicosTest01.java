package academy.devdojo.maratonajava.javacore.Kenum.test.Ex01eletronicostest;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Ex01eletronicos.PedidosEletronicos;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Ex01eletronicos.PriodadeEletronicos;

public class PedidoEletronicosTest01 {
    public static void main(String[] args) {
        PedidosEletronicos pedido01 = new PedidosEletronicos("Notebook", PriodadeEletronicos.ALTA);
        PedidosEletronicos pedido02 = new PedidosEletronicos("Mouse", PriodadeEletronicos.MEDIA);
        PedidosEletronicos pedido03 = new PedidosEletronicos("Teclado", PriodadeEletronicos.BAIXA);

        pedido01.imprime();
        pedido02.imprime();
        pedido03.imprime();
    }
}
