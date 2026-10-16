package academy.devdojo.maratonajava.javacore.Rdates.exercicio;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class RelogioMundial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma hora: ");
        int hora = input.nextInt();
        while (hora > 23 || hora < 0){
            System.out.println("Hora inválida! Tente novamente: ");
            hora = input.nextInt();
        }
        int minutos = input.nextInt();
        while (minutos > 60 || minutos < 0){
            System.out.println("Hora inválida! Tente novamente: ");
            minutos = input.nextInt();
        }
        LocalDateTime horaDigitada = LocalDateTime.of(LocalDate.now(), LocalTime.of(hora,minutos));
        ZonedDateTime horaLocalUsuario = horaDigitada.atZone(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime horaLocalNovaYork = horaLocalUsuario.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime horaLocalLondres = horaLocalUsuario.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime horaLocalTokyo = horaLocalUsuario.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        System.out.println("=== RELÓGIO MUNDIAL ===");
        System.out.println("Hora local ("+horaLocalUsuario.getZone()+"): "+dtf.format(horaLocalUsuario)+"\n");
        System.out.println("São Paulo: "+dtf.format(horaLocalUsuario));
        System.out.println("Nova York: "+dtf.format(horaLocalNovaYork));
        System.out.println("Londres: "+dtf.format(horaLocalLondres));
        System.out.println("Tokyo: "+dtf.format(horaLocalTokyo));
    }
}
