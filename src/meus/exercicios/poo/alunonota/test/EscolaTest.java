package meus.exercicios.poo.alunonota.test;

import meus.exercicios.poo.alunonota.dominio.Aluno;

import java.util.Scanner;

public class EscolaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o nome do aluno?");
        String nome = input.nextLine();

        System.out.println("Quais as três matérias que ele está cursando?");
        String[] materia = new String[3];
        for (int i = 0; i <= 2; i++) {
            materia[i] = input.next();
        }
        input.nextLine();

        System.out.println("Quais as três notas que ele conseguiu nessas matérias?");
        double[] nota = new double[3];
        for (int i = 0; i < 3; i++) {
            nota[i] = input.nextDouble();
        }

        Aluno aluno = new Aluno(nome, materia, nota);

        System.out.println("==== NOTAS ====");
        aluno.calcularNotas();
    }
}
