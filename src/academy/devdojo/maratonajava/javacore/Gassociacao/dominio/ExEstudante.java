package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class ExEstudante {
    private String nome;
    private int idade;
    private ExSeminarios seminario;

    public ExEstudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public ExEstudante(String nome, int idade, ExSeminarios seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("Aluno: "+this.nome);
        if(seminario==null){
            System.out.println("Seminário: ---");
        }else{
            System.out.println("Seminário: "+seminario.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ExSeminarios getSeminario() {
        return seminario;
    }

    public void setSeminario(ExSeminarios seminario) {
        this.seminario = seminario;
    }
}
