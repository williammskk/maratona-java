package academy.devdojo.maratonajava.javacore.Uregex.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassificadorDeTokens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha quantos dados deseja inserir: ");
        int qtVezes = 0;
        try {
            qtVezes = input.nextInt();
            input.nextLine();
            if(qtVezes <= 0){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException | InputMismatchException e ){
            System.out.println("Valor inválido! Digite um número inteiro maior que zero.");
            System.exit(1);
        }

        StringBuilder sb = new StringBuilder();

        System.out.println("Insira os dados:");
        for (int i = 1; i <= qtVezes; i++) {
            String textoUsuario = input.nextLine();
            if(i != qtVezes){
                sb.append(textoUsuario).append(";");
            }else{
                sb.append(textoUsuario);
            }
        }

        String textoUsuario2 = sb.toString();
        Scanner scanner = new Scanner(textoUsuario2);
        scanner.useDelimiter(";");

        int totalString = 0;
        int totalInt = 0;
        int totalBoolean = 0;
        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int: "+i);
                totalInt++;
            }else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: "+b);
                totalBoolean++;
            }else{
                System.out.println("String: "+scanner.next());
                totalString++;
            }
        }

        System.out.println("Total de String: "+totalString);
        System.out.println("Total de Int: "+totalInt);
        System.out.println("Total de Boolean: "+totalBoolean);
    }
}
