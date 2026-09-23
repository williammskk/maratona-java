package academy.devdojo.maratonajava.javacore.Sformatacao.test.exercicios;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class GeradorNFExercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale localeBR = new Locale ("pt","BR");
        String nomeCliente = input.nextLine();
        int quantidadeItens = input.nextInt();
        double precoUnitario = input.nextDouble();
        double subTotal = quantidadeItens*precoUnitario;
        double impostoPorcentagem = 12;
        double impostoProduto = impostoPorcentagem/100*subTotal;

        Calendar calendar = Calendar.getInstance();
        DateFormat dft = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        NumberFormat nft = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("=== NOTA FISCAL=== ");
        System.out.println("Data de emissão: "+dft.format(calendar.getTime())+"\n");

        System.out.println("Cliente: "+nomeCliente);
        System.out.println("Quantidades: "+quantidadeItens+" unidades");
        System.out.println("Preço unitário: "+nft.format(precoUnitario));
        System.out.println("Subtotal: "+nft.format(subTotal));
        System.out.println("Imposto ("+impostoPorcentagem+"%): "+nft.format(impostoProduto));
        System.out.println("Total: "+(nft.format(subTotal+impostoProduto)));
    }
}
