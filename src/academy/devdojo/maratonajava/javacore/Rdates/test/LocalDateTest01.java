package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2008, Month.MARCH,31);
        System.out.println(date.getDayOfWeek());
    }
}
