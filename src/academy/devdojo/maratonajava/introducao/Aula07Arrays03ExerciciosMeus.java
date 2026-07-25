package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula07Arrays03ExerciciosMeus {
    public static void main(String[] args) {
        // Exercício 1: Ler 10 números, armazenar em um array e mostrar todos.
        //                Scanner scanner = new Scanner(System.in);
        //                int[] numeros = new int[10];
        //                for (int i=0;i<numeros.length;i++){
        //                    numeros[i] = scanner.nextInt();
        //                }
        //                for (int i=0;i<numeros.length;i++){
        //                    System.out.println(numeros[i]);
        //                }

        // Exercício 2: Ler 8 números e mostrar a soma total deles.
        //                Scanner scanner = new Scanner(System.in);
        //                int[] numeros = new int[8];
        //                int soma = 0;
        //                for (int i=0;i<numeros.length;i++){
        //                    numeros[i] = scanner.nextInt();
        //                    soma += numeros[i];
        //                }
        //                System.out.println(soma);

        // Exercício 3: Ler 10 números e mostrar o maior valor.
        //                Scanner scanner = new Scanner(System.in);
        //                int[] numeros = new int[10];
        //                int maiorValor = numeros[0];
        //                for (int i=0;i<numeros.length;i++){
        //                    numeros[i] = scanner.nextInt();
        //                    if (numeros[i]>maiorValor){
        //                        maiorValor = numeros[i];
        //                    }
        //                }
        //                System.out.println(maiorValor);

        // Exercício 4: Ler 10 números e mostrar quantos são pares.
        //                Scanner scanner = new Scanner(System.in);
        //                int[] numeros = new int[10];
        //                int quantidadePar = 0;
        //                for (int i=0;i<numeros.length;i++){
        //                    numeros[i] = scanner.nextInt();
        //                    if(numeros[i]%2==0){
        //                        quantidadePar++;
        //                    }
        //                }
        //                System.out.println(quantidadePar);

        // Exercício 5: Ler 10 números e descobrir o maior valor, a sua posição e quantas vezes ele aparece.
        //                        Scanner scanner = new Scanner(System.in);
        //                        int[] numeros = new int[10];
        //                        for (int i=0;i<numeros.length;i++) {
        //                            numeros[i] = scanner.nextInt();
        //                        }
        //                        int maiorValor = numeros[0];
        //                        int posicao = 0;
        //                        int quantidadeNumeros = 0;
        //
        //                        for (int i=0;i<numeros.length;i++){
        //                            if(numeros[i]>maiorValor){
        //                                maiorValor = numeros[i];
        //                                posicao = i;
        //                            }
        //                        }
        //                        for (int i=0;i<numeros.length;i++){
        //                            if (numeros[i] == maiorValor) {
        //                                quantidadeNumeros++;
        //                            }
        //                        }
        //                        System.out.println("Maior valor: "+maiorValor);
        //                        System.out.println("Posição: "+posicao);
        //                        System.out.println("Quantidade de vezes: "+quantidadeNumeros);

//         Exercício 6: Primeiro leia 10 números. Em seguida, insira um número e o código deverá dizer se existe ou não.
        //                Scanner scanner = new Scanner (System.in);
        //                int[] numero = new int[10];
        //                System.out.println("Escreva 10 números diferentes");
        //                for (int i = 0; i < numero.length; i++) {
        //                    numero[i] = scanner.nextInt();
        //                }
        //                System.out.println("Que número você quer ver se está dentro do array?:");
        //                int numeroDesejado = scanner.nextInt();
        //                int i;
        //                for (i = 0; i < numero.length; i++) {
        //                    if(numero[i]==numeroDesejado){
        //                        System.out.println("O número "+numeroDesejado+" existe! Ele está na posição "+i+".");
        //                        break;
        //                    }
        //                }
        //                if (i == numero.length){
        //                    System.out.println("O número "+numeroDesejado+" não existe dentro do array. Que pena!");
        //                }

        // Exercício 7: Leia 10 números e mostre o maior e sua posição.
        //                Scanner scanner = new Scanner (System.in);
        //                int[] numero = new int[10];
        //                System.out.println("Escreva 10 números aleatoriamente e descubra o maior, junto a sua posição:");
        //                for (int i = 0; i < numero.length; i++) {
        //                    numero[i] = scanner.nextInt();
        //                }
        //                int maiorNumero = numero[0];
        //                int posicao = 0;
        //                for (int i = 0; i < numero.length; i++) {
        //                    if (numero[i]>maiorNumero){
        //                        maiorNumero = numero[i];
        //                        posicao = i;
        //                    }
        //                }
        //                System.out.println("O maior número é o "+maiorNumero+", e sua posição é "+posicao+".");

        // Exercício 8; Leia 10 números e depois imprima eles na ordem invertida.
        //                Scanner scanner = new Scanner (System.in);
        //                int[] numero = new int[10];
        //                System.out.println("Escreva 10 números, e veja eles na ordem contrária da que você escreveu.");
        //                for (int i = 0; i < numero.length; i++){
        //                    numero[i] = scanner.nextInt();
        //                }
        //
        //                for (int i = numero.length-1; i >= 0; i-- ){
        //                    System.out.print(numero[i]+" ");
        //                }

        // Exercício 9: Leia 10 números e mostre o segundo maior valor.
        //                        Scanner scanner = new Scanner (System.in);
        //                        int[] numero = new int[10];
        //                        for (int i = 0; i < numero.length; i++){
        //                            numero[i] = scanner.nextInt();
        //                        }
        //                        int auxiliar = 0;
        //                        for (int i = 0; i < numero.length; i++){
        //                            for (int j = i+1; j < numero.length; j++) {
        //                                if (numero[i]>numero[j]){
        //                                    auxiliar = numero[i];
        //                                    numero[i] = numero[j];
        //                                    numero[j] = auxiliar;
        //                                }
        //                            }
        //                        }
        //                        System.out.println("Pagamento sequência ordenada dos números que você digitou é: ");
        //                        for (int i = 0; i < numero.length; i++){
        //                            System.out.print(+numero[i]+" ");
        //                        }
        //                        System.out.println();
        //                        System.out.println("Logo, o segundo maior valor é: "+numero[numero.length-2]+".");
    }
}



