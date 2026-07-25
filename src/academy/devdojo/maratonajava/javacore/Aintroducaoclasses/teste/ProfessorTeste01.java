package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Veraldo";
        professor.idade = 43;
        professor.sexo = 'M';
        System.out.println("Nome: "+professor.nome+" Idade: "+professor.idade+" Sexo: "+professor.sexo);
    }
}
