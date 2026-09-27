package academy.devdojo.maratonajava.javacore.Rdates.exercicio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class SistemaDeAgendamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Usuário digita o compromisso:

        System.out.print("Compromisso a agendar: ");
        String compromisso = input.nextLine();

        // Usuário digita a data:
        System.out.println("Dia: ");
        int dia = input.nextInt();
        while (dia < 1 || dia > 31){
            System.out.println("Dia inválido! Tente novamente:");
            dia = input.nextInt();
        }

        System.out.println("Mês: ");
        int mes = input.nextInt();
        while (mes < 1 || mes > 12){
            System.out.println("Mês inválido! Tente novamente:");
            mes = input.nextInt();
        }

        System.out.println("Ano: ");
        int ano = input.nextInt();

        LocalDate dataCompromisso = LocalDate.of(ano,mes,dia);

        // Usuário digita o horário:

        System.out.println("Hora(s): ");
        int hora = input.nextInt();
        while (hora < 0 || hora > 23){
            System.out.println("Hora inválida! Tente novamente:");
            hora = input.nextInt();
        }

        System.out.println("Minuto(s): ");
        int minutos = input.nextInt();
        while (minutos < 0 || minutos > 60){
            System.out.println("Minutos inválidos! Tente novamente:");
            minutos = input.nextInt();
        }

        System.out.println("Segundo(s): ");
        int segundos = input.nextInt();
        while (segundos < 0 || segundos > 60){
            System.out.println("Segundos inválidos! Tente novamente:");
            segundos = input.nextInt();
        }

        LocalTime horaCompromisso = LocalTime.of(hora,minutos,segundos);

        // Compromisso é agendado

        LocalDateTime agendamentoCompromisso = dataCompromisso.atTime(horaCompromisso);

        // Pega a data de hoje e calcula quanto tempo até o compromisso:
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();
        LocalDateTime dataEHoraAtual = LocalDateTime.of(dataAtual,horaAtual);
        long diasAteCompromisso = ChronoUnit.DAYS.between(dataAtual,dataCompromisso);
        long horasAteCompromisso = ChronoUnit.HOURS.between(dataEHoraAtual,agendamentoCompromisso);

        // Formata a data e horário para Português-BR:

        DateTimeFormatter dtfData = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(new Locale("pt","BR"));
        DateTimeFormatter dtfHora = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(new Locale("pt","BR"));
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM).withLocale(new Locale("pt","BR"));

        // Exibir o agendamento e o prazo:

        System.out.println("=== SISTEMA DE AGENDAMENTO ===");
        System.out.println("Compromisso: "+compromisso);
        System.out.println("Agendado para: "+dataCompromisso.format(dtfData)+" às "+horaCompromisso.format(dtfHora)+"\n");
        System.out.println("=== INFORMAÇÕES ===");
        System.out.println("Data de hoje: "+dataAtual.format(dtfData));
        System.out.println("Hora atual: "+horaAtual.format(dtfHora));
        System.out.println("Data e hora atual: "+dataEHoraAtual.format(dtf)+"\n");
        System.out.println("Dias até o compromisso: "+diasAteCompromisso+" dias");
        System.out.println("Horas até o compromisso: "+horasAteCompromisso+" horas");
    }
}
