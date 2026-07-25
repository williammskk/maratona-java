package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Funcionario {
    private String nome;
    private String especialidade;
    private Restaurante restaurante;

    public Funcionario(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Funcionario(String nome, String especialidade, Restaurante restaurante) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.restaurante = restaurante;
    }

    public void imprime(){
        if (restaurante==null){
        System.out.println(nome+" trabalha em nenhum restaurante. ");
        } else {
            System.out.println(nome + " trabalha em: " + restaurante.getNome());
        }
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
