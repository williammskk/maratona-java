package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nb = new NumberFormat[4];
        nb[0] = NumberFormat.getCurrencyInstance();
        nb[1] = NumberFormat.getCurrencyInstance(localeBR);
        nb[2] = NumberFormat.getCurrencyInstance(localeJP);
        nb[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 2_215.40;
        for (NumberFormat numberFormat : nb) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
