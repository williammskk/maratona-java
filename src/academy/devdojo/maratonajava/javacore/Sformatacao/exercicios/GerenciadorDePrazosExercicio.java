package academy.devdojo.maratonajava.javacore.Sformatacao.exercicios;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class GerenciadorDePrazosExercicio {
    public static void main(String[] args) {
        // Cria o Scanner para o usuário poder interagir:

        Scanner input = new Scanner(System.in);

        // Pede ao usuário para inserir a tarefa:

        System.out.println("Insira a tarefa: ");
        String tarefa = input.nextLine();
        LocalDate hoje = LocalDate.now();

        // Usuário digita a data limite da tarefa:

        System.out.println("Insira o dia: ");
        int dia = input.nextInt();
        while (dia < 1 || dia > 31){
            System.out.println("Dia inválido! Tente novamente:");
            dia = input.nextInt();
        }
        System.out.println("Insira o mês: ");
        int mes = input.nextInt();
        while (mes < 1 || mes > 12){
            System.out.println("Mês inválido! Tente novamente:");
            mes = input.nextInt();
        }
        System.out.println("Insira o ano: ");
        int ano = input.nextInt();

        // Criar o status:
        String status;

        // Estabelecer e formatar o prazo:
        LocalDate dataLimite = LocalDate.of(ano,mes,dia);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(new Locale("pt","BR"));
        Long diferenca = ChronoUnit.DAYS.between(hoje,dataLimite);

        // Exibir o prazo ao usuário:

        System.out.println("=== GERENCIADOR DE PRAZOS ===");
        System.out.println("Tarefa: "+tarefa);
        System.out.println("Data de hoje: "+hoje);
        System.out.println("Data limite: "+dataLimite+"\n");
        if(diferenca <= 0){
            diferenca = Math.abs(diferenca);
            status = "Prazo vencido";
            System.out.println("Status: "+status);
            System.out.println("Dias em atraso: "+diferenca+"\n");
        }else{
            status = "Prazo em aberto";
            System.out.println("Status: "+status);
            System.out.println("Dias restantes: "+diferenca+"\n");
        }
        System.out.println("=== RESUMO ===");
        System.out.println("Início do prazo: "+hoje.format(dtf));
        System.out.println("Fim do prazo: "+dataLimite.format(dtf));
        System.out.println("Total de dias: "+diferenca);
    }
}
