package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

import java.sql.SQLOutput;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imprima = new ImpressoraEstudante();

        estudante01.nome = "Rafael";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Jocelia";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        imprima.imprime(estudante01);
        System.out.println("----------------------");
        imprima.imprime(estudante02);
        }
}
