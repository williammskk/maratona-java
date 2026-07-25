package meus.exercicios.poo.bossfight.dominio;

public class Boss {
    private final String nome = "Colosso";
    private double vida = 800;
    private Fraquezas fraquezaAtual = Fraquezas.ATAQUE_DE_MAGIA;

    public void imprimirVida(){
        System.out.println("Vida atual do Colosso: "+vida);
        System.out.println();
    }

    protected String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    protected Fraquezas getFraquezaAtual() {
        return fraquezaAtual;
    }

    protected void setVida(double vida) {
        this.vida = vida;
    }

    protected void setFraquezaAtual(Fraquezas fraquezaAtual) {
        this.fraquezaAtual = fraquezaAtual;
    }
}
