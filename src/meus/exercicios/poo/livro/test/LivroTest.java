package meus.exercicios.poo.livro.test;

import meus.exercicios.poo.livro.dominio.Livro;
import meus.exercicios.poo.livro.dominio.Pessoa;

public class LivroTest {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa ("Ricardo","Masculino",18);

        Livro livro01 = new Livro("Dezesseis Fazendas","Sérgio Bigode",67,pessoa01);
        livro01.detalhes();

        System.out.println("=====");

        System.out.println("1º Interação.");
        livro01.abrir();

        System.out.println("2º Interação.");
        livro01.folhear(67);

        System.out.println("3º Interação.");
        livro01.avancarPag();

        System.out.println("4º Interação.");
        livro01.voltarPag();

        System.out.println("5º Interação.");
        livro01.voltarPag();

        System.out.println("6º Interação.");
        livro01.abrir();

        System.out.println("7º Interação.");
        livro01.fechar();
    }
}
