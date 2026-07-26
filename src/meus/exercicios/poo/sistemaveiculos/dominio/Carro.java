package meus.exercicios.poo.sistemaveiculos.dominio;

public class Carro extends Veiculo {
    private final int numeroDePassageiros = 5;

    public Carro() {
        this.modelo = "Fusquinha";
        this.velocidadeMaxima = 200;
    }

    @Override
    public void imprimeModeloEVelocidade() {
        System.out.println(modelo+" - "+velocidadeMaxima+"km/h");
    }

    public void imprimirEspecificidade(){
        System.out.println(modelo+" - Passageiros: "+numeroDePassageiros);
    }
}
