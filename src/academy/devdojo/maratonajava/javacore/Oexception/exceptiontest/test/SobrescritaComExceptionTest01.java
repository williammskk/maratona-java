package academy.devdojo.maratonajava.javacore.Oexception.exceptiontest.test;

import academy.devdojo.maratonajava.javacore.Oexception.exceptiontest.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exceptiontest.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exceptiontest.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
