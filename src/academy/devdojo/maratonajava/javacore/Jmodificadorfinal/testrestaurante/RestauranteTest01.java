package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.testrestaurante;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominiorestaurante.Cliente;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominiorestaurante.NotaFiscal;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominiorestaurante.Pedido;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominiorestaurante.Restaurante;

public class RestauranteTest01 {
    public static void main(String[] args) {
        Restaurante restaurante01 = new Restaurante("Juciares Burguer");
        Pedido pedido11 = new Pedido("X-Burguer","#00142",25.90);
        Cliente cliente232 = new Cliente("Arnaldo","987.654.321-00");
        NotaFiscal notafiscal = new NotaFiscal(restaurante01,cliente232,pedido11);

        System.out.println("--- Pedido ---");
        notafiscal.imprime();

        System.out.println("--- Atualizando status ---");
        notafiscal.setStatus(true);
        System.out.println("Status atualizado!");
        System.out.println();

        System.out.println("--- Pedido Atualizado ---");
        notafiscal.imprime();
    }
}
