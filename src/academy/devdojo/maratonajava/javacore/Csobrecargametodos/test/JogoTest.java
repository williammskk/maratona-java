package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Jogo;

public class JogoTest {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.init("Dêbêdê","Terror","Todos menos celular");
        jogo.setNota(10);
        jogo.imprime();
    }
}
