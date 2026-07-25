package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Objects;
import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque uma senha: ");
        String senha = input.nextLine();
        System.out.println("Insira a senha para entrar: ");
        String resposta = input.nextLine();
        while (!Objects.equals(resposta, senha)){
            System.out.println("Senha incorreta! Tente novamente: ");
            resposta = input.nextLine();
        }
        System.out.println("Bem-vindo ao sistema!");
    }
}
