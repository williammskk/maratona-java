package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ClasseFuncionarioPrivate;
import java.util.Scanner;

public class ExercicioFuncionarioPrivate {
    public static void main(String[] args) {
        ClasseFuncionarioPrivate funcionario = new ClasseFuncionarioPrivate();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome, salário e o cargo do funcionário: ");
        funcionario.setNome(scanner.nextLine());
        double salarioDigitado = scanner.nextDouble();
        scanner.nextLine();
        while (salarioDigitado < 0){
            System.out.println("Erro: Salário inválido, tente novamente,");
            salarioDigitado = scanner.nextDouble();
            scanner.nextLine();
        }
        funcionario.setSalario(salarioDigitado);
        funcionario.setCargo(scanner.nextLine());

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getCargo());
    }
}
