package meus.exercicios.poo.imprimirsalario.dominio;

public class Gerente extends Funcionario {
    private final double bonus = 0.1;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.salarioBase*bonus;
    }
}
