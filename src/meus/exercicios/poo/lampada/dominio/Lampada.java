package meus.exercicios.poo.lampada.dominio;

public class Lampada {
    private boolean estado = false;

    public void imprimeEstado(){
        if(estado){
            System.out.println("A lâmpada está ligada.");
            return;
        }
        System.out.println("A lampada está desligada.");
    }

    public void alterarEstado(){
        estado = !estado;
        System.out.println(estado ? "ligada" : "desligada");
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
