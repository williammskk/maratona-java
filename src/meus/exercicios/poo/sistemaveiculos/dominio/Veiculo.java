package meus.exercicios.poo.sistemaveiculos.dominio;

public abstract class Veiculo {
    protected String modelo;
    protected double velocidadeMaxima;

    public Veiculo() {
    }

    public abstract void imprimeModeloEVelocidade();
}
