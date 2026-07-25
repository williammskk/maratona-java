package academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Veiculo;

public abstract class Veiculo {
    protected String nome;
    protected double velocidadeMaxima;

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}
