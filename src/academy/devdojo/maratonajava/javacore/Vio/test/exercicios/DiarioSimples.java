package academy.devdojo.maratonajava.javacore.Vio.test.exercicios;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiarioSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File diario = new File("diario.txt");

        System.out.println("=== MEU DIÁRIO ===");
        System.out.print("Escreva sua anotação: ");
        String anotacao = input.nextLine();
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataAnotacao = dtf.format(ldt);

        try (FileWriter fw = new FileWriter(diario, true)){
            fw.write(" ["+dataAnotacao+"] "+anotacao+System.lineSeparator());
            fw.flush();
            System.out.println("Anotação salva!"+System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Não foi possível salvar a anotação.");
        }

        System.out.println("=== ANOTAÇÕES ANTERIORES ===");
        try (FileReader fr = new FileReader(diario)) {
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo.");
        }
    }
}
