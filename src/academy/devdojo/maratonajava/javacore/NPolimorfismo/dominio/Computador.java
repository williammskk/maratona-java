package academy.devdojo.maratonajava.javacore.NPolimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(double valor) {
        super("Computador", valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }


}
