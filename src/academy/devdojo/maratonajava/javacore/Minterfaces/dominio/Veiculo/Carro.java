package academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Veiculo;

public class Carro extends Veiculo implements Acoes{

    public Carro() {
        this.nome = "Carro";
        this.velocidadeMaxima = 200;
    }

    @Override
    public void imprimirNomeEVelocidade() {
        System.out.println("Carro: "+super.getNome()+" - Velocidade Máxima: "+super.getVelocidadeMaxima()+"km/h");
    }

    @Override
    public void acao() {
        System.out.println("Ação: Dirigindo na estrada...");
    }

    @Override
    public void abastecimento() {
        System.out.println("Abastecendo com gasolina...");
    }
}
