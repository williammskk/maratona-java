package meus.exercicios.poo.contabancaria.test;

import meus.exercicios.poo.contabancaria.dominio.ContaBancaria;
import meus.exercicios.poo.contabancaria.dominio.ContaEspecial;
import meus.exercicios.poo.contabancaria.dominio.ContaPoupanca;

public class ContaBancariaTest {
    public static void main(String[] args) {
        // Criar contas
        ContaBancaria conta01 = new ContaBancaria("Arnaldo","01234-5", 300);
        ContaPoupanca conta02 = new ContaPoupanca("Juliano","43201-8", 120);
        ContaEspecial conta03 = new ContaEspecial("Verissimo","61687-3", 150);

        conta01.atualizarDados();
        conta02.atualizarDados();
        conta03.atualizarDados();
        // Sacar um valor das contas
        conta01.sacar(30);
        conta02.sacar(80);
        conta03.sacar(130);

        // Depositar

        conta01.depositar(70);
        conta02.depositar(35);
        conta03.depositar(50);

        // Mostrar um novo saldo a partir de um rendimento

        conta02.calcularNovoSaldo();

        // Mostrar os dados da conta do cliente

        conta01.atualizarDados();
        conta02.atualizarDados();
        conta03.atualizarDados();
    }
}
