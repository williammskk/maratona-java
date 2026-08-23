package meus.exercicios.poo.luta.dominio;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        this.desafiante = l1;
        this.desafiado = l2;
        if(desafiante.getCategoria().equals(desafiado.getCategoria()) && desafiante != desafiado){
            aprovada = true;
        }else{
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("Essa luta está inválida!");
        }
    }

    public void lutar(){
        if(this.aprovada){
            System.out.println("=================");
            System.out.println("####DESAFIANTE####");
            desafiante.apresentar();
            System.out.println("=================");
            System.out.println("####DESAFIADO####");
            desafiado.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("========== RESULTADO ==========");
            switch (vencedor) {
                case 0:
                    System.out.println("Empate!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do "+this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharluta();
                    break;
                case 2:
                    System.out.println("Vitória do "+this.desafiado.getNome());
                    this.desafiado.ganharluta();
                    this.desafiante.perderLuta();
                    break;
            }
            System.out.println("===============================");
        }else{
            System.out.println("A luta não pode acontecer");
        }
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
