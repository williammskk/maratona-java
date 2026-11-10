package academy.devdojo.maratonajava.javacore.Uregex.exercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentificarCaixaAltaEBaixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite qualquer texto para identificar caracteres em caixa alta e baixa: ");
        String texto = input.nextLine();

        String caixaAlta = "\\p{Lu}";
        String caixaBaixa = "\\p{Ll}";
        String numeros = "\\d";

        Pattern padraoAlto = Pattern.compile(caixaAlta);
        Pattern padraoBaixo = Pattern.compile(caixaBaixa);
        Pattern padraoNumeros = Pattern.compile(numeros);

        Matcher verificarAlto = padraoAlto.matcher(texto);
        Matcher verificarBaixo = padraoBaixo.matcher(texto);
        Matcher verificarNumeros = padraoNumeros.matcher(texto);

        System.out.println("Caracteres em caixa Alta: ");
        while (verificarAlto.find()){
            System.out.print(verificarAlto.group()+" -> ");
            System.out.print(verificarAlto.start()+1);
            System.out.println();
        }
        System.out.println("\n------------------------------");
        System.out.println("Caracteres em caixa Baixa: ");
        while (verificarBaixo.find()){
            System.out.print(verificarBaixo.group()+" -> ");
            System.out.print(verificarBaixo.start()+1);
            System.out.println();
        }
        System.out.println("\n------------------------------");
        System.out.println("Números: ");
        while (verificarNumeros.find()){
            System.out.print(verificarNumeros.group()+" -> ");
            System.out.print(verificarNumeros.start()+1);
            System.out.println();
        }
    }
}
