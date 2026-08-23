package meus.exercicios.poo.controleremoto.dominio;

public class ControleRemoto implements Comandos {
    private boolean status;
    private int volume;
    private boolean statusPause;

    public ControleRemoto() {
        this.status = false;
        this.volume = 50;
        this.statusPause = false;
    }

    @Override
    public void aumentarVolume() {
        if(!this.status){
            System.out.println("A televisão está desligada.");
            return;
        }
        if (this.volume <= 90) {
            this.volume += 10;
            System.out.println("Volume atual: " + this.volume);
        } else {
            System.out.println("Já está com volume máximo.");
        }
    }

    @Override
    public void diminuirVolume() {
        if(!this.status){
            System.out.println("A televisão está desligada.");
            return;
        }
        if (this.volume >= 10) {
            this.volume -= 10;
            System.out.println("Volume atual: " + this.volume);
        } else {
            System.out.println("Já está com volume minímo.");
        }
    }

    @Override
    public void pausar() {
        if(!this.status){
            System.out.println("A televisão está desligada.");
            return;
        }
        if (!this.statusPause) {
            this.statusPause = true;
            System.out.println("Pausado.");
        } else {
            System.out.println("Já está pausado.");
        }
    }

    @Override
    public void despausar() {
        if(!this.status){
            System.out.println("A televisão está desligada.");
            return;
        }
        if (this.statusPause) {
            this.statusPause = false;
            System.out.println("Despausado...");
        } else {
            System.out.println("Já está despausado.");
        }
    }

    @Override
    public void mutar() {
        if(!this.status){
            System.out.println("A televisão está desligada.");
            return;
        }
        if (this.volume >= 1) {
            this.volume = 0;
            System.out.println("Volume atual: " + this.volume);
        } else {
            System.out.println("Já está com volume minímo.");
        }
    }

    @Override
    public void desmutar() {
        if(!this.status){
            System.out.println("A televisão está desligada.");
            return;
        }
        if (this.volume >= 1) {
            System.out.println("Já está com volume!");
        } else {
            this.volume = 50;
            System.out.println("Volume atual: " + this.volume);
        }
    }
    @Override
    public void ligar() {
        if (!this.status) {
            this.status = true;
        } else {
            System.out.println("A televisão já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (this.status) {
            this.status = false;
        } else {
            System.out.println("A televisão já está desligada.");
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isStatusPause() {
        return statusPause;
    }

    public void setStatusPause(boolean statusPause) {
        this.statusPause = statusPause;
    }
}
