package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Dia: "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mês: "+c.get(Calendar.MONTH));
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println();
        System.out.println("Horas: "+c.get(Calendar.HOUR));
        System.out.println("Minutos: "+c.get(Calendar.MINUTE));
        System.out.println("Segundos: "+c.get(Calendar.SECOND));
    }
}
