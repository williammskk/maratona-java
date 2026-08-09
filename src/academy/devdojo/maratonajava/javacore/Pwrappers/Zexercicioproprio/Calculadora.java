package academy.devdojo.maratonajava.javacore.Pwrappers.Zexercicioproprio;

public class Calculadora {
    public Integer valor1;
    public Integer valor2;

    public static void calcularOperacao(String valor1, String valor2, char operacao) {
        System.out.print("Operação: ");
        try {
            Integer v1 = Integer.parseInt(valor1);
            Integer v2 = Integer.parseInt(valor2);
            if (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/'){
                throw new NumberFormatException();
            }
            if (operacao == '+') {
                System.out.println(v1 + " + " + v2 + " = " + (v1 + v2));
            } else if (operacao == '-') {
                System.out.println(v1 + " - " + v2 + " = " + (v1 - v2));
            } else if (operacao == '*') {
                System.out.println(v1 + " * " + v2 + " = " + (v1 * v2));
            } else {
                if (v2 == 0) {
                    throw new IllegalArgumentException();
                } else {
                    System.out.println(v1 + " / " + v2 + " = " + (v1 / v2));
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(valor1 + " "+ operacao +" " + valor2 + " = " + "Erro: Valor ou operação inválido(a)!");
        } catch (IllegalArgumentException e) {
            System.out.println(valor1 + " "+ operacao +" " + valor2 + " = " + "Erro: Divisor igual a zero!");
        }
    }
}
