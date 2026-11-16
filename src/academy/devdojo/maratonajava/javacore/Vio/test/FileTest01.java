package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println("Path: "+file.getPath());
            System.out.println("Absolute Path: "+file.getAbsolutePath());
            System.out.println("Is Directory: "+file.isDirectory());
            System.out.println("Is File: "+file.isFile());
            System.out.println("Is Hidden: "+file.isHidden());
            System.out.println("Last Modified: "+ LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.systemDefault()));
            System.out.println("Exists: "+file.exists());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
