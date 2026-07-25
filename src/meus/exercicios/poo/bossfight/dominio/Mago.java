package meus.exercicios.poo.bossfight.dominio;

public class Mago extends Personagem implements Ataques {
    protected int danoRecebido = 55;

    public Mago(Boss boss) {
        this.boss = boss;
        this.vida = 115;
        this.dano = 220;
    }

    public void imprimirPersonagem(){
        System.out.println("Vida do Mago: "+this.vida);
        System.out.println("Dano do Mago: "+this.dano);
        System.out.println();
    }

    @Override
    public void ataque() {
        System.out.println();
        if (boss.getVida() < 0) {
            System.out.println("O Colosso já está morto!");
        } else {
            if (this.vida > 0) {
                if (this.boss.getFraquezaAtual() == Fraquezas.ATAQUE_DE_MAGIA) {
                    boss.setVida(boss.getVida() - this.dano);
                    System.out.println("O Mago acertou um feitiço, causando " + this.dano + " pontos de dano!");
                    if (boss.getVida() < 0) {
                        System.out.println("Colosso está morto! O mundo está salvo!");
                    } else {
                        boss.setFraquezaAtual(Fraquezas.ATAQUE_CORPO_A_CORPO);
                        boss.imprimirVida();
                    }
                } else {
                    this.vida -= danoRecebido;
                    System.out.println("O Colosso conseguiu se defender do feitiço, ferindo o Mago em "+danoRecebido+" pontos de dano!");
                    if (this.vida <= 0) {
                        System.out.println("O Mago está morto!");
                        this.vida = 0;
                    } else {
                        System.out.println("Vida atual do Mago: " + this.vida);
                        boss.imprimirVida();
                    }
                }
            } else {
                System.out.println("O Mago está morto!");
            }
        }
    }
}
