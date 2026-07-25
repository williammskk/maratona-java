package meus.exercicios.poo.funcionario.dominio;

public class Vendedor extends Funcionario {
    private int vendas;

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public Vendedor(String nome, double salarioBase, int vendas) {
        super(nome, salarioBase);
        this.vendas = vendas;
    }

    @Override
    public void calcularSalario() {
        double salarioComBonus;
        salarioComBonus = salarioBase + vendas * 0.1;
        System.out.println(this.nome+" - "+ this.getClass().getSimpleName() + " - Salário: R$"+salarioComBonus);
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
}
