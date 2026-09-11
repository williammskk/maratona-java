package academy.devdojo.maratonajava.javacore.Pwrappers.Zexercicioproprio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v1 = 0;
        char operacao = '0';
        int v2 = 0;
        System.out.println("---CONTA BÁSICA---");
        System.out.println("      + - * /     ");
        System.out.println();
        try {
            System.out.println("Valor 1: ");
            v1 = input.nextInt();
            System.out.println("Operação: ");
            operacao = input.next().charAt(0);
            System.out.println("Valor 2: ");
            v2 = input.nextInt();
            Calculadora.calcularOperacao(v1, v2, operacao);
        } catch (InputMismatchException e){
            System.out.println("Erro: Valor inválido!");
        }
    }
}
