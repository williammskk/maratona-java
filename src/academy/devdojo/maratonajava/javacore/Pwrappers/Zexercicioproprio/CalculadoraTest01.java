package academy.devdojo.maratonajava.javacore.Pwrappers.Zexercicioproprio;

import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String v1 = input.nextLine();
        char operacao = input.nextLine().charAt(0);
        String v2 = input.nextLine();
        Calculadora.calcularOperacao(v1, v2, operacao);
    }
}
