package academy.devdojo.maratonajava.javacore.Oexception.runtimetest;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try{
            divisao(1,0);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    public static int divisao(int a, int b){
        if (b == 0){
            throw new ArithmeticException("O divisor não deve ser 0.");
        }
        return a/b;
    }
}
