package meus.exercicios.poo.bossfight.dominio;

public class Cavaleiro extends Personagem implements Ataques {
    protected int danoRecebido = 30;

    public Cavaleiro(Boss boss) {
        this.boss = boss;
        this.vida = 270;
        this.dano = 120;
    }

    public void imprimirPersonagem(){
        System.out.println("Vida do Cavaleiro: "+this.vida);
        System.out.println("Dano do Cavaleiro: "+this.dano);
        System.out.println();
    }

    @Override
    public void ataque() {
        System.out.println();
        if (boss.getVida() < 0) {
            System.out.println("O Colosso já está morto!");
        } else {
            if (this.vida > 0) {
                if (this.boss.getFraquezaAtual() == Fraquezas.ATAQUE_CORPO_A_CORPO) {
                    boss.setVida(boss.getVida() - this.dano);
                    System.out.println("O Cavaleiro acertou um golpe de espada, causando " + this.dano + " pontos de dano!");
                    if (boss.getVida() < 0) {
                        System.out.println("Colosso está morto! O mundo está salvo!");
                    } else {
                        boss.setFraquezaAtual(Fraquezas.ATAQUE_DE_PROJETIL);
                        boss.imprimirVida();
                    }
                } else {
                    this.vida -= danoRecebido;
                    System.out.println("O Colosso conseguiu segurar a espada, golpeando o Cavaleiro em "+danoRecebido+" pontos de dano!");
                    if (this.vida <= 0) {
                        System.out.println("O Cavaleiro está morto!");
                        this.vida = 0;
                    } else {
                        System.out.println("Vida atual do Cavaleiro: " + this.vida);
                        boss.imprimirVida();
                    }
                }
            } else {
                System.out.println("O Cavaleiro está morto!");
            }
        }
    }
}
