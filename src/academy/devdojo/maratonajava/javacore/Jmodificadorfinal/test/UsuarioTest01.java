package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Banco;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Conta;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Usuario;

public class UsuarioTest01 {
    public static void main(String[] args) {
        Banco banco = new Banco("0001","Banco do Valente");
        Usuario usuario = new Usuario("Jaelson","123.456.789-10");
        Conta conta01 = new Conta(usuario, banco, 0);
        conta01.imprime();
    }
}
