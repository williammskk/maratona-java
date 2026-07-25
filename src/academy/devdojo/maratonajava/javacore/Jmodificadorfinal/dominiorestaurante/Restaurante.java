package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominiorestaurante;

public class Restaurante {
    private String nome;

    public Restaurante(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Restaurante: "+this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
