package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Pedido {
    private String item;
    private Status status;

    public Pedido(String item, Status status) {
        this.item = item;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "item='" + item + '\'' +
                ", status=" + status +
                '}';
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
