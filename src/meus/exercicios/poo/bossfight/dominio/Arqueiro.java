package meus.exercicios.poo.bossfight.dominio;

public class Arqueiro extends Personagem implements Ataques{
    protected int danoRecebido = 35;

    public Arqueiro(Boss boss) {
        this.vida = 135;
        this.dano = 70;
        this.boss = boss;
    }

    public void imprimirPersonagem(){
        System.out.println("Vida do Arqueiro: "+this.vida);
        System.out.println("Dano do Arqueiro: "+this.dano);
        System.out.println();
    }

    @Override
    public void ataque() {
        System.out.println();
        if (boss.getVida() < 0){
            System.out.println("O Colosso já está morto!");
        }else{
            if (this.vida > 0) {
                if (this.boss.getFraquezaAtual() == Fraquezas.ATAQUE_DE_PROJETIL ) {
                    boss.setVida(boss.getVida() - this.dano);
                    System.out.println("O Arqueiro acertou uma flecha, causando " + this.dano + " pontos de dano!");
                    if(boss.getVida() < 0){
                        System.out.println("Colosso está morto! O mundo está salvo!");
                    }else{
                        boss.setFraquezaAtual(Fraquezas.ATAQUE_DE_MAGIA);
                        boss.imprimirVida();
                    }
                } else {
                    this.vida -= danoRecebido;
                    System.out.println("O Colosso conseguiu se defender da flecha e feriu o Arqueiro em "+danoRecebido+" pontos de dano!");
                    if (this.vida <= 0) {
                        System.out.println("O Arqueiro está morto!");
                        this.vida = 0;
                    } else {
                        System.out.println("Vida atual do Arqueiro: " + this.vida);
                        boss.imprimirVida();
                    }
                }
            } else {
                System.out.println("O Arqueiro está morto!");
            }
        }
    }
}
