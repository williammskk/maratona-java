package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Usuario {
    private String nome;
    public final String CPF;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.CPF = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }
}
