package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Restaurante;

public class ExercicioRestaurante {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Arnaldo", "Cozinheiro");
        Funcionario funcionario02 = new Funcionario("Jucilei", "Garçom");

        Funcionario[] funcionarios = {funcionario01, funcionario02};

        System.out.println("--- Restaurante ---");
        Restaurante restaurante = new Restaurante("Juciares Burguers", funcionarios);
        restaurante.imprime();

        System.out.println();

        System.out.println("--- Funcionários ---");
        Restaurante restaurante02 = new Restaurante("Lodiares Burguers");
        funcionario01.setRestaurante(restaurante02);
        funcionario02.setRestaurante(restaurante);

        funcionario01.imprime();
        funcionario02.imprime();
    }
}
