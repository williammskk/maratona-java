package meus.exercicios.poo.imposto.dominio;

public abstract class Contribuinte {
    protected String nome;
    protected double rendaBruta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularImposto();

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        if(rendaBruta < 0){
            System.out.println("Erro! Renda menor que zero");
        } else {
            this.rendaBruta = rendaBruta;
        }
    }
}
