package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        int valorCarro = 50000;
        for(int parcela=valorCarro;parcela>=1;parcela--) {
            double parcelaCarro = (double) valorCarro / parcela;
            if (parcelaCarro < 1000) {
                continue;
            }
            System.out.println(parcela + "x de R$" + parcelaCarro);
        }
    }
}
