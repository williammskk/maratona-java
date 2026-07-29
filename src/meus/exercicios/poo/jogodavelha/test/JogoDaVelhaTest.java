package meus.exercicios.poo.jogodavelha.test;

import meus.exercicios.poo.jogodavelha.dominio.JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelhaTest {
    public static void main(String[] args) {

        // Preparar as váriaveis:

        char jogador1 = 'O';
        char jogador2 = 'X';
        char jogadorDaVez = jogador1;
        char[][] casas = new char[3][3];
        boolean resultadoAtual = JogoDaVelha.checarSeGanhouReto(casas);
        Scanner input = new Scanner(System.in);
        int jogadas = 0;

        // Inicializar o 3x3 com caixas vazias:

        for (int i = 0; i < casas.length; i++) {
            for (int j = 0; j < casas[i].length; j++) {
                casas[i][j] = '-';
            }
        }

        // Interatividade:

        while (jogadas < 9 && !resultadoAtual) {
            JogoDaVelha.imprimirJogo(casas);
            System.out.println("Digite um número de 1 a 3 (em X)");
            int x = input.nextInt();
            System.out.println("Digite um número de 1 a 3 (em Y)");
            int y = input.nextInt();
            if (x > 3 || x <= 0 || y > 3 || y <= 0) {
                System.out.println("Número inválido! Escolha outro.");
            } else if (casas[y - 1][x - 1] == 'X' || casas[y - 1][x - 1] == 'O') {
                System.out.println("Escolha uma caixa vazia!");
            } else {
                jogadas ++;
                casas[y - 1][x - 1] = jogadorDaVez;
                resultadoAtual = JogoDaVelha.checarSeGanhouReto(casas);
                if(resultadoAtual){
                    break;
                }else if (jogadorDaVez == jogador1) {
                    jogadorDaVez = jogador2;
                } else {
                    jogadorDaVez = jogador1;
                }
            }
        }

        // Imprimir resultado final:
        if(resultadoAtual){
            System.out.println("O jogador "+jogadorDaVez+" venceu o jogo!!!");
        }else{
            System.out.println("Empate!");
        }
    }

}
