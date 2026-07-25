package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominiorestaurante;

public class Pedido {
    private String nomePedido;
    private final String numPedido;
    private double precoPedido;

    public Pedido(String nomePedido, String numPedido, double precoPedido) {
        this.nomePedido = nomePedido;
        this.numPedido = numPedido;
        this.precoPedido = precoPedido;
    }

    public void imprime(){
        System.out.println("Item: "+this.nomePedido);
        System.out.println("Pedido: "+this.numPedido);
        System.out.println("Preço: "+this.precoPedido);
    }

    public String getNumPedido() {
        return numPedido;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public double getPrecoPedido() {
        return precoPedido;
    }

    public void setPrecoPedido(double precoPedido) {
        this.precoPedido = precoPedido;
    }
}
