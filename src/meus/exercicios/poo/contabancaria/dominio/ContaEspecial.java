package meus.exercicios.poo.contabancaria.dominio;

public class ContaEspecial extends ContaBancaria{
    protected double limite = 300;

    public ContaEspecial(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    @Override
    public void atualizarDados(){
        System.out.println("Nome: "+this.nomeCliente);
        System.out.println("Número da Conta: "+this.numConta);
        System.out.println("Saldo atual: "+this.saldo);
        System.out.println("Limite atual: "+this.limite);
        System.out.println();
    }

    @Override
    public double sacar(double valorParaSacar) {
        double saldoComLimite = this.saldo+this.limite;
        if(valorParaSacar < 0 || valorParaSacar > saldoComLimite){
            System.out.println("Erro! Insira um valor válido.");
        }else{
            this.saldo -= valorParaSacar;
            this.atualizarDados();
        }
        System.out.println();
        return valorParaSacar;
    }
}
