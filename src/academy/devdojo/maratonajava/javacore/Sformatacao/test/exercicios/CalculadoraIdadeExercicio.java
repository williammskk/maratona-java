package academy.devdojo.maratonajava.javacore.Sformatacao.test.exercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculadoraIdadeExercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o dia: ");
        int dia = input.nextInt();
        while(dia < 1 || dia > 31){
            System.out.println("Dia inválido, tente novamente: ");
            dia = input.nextInt();
        }
        System.out.println("Insira o mês: ");
        int mes = input.nextInt();;
        while(mes < 0 || mes > 12){
            System.out.println("Mês inválido, tente novamente: ");
            mes = input.nextInt();
        }
        System.out.println("Insira o ano: ");
        int ano = input.nextInt();

        LocalDate nascimento = LocalDate.of(ano,mes,dia);
        LocalDate hoje = LocalDate.now();
        LocalDate proximoAniversario = nascimento.withYear(hoje.getYear());
        if (proximoAniversario.isBefore(hoje) || proximoAniversario.isEqual(hoje)) {
            proximoAniversario = proximoAniversario.plusYears(1);
        }


        System.out.println("=== CALCULADORA DE IDADE ===");
        System.out.println("Data de nascimento: "+nascimento);
        System.out.println("Data de hoje: "+hoje);
        System.out.println("Idade: "+ChronoUnit.YEARS.between(nascimento,hoje));
        System.out.println("Dias vividos: "+ChronoUnit.DAYS.between(nascimento,hoje));
        System.out.println("Próximo aniversário em: "+ChronoUnit.DAYS.between(hoje,proximoAniversario));
    }
}
