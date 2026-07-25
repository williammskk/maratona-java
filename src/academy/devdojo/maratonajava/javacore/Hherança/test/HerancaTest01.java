package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 4");
        endereco.setCep("01256-131");

        Endereco endereco02 = new Endereco();
        endereco02.setRua("Rua 5");
        endereco02.setCep("83126-827");

        Pessoa pessoa = new Pessoa("Arial Black");
        pessoa.setCpf("219.256.781-32");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-------------");

        Funcionario funcionario = new Funcionario("Calibri Light");
        funcionario.setCpf("613.215.731-67");
        funcionario.setEndereco(endereco02);
        funcionario.setSalario(1105.42);

        funcionario.imprime();
    }
}
