package academy.devdojo.maratonajava.javacore.Oexception.exceptiontest.Zexercicioproprio;

import java.io.FileReader;
import java.io.IOException;

public class LerArquivoTest {
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
