package academy.devdojo.maratonajava.javacore.Sformatacao.exercicios;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class CotacaoMoedasExercicio {
    public static void main(String[] args) {
        // Cria o Scanner para o usuário poder interagir:

        Scanner input = new Scanner(System.in);

        // Gera a data:

        Calendar calendar = Calendar.getInstance();
        DateFormat dft = DateFormat.getDateInstance(DateFormat.FULL);

        // Formata a moeda nos idiomas para realizar a conversão:

        NumberFormat[] nft = new NumberFormat[4];
        Locale localeBR = new Locale("pt","BR");
        nft[0] = NumberFormat.getCurrencyInstance(localeBR);
        nft[1] = NumberFormat.getCurrencyInstance(Locale.US);
        nft[2] = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        nft[3] = NumberFormat.getCurrencyInstance(Locale.UK);

        // Pede ao usuário para digitar o valor em reais:

        System.out.println("=== COTAÇÃO DO DIA ===");
        System.out.println("Data: "+dft.format(calendar.getTime())+"\n");
        System.out.println("Digite um valor em reais: ");
        double valor = input.nextDouble();

        // Exibe a conversão:

        System.out.println();
        System.out.println("=== Conversões ===");
        System.out.println("Brasil: "+nft[0].format(valor));
        System.out.println("EUA: "+nft[1].format(valor/5.10));
        System.out.println("Europa: "+nft[2].format(valor/5.84));
        System.out.println("Reino Unido: "+nft[3].format(valor/6.89));
    }
}
