package academy.devdojo.maratonajava.javacore.Oexception.runtimetest.exercicioproprio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContaBancariaTest {
    public static void main(String[] args) {
        try{
            lerArquivo();
        }catch (IOException e){
            System.out.println("Deu ruim.");
        }
    }

    public static void lerArquivo() throws IOException {
            FileReader file = new FileReader("inexistente");
    }
}
