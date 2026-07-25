package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominiorestaurante;

public class NotaFiscal {
    private final Restaurante restaurante;
    private final Cliente cliente;
    private final Pedido pedido;
    private boolean status;

    public NotaFiscal(Restaurante restaurante, Cliente cliente, Pedido pedido) {
        this.restaurante = restaurante;
        this.cliente = cliente;
        this.pedido = pedido;
    }

    public void imprime(){
        restaurante.imprime();
        cliente.imprime();
        pedido.imprime();
        if(status){
            System.out.println("Status: Entregue.");
        }else{
            System.out.println("Status: Em preparo.");
        }
        System.out.println();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
