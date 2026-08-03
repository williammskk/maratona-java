package meus.exercicios.poo.imprimirsalario.dominio;

public class Vendedor extends Funcionario{
    private final double comissao = 0.7;
    private int vendasRealizadas;

    public Vendedor(String nome, double salarioBase, int vendasRealizadas) {
        super(nome, salarioBase);
        this.vendasRealizadas = vendasRealizadas;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + (comissao * vendasRealizadas);
    }
}
