package academy.devdojo.maratonajava.javacore.NPolimorfismo.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.23;
    public Televisao(double valor) {
        super("Televisão", valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getValor() {
        return super.getValor();
    }
}
