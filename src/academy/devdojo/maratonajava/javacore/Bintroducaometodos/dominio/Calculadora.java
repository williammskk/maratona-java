package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtracaoDoisNumeros(){
        System.out.println(21-2);
    }

    public void multiplicacaoDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num1 == 0){
            return num2;
        }else if(num2 == 0){
            return num1;
        }
        return num1/num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do Altera Dois Números: ");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }

    public int somaArray (int[] array){
        int soma = 0;
        for(int temp : array){
            soma += temp;
        }
        return soma;
    }
}
