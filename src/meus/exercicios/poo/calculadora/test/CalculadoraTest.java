package meus.exercicios.poo.calculadora.test;

import meus.exercicios.poo.calculadora.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        double resultado01 = Calculadora.soma(4,6);
        System.out.println(resultado01);
        System.out.println();

        double resultado02 = Calculadora.subtracao(4,6);
        System.out.println(resultado02);
        System.out.println();

        double resultado03 = Calculadora.multiplicacao(4,6);
        System.out.println(resultado03);
        System.out.println();

        double resultado04 = Calculadora.divisao(4,6);
        System.out.println(resultado04);
        System.out.println();

        double resultado05 = Calculadora.potenciacao(4,6);
        System.out.println(resultado05);
        System.out.println();

        double resultado06 = Calculadora.fatorial(4);
        System.out.println(resultado06);
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.print(Calculadora.fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println(Calculadora.somarAteN(5));
    }
}
