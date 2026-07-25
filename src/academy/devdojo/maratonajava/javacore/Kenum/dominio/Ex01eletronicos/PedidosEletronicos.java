package academy.devdojo.maratonajava.javacore.Kenum.dominio.Ex01eletronicos;

public class PedidosEletronicos {
    private String nome;
    private PriodadeEletronicos prioridade;

    public PedidosEletronicos(String nome, PriodadeEletronicos prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public void imprime(){
        System.out.println("Pedido: "+this.nome+" - Prioridade: "+prioridade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
