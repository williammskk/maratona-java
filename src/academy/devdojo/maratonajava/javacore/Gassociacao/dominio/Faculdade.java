package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Faculdade {
    private String nome;
    private Turma[] turmas;
    private Aluno[] alunos;

    public Faculdade(String nome) {
        this.nome = nome;
    }

    public Faculdade(String nome, Turma[] turmas) {
        this.nome = nome;
        this.turmas = turmas;
    }

    public void imprime(){
        System.out.println("Faculdade: "+this.nome);
        System.out.println("Turmas: ");
        for (Turma turma : turmas) {
            System.out.println("Turma: "+turma.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Turma[] getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma[] turmas) {
        this.turmas = turmas;
    }
}
