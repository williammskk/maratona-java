package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExEstudante;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExLocal;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExProfessor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExSeminarios;

import java.util.Scanner;

public class ExDevDojo {
    public static void main(String[] args) {
        ExLocal local01 = new ExLocal("Cupuaçu");
        ExLocal local02 = new ExLocal("Itatiba");
        ExLocal local03 = new ExLocal("Vale das Águas");

        ExEstudante aluno01 = new ExEstudante("Leonardo", 17);
        ExEstudante aluno02 = new ExEstudante("Geovanna", 16);
        ExEstudante aluno03 = new ExEstudante("Poliana", 17);
        ExEstudante aluno04 = new ExEstudante("Rafael", 16);
        ExEstudante aluno05 = new ExEstudante("Carlos", 17);
        ExEstudante aluno06 = new ExEstudante("Nathan", 17);
        ExEstudante aluno07 = new ExEstudante("Joel", 16);
        ExEstudante aluno08 = new ExEstudante("Felipe", 17);
        ExEstudante aluno09 = new ExEstudante("Rayane", 17);

        ExProfessor professor01 = new ExProfessor("Larileine","Inglês");
        ExProfessor professor02 = new ExProfessor("Rogério","Matemática e Geografia");

        ExEstudante[] grupo01 = {aluno01, aluno02, aluno03};
        ExEstudante[] grupo02 = {aluno04, aluno05, aluno06};
        ExEstudante[] grupo03 = {aluno07, aluno08, aluno09};

        ExSeminarios seminario01 = new ExSeminarios("Trabalho de Geografia", local01, grupo01);
        local01.setSeminario(seminario01);
        ExSeminarios seminario02 = new ExSeminarios("Trabalho de Matemática", local02, grupo02);
        local02.setSeminario(seminario02);
        ExSeminarios seminario03 = new ExSeminarios("Trabalho de Inglês", local03, grupo03);
        local03.setSeminario(seminario03);

        ExSeminarios[] conjuntos01 = {seminario03};
        ExSeminarios[] conjuntos02 = {seminario01, seminario02};

        aluno01.setSeminario(seminario01);
        aluno02.setSeminario(seminario01);
        aluno03.setSeminario(seminario01);
        aluno04.setSeminario(seminario02);
        aluno05.setSeminario(seminario02);
        aluno06.setSeminario(seminario02);
        aluno07.setSeminario(seminario03);
        aluno08.setSeminario(seminario03);
        aluno09.setSeminario(seminario03);

        professor01.setSeminarios(conjuntos01);
        professor02.setSeminarios(conjuntos02);

        seminario01.setProfessor(professor02);
        seminario02.setProfessor(professor02);
        seminario03.setProfessor(professor01);

        System.out.println("PONTO DE VISTA SEMINÁRIO:");
        seminario01.imprime();
        System.out.println("-------------");
        seminario02.imprime();
        System.out.println("-------------");
        seminario03.imprime();
        System.out.println();

        System.out.println("PONTO DE VISTA ALUNOS:");
        aluno01.imprime();
        System.out.println("-------------");
        aluno02.imprime();
        System.out.println("-------------");
        aluno03.imprime();
        System.out.println("-------------");
        aluno04.imprime();
        System.out.println("-------------");
        aluno05.imprime();
        System.out.println("-------------");
        aluno06.imprime();
        System.out.println("-------------");
        aluno07.imprime();
        System.out.println("-------------");
        aluno08.imprime();
        System.out.println("-------------");
        aluno09.imprime();
        System.out.println();

        System.out.println("PONTO DE VISTA PROFESSORES:");
        professor01.imprime();
        System.out.println("-------------");
        professor02.imprime();
        System.out.println("-------------");
        System.out.println();

        System.out.println("PONTO DE VISTA LOCAL:");
        local01.imprime();
        System.out.println("-------------");
        local02.imprime();
        System.out.println("-------------");
        local03.imprime();
    }
}
