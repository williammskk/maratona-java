package meus.exercicios.poo.funcionario.dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double salarioComBonus;
        salarioComBonus = salarioBase + salarioBase * 0.2;
        System.out.println(this.nome+" - "+ this.getClass().getSimpleName() + " - Salário: R$"+salarioComBonus);
    }
}
