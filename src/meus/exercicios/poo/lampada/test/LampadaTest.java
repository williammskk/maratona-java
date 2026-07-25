package meus.exercicios.poo.lampada.test;

import meus.exercicios.poo.lampada.dominio.Lampada;


public class LampadaTest {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        System.out.println("Escolher estado: ");
        System.out.println("caso 1");
        lampada.setEstado(true);
        lampada.imprimeEstado();

        System.out.println("caso 2");
        lampada.setEstado(false);
        lampada.imprimeEstado();

        System.out.println("==============");

        System.out.println("Alterar estado: ");
        System.out.println("caso 1");
        lampada.alterarEstado();

        System.out.println("caso 2");
        lampada.alterarEstado();

        System.out.println("caso 3");
        lampada.alterarEstado();
    }
}
