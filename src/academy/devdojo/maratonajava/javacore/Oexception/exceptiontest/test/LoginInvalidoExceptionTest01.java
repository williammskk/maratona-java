package academy.devdojo.maratonajava.javacore.Oexception.exceptiontest.test;

import academy.devdojo.maratonajava.javacore.Oexception.exceptiontest.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch(LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String username = "Goku";
        String senha = "ssj";
        System.out.println("Digite o nome de usuário:");
        String usernameDigitada = teclado.nextLine();
        System.out.println("Digite a senha:");
        String senhaDigitada = teclado.nextLine();
        if(!username.equals(usernameDigitada) || !senha.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos.");
        }

        System.out.println("Usuário logado com sucesso.");
    }
}
