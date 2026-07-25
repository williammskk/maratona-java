package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Jogo {
    private String nome;
    private String genero;
    private String plataforma;
    private double nota;

    public void init (String nome, String genero, String plataforma){
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public void init (String nome, String genero, String plataforma, double nota){
        this.init(nome, genero, plataforma);
        this.nota = nota;
    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(genero);
        System.out.println(plataforma);
        System.out.println(nota);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
