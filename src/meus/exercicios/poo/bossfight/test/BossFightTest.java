package meus.exercicios.poo.bossfight.test;

import meus.exercicios.poo.bossfight.dominio.*;

import java.util.Scanner;

public class BossFightTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // CRIAÇÃO DOS PERSONAGENS:

        Boss boss = new Boss();
        Personagem arqueiro = new Arqueiro(boss);
        Personagem mago = new Mago(boss);
        Personagem cavaleiro = new Cavaleiro(boss);
        Personagem [] personagens = {arqueiro, mago, cavaleiro};
        int vidaTotal = CalcularVidaGuerreiros.somarVida(personagens);

        // IMPRIMINDO VIDA DOS PERSONAGENS:

        System.out.println("O Colosso está invadindo a vila! Use seu conhecimento de combate para derrotá-lo!");
        arqueiro.imprimirPersonagem();
        mago.imprimirPersonagem();
        cavaleiro.imprimirPersonagem();
        System.out.println("Vida total dos personagens: "+vidaTotal);
        System.out.println();
        boss.imprimirVida();

        // INTERAÇÃO

        System.out.println("Escolha seus ataques com sabedoria:");
        System.out.println("1 - Arqueiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Cavaleiro");

        while (boss.getVida() > 0 && vidaTotal > 0) {
            int resposta;
            System.out.println();
            resposta = input.nextInt();
            if (resposta > 3 || resposta <= 0){
                System.out.println("Escolha um número apenas de 1 a 3, tente novamente!");
                System.out.println();
            } else if (resposta == 1) {
                arqueiro.ataque();
            } else if (resposta == 2){
                mago.ataque();
            } else {
                cavaleiro.ataque();
            }
            vidaTotal = 0;
            for (Personagem personagem : personagens) {
                vidaTotal += personagem.getVida();
            }
            System.out.println("Vida total dos personagens: "+vidaTotal);

        }

        // RESULTADO FINAL:
        System.out.println();
        if (boss.getVida() < 0){
            System.out.println("Você conseguiu salvar o dia!");
        }else{
            System.out.println("Infelizmente, os guerreiros não conseguiram salvar o dia...");
        }
    }
}
