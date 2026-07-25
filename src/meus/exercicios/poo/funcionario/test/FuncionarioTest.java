package meus.exercicios.poo.funcionario.test;

import meus.exercicios.poo.funcionario.dominio.Desenvolvedor;
import meus.exercicios.poo.funcionario.dominio.Funcionario;
import meus.exercicios.poo.funcionario.dominio.Gerente;
import meus.exercicios.poo.funcionario.dominio.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("William",3000);
        Gerente gerente = new Gerente("Arnaldo",3000);
        Vendedor vendedor = new Vendedor("Vendedor",3000, 5000);
        Funcionario[] funcionarios = {desenvolvedor, gerente, vendedor};

        for (Funcionario funcionario : funcionarios) {
            funcionario.calcularSalario();
        }
    }
}
