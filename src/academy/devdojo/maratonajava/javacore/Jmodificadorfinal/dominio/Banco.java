package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Banco {
    public final String NOME;
    public final String AGENCIA;

    public Banco(String agencia, String nome) {
        this.AGENCIA = agencia;
        this.NOME = nome;
    }

    public String getNOME() {
        return NOME;
    }

    public String getAGENCIA() {
        return AGENCIA;
    }
}
