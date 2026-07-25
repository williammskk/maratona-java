package meus.exercicios.poo.funcionario.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double salarioComBonus;
        salarioComBonus = salarioBase + salarioBase * 0.5;
        System.out.println(this.nome+" - "+ this.getClass().getSimpleName() + " - Salário: R$"+salarioComBonus);
    }
}
