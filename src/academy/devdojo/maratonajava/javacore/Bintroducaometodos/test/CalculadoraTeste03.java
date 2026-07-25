package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;
import org.w3c.dom.ls.LSOutput;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(0,2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,0));
    }
}
