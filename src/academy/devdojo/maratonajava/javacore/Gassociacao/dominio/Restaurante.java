package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Restaurante {
    private String nome;
    private Funcionario[] funcionarios;

    public Restaurante(String nome, Funcionario[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public Restaurante(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Restaurante: "+nome);
        if(funcionarios==null) return;
        System.out.println("Funcionários: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome()+" - "+funcionario.getEspecialidade());
        }
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
