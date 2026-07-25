package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominiorestaurante;

public class Cliente {
    private String nome;
    private final String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("Cliente: "+this.nome);
        System.out.println("CPF: "+this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
}
