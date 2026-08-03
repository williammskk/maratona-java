package meus.exercicios.poo.imprimirsalario.test;

import meus.exercicios.poo.imprimirsalario.dominio.Funcionario;
import meus.exercicios.poo.imprimirsalario.dominio.Gerente;
import meus.exercicios.poo.imprimirsalario.dominio.Vendedor;

public class ImprimirSalarioTest {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Gerente Jailson", 3000);
        Funcionario vendedor = new Vendedor("Vendedor Pereira", 1700,200);
        Funcionario[] funcionarios = {gerente,vendedor};
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.calcularSalario());
            System.out.println();
        }
    }
}
