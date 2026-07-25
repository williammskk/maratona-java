package academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Veiculo;

public class Bicicleta extends Veiculo implements Acoes {

    public Bicicleta() {
        this.nome = "Bicicleta";
        this.velocidadeMaxima= 40;
    }

    @Override
    public void imprimirNomeEVelocidade() {
        System.out.println("Bicicleta: "+super.getNome()+" - Velocidade Máxima: "+super.getVelocidadeMaxima()+"km/h");
    }

    @Override
    public void acao() {
        System.out.println("Ação: Pedalando na ciclovia...");
    }
}
