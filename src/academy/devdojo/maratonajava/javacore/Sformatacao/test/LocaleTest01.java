package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Normal: "+calendar.getTime());
        Locale localeBrasil = new Locale("pt","BR");
        Locale localeIndia = new Locale("hi","IN");
        Locale localeJapao = new Locale("ja","JP");
        Locale localeItalia = new Locale("it","IT");

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);

        System.out.println("Brasil: "+df1.format(calendar.getTime()));
        System.out.println("Índia: "+df2.format(calendar.getTime()));
        System.out.println("Japão: "+df3.format(calendar.getTime()));
        System.out.println("Itália: "+df4.format(calendar.getTime()));
    }
}
