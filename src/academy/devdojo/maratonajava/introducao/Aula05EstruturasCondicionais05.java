package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = '6';
        switch (dia) {
            case '1':
                System.out.println("É domingo, infelizmente...");
                break;
            case '2':
                System.out.println("Dia útil");
                break;
            case '3':
                System.out.println("Dia útil");
                break;
            case '4':
                System.out.println("Dia útil");
                break;
            case '5':
                System.out.println("Dia útil");
                break;
            case '6':
                System.out.println("Sexta uhuuuuuu");
                break;
            case '7':
                System.out.println("Sabadou!");
                break;
            default:
                System.out.println("Insira um valor de 1 a 7!");
        }
    }
}
