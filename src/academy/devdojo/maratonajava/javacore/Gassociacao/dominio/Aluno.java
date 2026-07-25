package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
    private String nome;
    private Faculdade faculdade;
    private Turma turma;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, Turma turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public Aluno(String nome, Turma turma, Faculdade faculdade) {
        this.nome = nome;
        this.turma = turma;
        this.faculdade = faculdade;
    }

    public void imprime(){
        System.out.println(this.nome+" estuda em: "+turma.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Faculdade getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }
}
