package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class ExSeminarios {
    private String titulo;
    private ExEstudante[] estudantes;
    private ExLocal local;
    private ExProfessor professor;

    public ExSeminarios(String titulo, ExLocal local) {
        this.titulo = titulo;
        this.local = local;
    }

    public ExSeminarios(String titulo, ExLocal local, ExEstudante[] estudantes) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
    }

    public ExSeminarios(String titulo, ExLocal local, ExEstudante[] estudantes, ExProfessor professor) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
        this.professor = professor;
    }

    public void imprime(){
        System.out.println("Seminário: "+this.titulo);
        System.out.println("Local: "+local.getEndereco());
        if (professor==null) return;
        System.out.println("Professor: "+professor.getNome());
        if (estudantes==null) return;
        System.out.println("Alunos: ");
        for (ExEstudante estudante : estudantes) {
            System.out.println(estudante.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ExLocal getLocal() {
        return local;
    }

    public void setLocal(ExLocal local) {
        this.local = local;
    }

    public ExEstudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ExEstudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public ExProfessor getProfessor() {
        return professor;
    }

    public void setProfessor(ExProfessor professor) {
        this.professor = professor;
    }
}
