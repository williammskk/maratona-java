package meus.exercicios.poo.contabancaria.dominio;

public class ContaBancaria {
    protected String nomeCliente;
    protected String numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void atualizarDados(){
        System.out.println("Nome: "+this.nomeCliente);
        System.out.println("Número da Conta: "+this.numConta);
        System.out.println("Saldo atual: "+this.saldo);
        System.out.println();
    }

    public double sacar(double valorParaSacar){
        if(valorParaSacar < 0 || valorParaSacar > saldo){
            System.out.println("Erro! Insira um valor válido.");
        }else{
            this.saldo -= valorParaSacar;
            this.atualizarDados();
        }
        System.out.println();
        return valorParaSacar;
    }

    public void depositar(double valorParaDepositar){
        this.saldo += valorParaDepositar;
        this.atualizarDados();
    }
}
