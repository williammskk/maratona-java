package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioClasseExercicio;

public class FuncionarioTesteExercicio {
    public static void main(String[] args) {
        FuncionarioClasseExercicio funcionario01 = new FuncionarioClasseExercicio();
        funcionario01.nome = "Arnaldo";
        funcionario01.idade = 19;
        funcionario01.salario = new double[]{1200, 987.32,2000};
        funcionario01.imprimirDados();
        funcionario01.imprimirMedia();
    }
}
