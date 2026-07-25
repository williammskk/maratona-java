package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("One Piece");
        for (int episodio : anime01.getEpisodios()) {
            System.out.print(episodio+" ");
        }

    }
}
