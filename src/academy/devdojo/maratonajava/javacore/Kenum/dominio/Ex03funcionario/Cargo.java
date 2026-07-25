package academy.devdojo.maratonajava.javacore.Kenum.dominio.Ex03funcionario;

public enum Cargo {
    DESENVOLVEDOR(3000, 1.5),
    GERENTE(3000, 2),
    DIRETOR(3000, 3),
    ;

    private double salarioBase;
    private double multiplicador;

    Cargo(double salarioBase, double multiplicador) {
        this.salarioBase = salarioBase;
        this.multiplicador = multiplicador;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getMultiplicador() {
        return multiplicador;
    }
}
