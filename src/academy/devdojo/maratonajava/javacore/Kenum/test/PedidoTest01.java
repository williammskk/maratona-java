package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Pedido;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Status;

public class PedidoTest01 {
    public static void main(String[] args) {
        Pedido pedido01 = new Pedido("X-Burguer", Status.EM_PREPARO);
        Pedido pedido02 = new Pedido("Pizza", Status.ENTREGUE);
        Pedido pedido03 = new Pedido("Hotdog", Status.CANCELADO);

        System.out.println(pedido01);
        System.out.println(pedido02);
        System.out.println(pedido03);
    }
}
