package meus.exercicios.poo.sistemaveiculos.dominio;

public class Moto extends Veiculo{
    private final int cilindradas = 500;

    public Moto() {
        this.modelo = "Ninjinha";
        this.velocidadeMaxima = 180;
    }

    @Override
    public void imprimeModeloEVelocidade() {
        System.out.println(modelo+" - "+velocidadeMaxima+"km/h");
    }

    public void imprimirEspecificidade(){
        System.out.println(modelo+" - Cilindradas: "+cilindradas);
    }
}
