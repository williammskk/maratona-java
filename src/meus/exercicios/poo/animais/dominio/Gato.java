package meus.exercicios.poo.animais.dominio;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome+" emite som: Miau!");
    }
}
