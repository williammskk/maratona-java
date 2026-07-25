package academy.devdojo.maratonajava.javacore.Kenum.dominio.Ex03funcionario;

public class Funcionario {
    private String nome;
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void imprime(){
        System.out.println("Funcionário: "+this.nome+
                " - Cargo: "+cargo.name()+
                " - Salário Base: R$"+cargo.getSalarioBase()+
                " - Salário Final: R$"+cargo.getSalarioBase()*cargo.getMultiplicador());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
