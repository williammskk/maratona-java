package academy.devdojo.maratonajava.javacore.Oexception.errortest;

public class StackOverFlowTest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
