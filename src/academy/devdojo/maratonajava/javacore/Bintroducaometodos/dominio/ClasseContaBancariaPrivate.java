package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ClasseContaBancariaPrivate {
    private String titular;
    private double saldo;
    private int numeroConta;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo (){
        return saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido.");
        }else{
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if(valor <= 0 || valor > this.saldo ){
            System.out.println("Valor inválido! Tente novamente");
        }else{
            this.saldo -= valor;
        }
    }

    public void exibirExtrato(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Número da conta: "+this.numeroConta);
        System.out.println("Saldo: "+this.saldo);
    }
}
