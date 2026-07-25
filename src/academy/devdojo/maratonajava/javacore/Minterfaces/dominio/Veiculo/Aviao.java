package academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Veiculo;

public class Aviao extends Veiculo implements Acoes {

    public Aviao() {
        this.nome = "Avião";
        this.velocidadeMaxima = 900;
    }

    @Override
    public void imprimirNomeEVelocidade() {
        System.out.println("Avião: "+super.getNome()+" - Velocidade Máxima: "+super.getVelocidadeMaxima()+"km/h");
    }

    @Override
    public void acao() {
        System.out.println("Ação: Decolando na pista...");
    }

    @Override
    public void abastecimento() {
        System.out.println("Abastecendo com querosene...");
    }
}
