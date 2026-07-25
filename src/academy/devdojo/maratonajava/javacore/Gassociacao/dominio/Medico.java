package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Medico {
    private String nome;
    private String especialidade;
    private Paciente[] pacientes;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("Médico: "+this.nome+" Especialidade: "+this.especialidade);
        if(pacientes == null) return;
        System.out.println("Paciente associado: ");
        for (Paciente paciente : pacientes) {
            System.out.println(paciente.getNome());
        }
        System.out.println();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
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
