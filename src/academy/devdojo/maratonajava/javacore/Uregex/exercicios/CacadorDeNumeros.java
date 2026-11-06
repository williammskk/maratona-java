package academy.devdojo.maratonajava.javacore.Uregex.exercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CacadorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");

        String texto = scanner.nextLine();
        String regex = "\\s";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println();

        System.out.println("==== RESULTADOS ====");

        StringBuilder digitos = new StringBuilder();
        StringBuilder posicoes = new StringBuilder();
        int total = 0;

        while (matcher.find()){
            digitos.append(matcher.group()).append(" ");
            posicoes.append(matcher.start()).append(" ");
            total++;
        }

        System.out.println("Dígitos encontrados: "+ digitos);
        System.out.println("Posições encontradas: "+ posicoes);
        System.out.println("Total de dígitos: "+ total);
    }
}
