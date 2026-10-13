package academy.devdojo.maratonajava.javacore.Rdates.exercicio.AgendaDePagamentos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class AgendaDePagamentos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Usuário digita uma data:
        System.out.println("Digite uma data para vencimento");
        System.out.println("Dia: ");
        int dia = input.nextInt();
        System.out.println("Mês: ");
        int mes = input.nextInt();
        System.out.println("Ano: ");
        int ano = input.nextInt();

        // É criado na memória essa data:
        LocalDate data = LocalDate.of(ano, mes, dia);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        // Verifica se cai em um dia útil ou não:
        LocalDate novaData = VerificarSeDiaUtil.verificarSeDiaUtil(data);


        // Exibe o resultado:
        System.out.println("=== AGENDA DE PAGAMENTOS ===");
        System.out.println("Data informada: " + dtf.format(data));
        System.out.println("Dia da semana: " + data.getDayOfWeek() + "\n");

        System.out.println("Data de vencimento ajustada: " + dtf.format(novaData));
        System.out.println("Dia da semana: " + novaData.getDayOfWeek() + "\n");
        System.out.println("Primeiro dia do mês: " +dtf.format(data.with(TemporalAdjusters.firstDayOfMonth())));
        System.out.println("Último dia do mês: " +dtf.format(data.with(TemporalAdjusters.lastDayOfMonth())));
        System.out.println("Próxima sexta-feira: " +dtf.format(data.with(TemporalAdjusters.next(DayOfWeek.FRIDAY))));
    }
}
