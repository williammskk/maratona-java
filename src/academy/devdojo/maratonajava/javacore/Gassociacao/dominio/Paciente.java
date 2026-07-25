package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Paciente {
    private String nome;
    private int idade;
    private Medico medico;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("Paciente: "+this.nome+" "+this.idade);
        if(medico == null) return;
        System.out.print("Médico associado: "+medico.getNome());
        System.out.println();
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
