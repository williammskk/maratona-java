package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        int valorCarro = 50000;
        for(int parcela=1;parcela<=valorCarro;parcela++) {
            double parcelaCarro = (double) valorCarro / parcela;
            if (parcelaCarro >= 1000) {
                System.out.println(parcela + "x de R$" + parcelaCarro);
            } else {
                break;
            }
        }
    }
}
