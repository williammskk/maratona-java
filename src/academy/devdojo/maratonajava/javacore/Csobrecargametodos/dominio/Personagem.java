package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Personagem {
    private String nome;
    private String tipo;
    private int terrorradius;
    private double velocidade;
    private String perks;

    public void init(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void init(String nome, String tipo, int terrorradius, double velocidade){
        this.init(nome, tipo);
        this.terrorradius = terrorradius;
        this.velocidade = velocidade;
    }

    public void init(String nome, String tipo, int terrorradius, double velocidade, String perks){
        this.init(nome, tipo, terrorradius, velocidade);
        this.perks = perks;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.terrorradius);
        System.out.println(this.velocidade);
        System.out.println(this.perks);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerks() {
        return perks;
    }

    public void setPerks(String perks) {
        this.perks = perks;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getTerrorradius() {
        return terrorradius;
    }

    public void setTerrorradius(int terrorradius) {
        this.terrorradius = terrorradius;
    }
}
