package meus.exercicios.poo.bossfight.dominio;

public class CalcularVidaGuerreiros {
    protected static int vidaTotal;

    public static int somarVida(Personagem[] personagens) {
        for (int i = 0; i < personagens.length; i++) {
            vidaTotal += personagens[i].getVida();
        }
        return vidaTotal;
    }
}
