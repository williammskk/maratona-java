package meus.exercicios.poo.controleremoto.dominio;

public interface Comandos {
    public abstract void aumentarVolume();
    public abstract void diminuirVolume();
    public abstract void pausar();
    public abstract void despausar();
    public abstract void mutar();
    public abstract void desmutar();
    public abstract void ligar();
    public abstract void desligar();
}
