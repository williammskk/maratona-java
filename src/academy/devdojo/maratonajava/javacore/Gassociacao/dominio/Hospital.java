package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Hospital {
    private String nome;
    private Medico[] medicos;

    public Hospital(String nome) {
        this.nome = nome;
    }

    public Hospital(String nome, Medico[] medicos) {
        this.nome = nome;
        this.medicos = medicos;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (medicos == null) return;
        for (Medico medico : medicos) {
            System.out.println(medico.getNome());
        }
    }

    public Medico[] getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
