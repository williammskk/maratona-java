package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Turma {
    private String nome;
    private Aluno[] alunos;

    public Turma(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Turma: "+this.nome);
        if(alunos == null) return;
        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }


    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
