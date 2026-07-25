package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class ExProfessor {
    private String nome;
    private String especialidade;
    private ExSeminarios[] seminarios;

    public ExProfessor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }


    public ExProfessor(String nome, String especialidade, ExSeminarios[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("Professor: "+this.nome);
        if(seminarios==null){
            return;
        }else {
            System.out.println("Seminário(s): ");
            for (ExSeminarios exSeminarios : seminarios) {
                System.out.println(exSeminarios.getTitulo());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ExSeminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(ExSeminarios[] seminarios) {
        this.seminarios = seminarios;
    }

}
