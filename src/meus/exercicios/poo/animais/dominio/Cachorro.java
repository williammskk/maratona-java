package meus.exercicios.poo.animais.dominio;

public class Cachorro extends Animal implements Adestramento{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome+" emite som: Au au!");
    }

    @Override
    public void executarComando(String comando) {
        System.out.println(this.nome+" executa comando sentar: "+comando);
    }
}
