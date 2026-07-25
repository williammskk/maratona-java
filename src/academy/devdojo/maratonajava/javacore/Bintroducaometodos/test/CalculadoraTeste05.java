package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7};
        Calculadora calculadora = new Calculadora();
        int somaTotal = calculadora.somaArray(numeros);
        System.out.println(somaTotal);
    }
}
