package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(texto);

        System.out.println("texto:  "+texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.print("Posições encontradas matcher 1: ");
        while(matcher1.find()){
            System.out.print(matcher1.start()+" ");
        }

        System.out.println("\n------------------------------------");

        String regex2 = "aba";
        String texto2 = "abababa";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("texto 2: "+texto2);
        System.out.println("índice:  0123456789");
        System.out.println("regex: "+regex2);
        System.out.print("Posições encontradas matcher 2: ");
        while(matcher2.find()){
            System.out.print(matcher2.start()+" ");
        }
    }
}
