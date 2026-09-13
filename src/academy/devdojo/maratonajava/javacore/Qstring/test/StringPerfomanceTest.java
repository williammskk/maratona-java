package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(70000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+ (fim-inicio) + "ms.");

        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(70000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder "+ (fim2-inicio2) + "ms.");

        long inicio3 = System.currentTimeMillis();
        concatStringBuffer(70000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder "+ (fim3-inicio3) + "ms.");
    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sbffer = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbffer.append(i);
        }
    }
}
