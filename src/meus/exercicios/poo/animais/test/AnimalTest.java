package meus.exercicios.poo.animais.test;

import meus.exercicios.poo.animais.dominio.*;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex",5);
        Animal gato = new Gato("Whiskers",5);
        Animal papagaio = new Papagaio("Louro",5);
        Animal[] animais = {cachorro, gato, papagaio};

        System.out.println("--- Sons ---");
        for (Animal animal : animais) {
            animal.emitirSom();
        }

        System.out.println("--- Adestramento ---");
        for (Animal animal : animais) {
            if(animal instanceof Adestramento){
                if (animal instanceof Cachorro){
                    ((Cachorro) animal).executarComando("Sentando...");
                } else if (animal instanceof Papagaio){
                    ((Papagaio) animal).executarComando("Falando...");
                }
            }
        }
    }
}
