package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Conta {
    private final Banco BANCO;
    private final Usuario CLIENTE;
    private double saldo = 0;

    public Conta(Usuario CLIENTE, Banco BANCO, double saldo) {
        this.CLIENTE = CLIENTE;
        this.BANCO = BANCO;
        this.saldo = saldo;
    }

    public void imprime(){
        System.out.println("Banco: "+this.BANCO.getNOME());
        System.out.println("Agência: "+this.BANCO.getAGENCIA());
        System.out.println("Nome: "+this.CLIENTE.getNome());
        System.out.println("CPF: "+this.CLIENTE.getCPF());
        System.out.println("Saldo: "+this.saldo);
    }

    public Banco getBANCO() {
        return BANCO;
    }

    public Usuario getCLIENTE() {
        return CLIENTE;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
