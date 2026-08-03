package academy.devdojo.maratonajava.javacore.Oexception.exceptiontest;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarArquivo();
    }

    public static void criarArquivo(){
        File arquivo01 = new File("arquivo\\text.txt");
        try {
            boolean isCriado = arquivo01.createNewFile();
            System.out.println("Foi criado?: "+isCriado);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
