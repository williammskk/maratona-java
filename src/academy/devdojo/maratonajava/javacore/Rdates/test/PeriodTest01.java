package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);
        Period d1 = Period.between(now, nowAfterTwoYears);
        Period d2 = Period.ofDays(10);
        Period d3 = Period.ofWeeks(60);
        Period d4 = Period.ofMonths(4);
        Period d5 = Period.ofYears(3);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

        System.out.println(now.until(now.plusDays(d3.getDays()), ChronoUnit.MONTHS));
    }
}
