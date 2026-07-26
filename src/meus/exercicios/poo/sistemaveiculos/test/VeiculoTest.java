package meus.exercicios.poo.sistemaveiculos.test;

import meus.exercicios.poo.sistemaveiculos.dominio.Caminhao;
import meus.exercicios.poo.sistemaveiculos.dominio.Carro;
import meus.exercicios.poo.sistemaveiculos.dominio.Moto;
import meus.exercicios.poo.sistemaveiculos.dominio.Veiculo;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo veiculo01 = new Carro();
        Veiculo veiculo02 = new Moto();
        Veiculo veiculo03 = new Caminhao();
        Veiculo[] veiculos = {veiculo01, veiculo02, veiculo03};

        System.out.println("--- Veículos ---");
        for (Veiculo veiculo : veiculos) {
            veiculo.imprimeModeloEVelocidade();
        }

        System.out.println("--- Detalhes ---");
        for (Veiculo veiculo : veiculos) {
            if(veiculo instanceof Carro){
                ((Carro) veiculo).imprimirEspecificidade();
            } else if (veiculo instanceof Moto){
                ((Moto) veiculo).imprimirEspecificidade();
            } else if (veiculo instanceof Caminhao) {
                ((Caminhao) veiculo).imprimirEspecificidade();
            }
        }
    }
}
