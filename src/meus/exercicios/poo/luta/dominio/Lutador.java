package meus.exercicios.poo.luta.dominio;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, empates, derrotas;

    public Lutador(String no, String na, int id, double alt, double pe, int v, int e, int d) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = alt;
        this.peso = pe;
        this.vitorias = v;
        this.empates = e;
        this.derrotas = d;
        if(peso < 52.2){
            this.categoria = "Inválido";
        } else if(peso <= 70.3){
            this.categoria = "Leve";
        } else if(peso <= 83.9){
            this.categoria = "Médio";
        } else if(peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public void apresentar(){
        System.out.println("Lutador: "+this.nome);
        System.out.println("Origem: "+this.nacionalidade);
        System.out.println("Idade: "+this.idade);
        System.out.println("Altura: "+this.altura);
        System.out.println("Peso: "+this.peso);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Vitórias: "+this.vitorias);
        System.out.println("Empates: "+this.empates);
        System.out.println("Derrotas: "+this.derrotas);
    }

    public void status(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("V: "+this.vitorias);
        System.out.println("E: "+this.empates);
        System.out.println("D: "+this.derrotas);
    }

    public void ganharluta(){
        this.vitorias += 1;
    }

    public void empatarLuta(){
        this.empates +=1;
    }

    public void perderLuta(){
        this.derrotas += 1;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
}