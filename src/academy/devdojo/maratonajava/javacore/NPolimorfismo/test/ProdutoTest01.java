package academy.devdojo.maratonajava.javacore.NPolimorfismo.test;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador(3300);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        Tomate tomate = new Tomate(10);
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        Televisao televisao = new Televisao(2801.53);
        CalculadoraImposto.calcularImposto(televisao);
    }
}
