package meus.exercicios.poo.bossfight.dominio;

public abstract class Personagem implements Ataques{
    protected int vida;
    protected int dano;
    protected Boss boss;

    public Personagem() {
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }
}
