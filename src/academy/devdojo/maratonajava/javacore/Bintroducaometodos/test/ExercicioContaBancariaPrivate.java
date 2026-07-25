package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ClasseContaBancariaPrivate;

import java.util.Scanner;

public class ExercicioContaBancariaPrivate {
    public static void main(String[] args) {
        ClasseContaBancariaPrivate conta01 = new ClasseContaBancariaPrivate();
        Scanner scanner = new Scanner(System.in);

        conta01.setTitular("ARNALDO PEDESTRE SAITAMO");
        conta01.setNumeroConta(8012);

        System.out.println("Seja bem-vindo! Quanto quer depositar na sua caixinha?");
        double valorDepositado = scanner.nextDouble();
        while (valorDepositado <= 0){
            System.out.println("Valor inválido! Tente novamente");
            valorDepositado = scanner.nextDouble();
        }
        scanner.nextLine();
        conta01.depositar(valorDepositado);

        System.out.println("Quanto quer sacar da sua caixinha?");

        double valorSacado = scanner.nextDouble();
        while (valorSacado <= 0 || valorSacado > conta01.getSaldo()){
            System.out.println("Valor inválido! Tente novamente!");
            valorSacado = scanner.nextDouble();
        }
        scanner.nextLine();
        conta01.sacar(valorSacado);

        conta01.exibirExtrato();
    }
}
