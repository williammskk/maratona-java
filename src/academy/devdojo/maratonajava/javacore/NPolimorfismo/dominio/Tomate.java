package academy.devdojo.maratonajava.javacore.NPolimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public String dataValidadede = "12/02/2021";
    public Tomate(double valor) {
        super("Tomate", valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
