package academy.devdojo.maratonajava.javacore.NPolimorfismo.test;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto computador = new Computador(3156.94);
        Produto tomate = new Tomate(12);

        System.out.println(computador.getNome());
        System.out.println(computador.getValor());
        System.out.println(tomate.getNome());
        System.out.println(tomate.getValor());
    }
}
