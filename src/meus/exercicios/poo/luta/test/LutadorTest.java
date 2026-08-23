package meus.exercicios.poo.luta.test;

import meus.exercicios.poo.luta.dominio.Luta;
import meus.exercicios.poo.luta.dominio.Lutador;

public class LutadorTest {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Ultra Skull","França",31,1.75,68.9,11,3,1);
        l[1] = new Lutador("Valentuço","Brasil",29,1.68,57.8,14,2,3);
        l[2] = new Lutador("Shadow Knight","Estados Unidos",35,1.65,80.9,12,2,1);
        l[3] = new Lutador("Alad","Austrália",28,1.93,81.6,13,0,2);
        l[4] = new Lutador("Pipoca","Brasil",37,1.70,119.3,5,4,3);
        l[5] = new Lutador("Big Dog","Estados Unidos",30,1.81,105.7,12,2,4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1],l[2]);
        UEC01.lutar();
    }
}
