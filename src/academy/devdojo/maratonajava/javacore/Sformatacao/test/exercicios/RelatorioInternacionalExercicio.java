package academy.devdojo.maratonajava.javacore.Sformatacao.test.exercicios;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class RelatorioInternacionalExercicio {
    public static void main(String[] args) {
        // criar o Scanner para que o input aconteça.
        Scanner scanner = new Scanner(System.in);

        // criar o Calendar, NumberFormat e DateFormat em formas de arrays para economizar linhas e criar a formatação.
        Calendar calendar = Calendar.getInstance();
        Locale localeBR = new Locale("pt","BR");

        NumberFormat[] nft = new NumberFormat[3];
        DateFormat[] dft = new DateFormat[3];
        nft[0] = NumberFormat.getCurrencyInstance(localeBR);
        nft[1] = NumberFormat.getCurrencyInstance(Locale.US);
        nft[2] = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        dft[0] = DateFormat.getDateInstance(DateFormat.FULL,localeBR);
        dft[1] = DateFormat.getDateInstance(DateFormat.FULL,Locale.US);
        dft[2] = DateFormat.getDateInstance(DateFormat.FULL,Locale.FRANCE);

        // receber a data e o valor numérico.

        System.out.println("CONVERSOR INTERNACIONAL\n");

        System.out.println("Digite um dia:");
        int dia = scanner.nextInt();
        while (dia > 31 || dia < 1){
            System.out.println("Valor inválido! Por favor insira outro:");
            dia = scanner.nextInt();
        }

        System.out.println("Digite um mês: ");
        int mes = scanner.nextInt();
        while (mes > 12 || mes < 1){
            System.out.println("Valor inválido! Por favor insira outro:");
            mes = scanner.nextInt();
        }

        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();
        calendar.set(ano,mes-1,dia);

        System.out.println("Digite um valor numérico aleatório: ");
        double valor = scanner.nextDouble();


        // imprimir o relatório formatado referente aos países.

        System.out.println("=== Relatório BR ===");
        System.out.println("Data: "+dft[0].format(calendar.getTime()));
        System.out.println("Valor: "+nft[0].format(valor));
        System.out.println();

        System.out.println("=== Relatório US ===");
        System.out.println("Data: "+dft[1].format(calendar.getTime()));
        System.out.println("Valor: "+nft[1].format(valor));
        System.out.println();

        System.out.println("=== Relatório FR ===");
        System.out.println("Data: "+dft[2].format(calendar.getTime()));
        System.out.println("Valor: "+nft[2].format(valor));
    }
}
