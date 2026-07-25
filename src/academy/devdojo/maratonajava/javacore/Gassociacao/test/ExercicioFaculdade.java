package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Faculdade;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Turma;

public class ExercicioFaculdade {
    public static void main(String[] args) {
        System.out.println("--- Escola ---");
        Turma turma01 = new Turma("Direito");
        Turma turma02 = new Turma("Medicina");
        Turma[] turmas = {turma01, turma02};
        Faculdade faculdade01 = new Faculdade("Uspo", turmas);
        faculdade01.imprime();
        System.out.println();

        System.out.println("--- Turmas ---");
        Aluno aluno01 = new Aluno("Valéria");
        Aluno aluno02 = new Aluno("João");
        Aluno aluno03 = new Aluno("Maria");
        Aluno aluno04 = new Aluno("Joana");
        Aluno[] alunos = {aluno01, aluno02};
        Aluno[] alunos02 = {aluno03, aluno04};
        turma01.setAlunos(alunos);
        turma02.setAlunos(alunos02);
        turma01.imprime();
        System.out.println();
        turma02.imprime();
        System.out.println();

        System.out.println("--- Alunos ---");
        aluno01.setTurma(turma01);
        aluno02.setTurma(turma01);
        aluno01.imprime();
        aluno02.imprime();
        aluno03.setTurma(turma02);
        aluno04.setTurma(turma02);
        aluno03.imprime();
        aluno04.imprime();
    }
}
