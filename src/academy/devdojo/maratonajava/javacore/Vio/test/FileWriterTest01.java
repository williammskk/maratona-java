package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        // File
        // FileWriter
        // FileReader
        // BufferedWriter
        // BufferedReader
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)){
            fw.write("Teste ao escrever no arquivo.");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
