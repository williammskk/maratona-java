package academy.devdojo.maratonajava.javacore.Oexception.runtimetest.exercicioproprio;

public class ContaBancaraDominio {
    private double saldo = 3000;

    private void imprimirSaldo(){
        System.out.println("Saldo atual: "+saldo);
    }

    public double sacar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor inválido!");
        }else if(valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        saldo -= valor;
        imprimirSaldo();
        return valor;
    }
}
