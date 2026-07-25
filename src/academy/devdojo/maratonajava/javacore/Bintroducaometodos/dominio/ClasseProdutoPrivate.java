package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ClasseProdutoPrivate {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            System.out.println("O preço não pode ser menor que zero!");
            return;
        }
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0){
            System.out.println(" pagamento quantidade em estoque não pode ser menor que zero!");
            return;
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void exibirInformacoes(){
        System.out.println("Produto: "+this.nome);
        System.out.println("Preço: "+this.preco);
        System.out.println("Quantidade em estoque: "+this.quantidadeEmEstoque);
    }
}
