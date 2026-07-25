package academy.devdojo.maratonajava.javacore.Kenum.test.Ex03funcionariotest;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Ex03funcionario.Cargo;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Ex03funcionario.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Joseval", Cargo.DESENVOLVEDOR);
        Funcionario funcionario02 = new Funcionario("Arnaldo", Cargo.GERENTE);
        Funcionario funcionario03 = new Funcionario("Bernardo", Cargo.DIRETOR);

        funcionario01.imprime();
        funcionario02.imprime();
        funcionario03.imprime();
    }
}
