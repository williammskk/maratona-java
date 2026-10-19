package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20210219",DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-02-19+05:00",DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-02-19",DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTime parse4 = LocalDateTime.parse("2026-10-19T18:50:49.6637306", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String agoraBR = LocalDate.now().format(formatoBR);
        System.out.println("Formato Brasil: \n"+agoraBR);

        DateTimeFormatter formatoAL = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMAN);
        String agoraAL = LocalDate.now().format(formatoAL);
        System.out.println("Formato Alemão: \n"+agoraAL);
    }
}
