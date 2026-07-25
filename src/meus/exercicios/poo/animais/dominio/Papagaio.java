package meus.exercicios.poo.animais.dominio;

public class Papagaio extends Animal implements Adestramento{
    public Papagaio(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome+" emite som: Rááá!");
    }

    @Override
    public void executarComando(String comando) {
        System.out.println(this.nome+" executa comando falar: "+comando);
    }
}
