package meus.exercicios.poo.calculadora.dominio;

public class Calculadora {
    public static double soma(double a, double b){
        return a+b;
    }

    public static double subtracao(double a, double b){
        return a-b;
    }

    public static double multiplicacao(double a, double b){
        return a*b;
    }

    public static double divisao(double a, double b){
        return a/b;
    }

    public static double potenciacao(double a, double b){
        double resultado = a;
        for (int i = 1; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }

    public static double fatorial(double a){
        if (a==0) return 1;
        double fatorial = a;
        for (double i = a; i > 1; i--) {
            fatorial *= (i-1);
        }
        return fatorial;
    }

    public static int fibonacci(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int somarAteN(int n){
        if(n == 1){
            return n;
        }
        return n + somarAteN(n-1);
    }
}
