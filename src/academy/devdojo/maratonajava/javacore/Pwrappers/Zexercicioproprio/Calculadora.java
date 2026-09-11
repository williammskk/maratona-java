package academy.devdojo.maratonajava.javacore.Pwrappers.Zexercicioproprio;

public class Calculadora {
    public static void calcularOperacao(int valor1, int valor2, char operacao) {
        System.out.print("Operação: ");
        try {
            Integer v1 = valor1;
            Integer v2 = valor2;
            if (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/'){
                throw new OperacaoInvalidaException();
            }
            if (operacao == '+') {
                System.out.println(v1 + " + " + v2 + " = " + (v1 + v2));
            } else if (operacao == '-') {
                System.out.println(v1 + " - " + v2 + " = " + (v1 - v2));
            } else if (operacao == '*') {
                System.out.println(v1 + " * " + v2 + " = " + (v1 * v2));
            } else {
                if (v2 == 0) {
                    throw new DivisorZeroException();
                } else {
                    System.out.println(v1 + " / " + v2 + " = " + (v1 / v2));
                }
            }
        } catch (OperacaoInvalidaException | DivisorZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
