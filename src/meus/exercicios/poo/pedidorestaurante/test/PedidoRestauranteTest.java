package meus.exercicios.poo.pedidorestaurante.test;

import meus.exercicios.poo.pedidorestaurante.dominio.*;

public class PedidoRestauranteTest {
    public static void main(String[] args) {
        Pedido pedido01 = new PedidoLocal("001",35, StatusPedido.PRONTO);
        Pedido pedido02 = new PedidoDelivery("002",35, StatusPedido.AGUARDANDO);
        Pedido pedido03 = new PedidoRetirada("003",35, StatusPedido.CANCELADO);

        Pedido[] pedidos = {pedido01, pedido02, pedido03};

        System.out.println("--- Status dos Pedidos ---");
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido #"+pedido.getNumeroPedido()+" - Status: "+pedido.getStatus());
        }

        System.out.println();

        for (Pedido pedido : pedidos) {
            if(pedido instanceof Processavel){
                ((Processavel) pedido).processar();
            }
        }

        System.out.println();

        System.out.println("--- Status dos Pedidos ---");
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido #"+pedido.getNumeroPedido()+" - Status: "+pedido.getStatus());
        }
    }
}
