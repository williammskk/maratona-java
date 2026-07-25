package meus.exercicios.poo.contabancaria.dominio;

public class ContaPoupanca extends ContaBancaria{
    protected static final double diaRendimento = 0.2;

    public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    public void calcularNovoSaldo(){
        this.saldo += this.saldo * diaRendimento;
        this.atualizarDados();
    }
}
