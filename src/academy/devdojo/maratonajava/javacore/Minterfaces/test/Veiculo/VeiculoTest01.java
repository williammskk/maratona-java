package academy.devdojo.maratonajava.javacore.Minterfaces.test.Veiculo;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Veiculo.Aviao;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Veiculo.Bicicleta;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Veiculo.Carro;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();
        Aviao aviao = new Aviao();

        System.out.println("--- Transportes ---");
        carro.imprimirNomeEVelocidade();
        carro.acao();
        carro.abastecimento();

        System.out.println();

        bicicleta.imprimirNomeEVelocidade();
        bicicleta.acao();
        bicicleta.abastecimento();

        System.out.println();

        aviao.imprimirNomeEVelocidade();
        aviao.acao();
        aviao.abastecimento();
    }
}
