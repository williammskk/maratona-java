package meus.exercicios.poo.controleremoto.test;

import meus.exercicios.poo.controleremoto.dominio.ControleRemoto;

public class ControleRemotoTest {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.ligar();

        controleRemoto.diminuirVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.diminuirVolume();

        controleRemoto.despausar();
        controleRemoto.pausar();
        controleRemoto.despausar();

        controleRemoto.desmutar();
        controleRemoto.mutar();
        controleRemoto.desmutar();
    }
}
