package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante usuario01 = new Estudante();
        usuario01.nome = "Karlos";
        usuario01.idade = 9;
        usuario01.sexo = 'M';
        System.out.println(usuario01.nome);
        System.out.println(usuario01.idade);
        System.out.println(usuario01.sexo);
        Estudante usuario02 = new Estudante();
        usuario02.nome = "Jeovana";
        usuario02.idade = 12;
        usuario02.sexo = 'F';
        System.out.println(usuario02.nome);
        System.out.println(usuario02.idade);
        System.out.println(usuario02.sexo);
    }
}
