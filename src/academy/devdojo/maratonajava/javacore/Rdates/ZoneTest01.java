package academy.devdojo.maratonajava.javacore.Rdates;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZoneId spZone = ZoneId.of("America/Sao_Paulo");
        System.out.println(tokyoZone);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        ZonedDateTime zonedDateTime1 = ldt.atZone(tokyoZone);
        ZonedDateTime zonedDateTime2 = ldt.atZone(spZone);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = ldt.atOffset(offsetManaus);
        System.out.println(offsetDateTime);
    }
}
