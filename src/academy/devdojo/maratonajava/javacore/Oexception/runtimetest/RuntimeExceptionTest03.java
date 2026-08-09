package academy.devdojo.maratonajava.javacore.Oexception.runtimetest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceExcecao();
        }catch (FileNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    private static void talvezLanceExcecao() throws FileNotFoundException, SQLException{

    }
}
