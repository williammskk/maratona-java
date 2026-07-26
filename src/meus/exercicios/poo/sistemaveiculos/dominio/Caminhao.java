package meus.exercicios.poo.sistemaveiculos.dominio;

public class Caminhao extends Veiculo {
    private final double capacidadeDeCarga = 20000;

    public Caminhao () {
        this.modelo = "Mercedin Benzin";
        this.velocidadeMaxima = 120;
    }

    @Override
    public void imprimeModeloEVelocidade() {
        System.out.println(modelo+" - "+velocidadeMaxima+"km/h");
    }

    public void imprimirEspecificidade(){
        System.out.println(modelo+" - Capacidade de carga: "+capacidadeDeCarga+"kg");
    }
}
