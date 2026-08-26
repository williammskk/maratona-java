package meus.exercicios.poo.livro.dominio;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 1;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("Título: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("Total de Páginas: "+getTotPaginas());
        System.out.println("Página atual: "+getPagAtual());
        System.out.println("Status: "+getAberto());
        System.out.println("Leitor: "+getLeitor().getNome());
    }

    @Override
    public void abrir() {
        if(!aberto){
            aberto = true;
            System.out.println("O livro está aberto agora.");
        }else{
            System.out.println("O livro já está aberto.");
        }
    }

    @Override
    public void fechar() {
        if(aberto){
            aberto = false;
            System.out.println("O livro está fechado agora.");
        }else{
            System.out.println("O livro já está fechado.");
        }
    }

    @Override
    public void folhear(int p) {
        if(!aberto){
            System.out.println("O livro está fechado agora.");
            return;
        }
        if(p > getTotPaginas()){
            System.out.println("Avançou até a última página do livro "+getTitulo()+".");
            setPagAtual(totPaginas);
        }else if(p <= 0){
            System.out.println("Voltou até a primeira página do livro "+getTitulo()+".");
            setPagAtual(1);
        }else{
            System.out.println("Avançando diretamente para a página...");
            setPagAtual(p);
        }
        System.out.println("Página atual: " + getPagAtual());}

    @Override
    public void avancarPag() {
        if (!aberto) {
            System.out.println("O livro está fechado agora.");
            return;
        } else if (getPagAtual() == getTotPaginas()) {
            System.out.println("Não há como avançar! O livro já está na última página.");
            System.out.println("Página atual: "+getPagAtual());
            return;
        }
        System.out.println("Avançando uma página...");
        setPagAtual(getPagAtual()+1);
        System.out.println("Página atual: "+getPagAtual());
    }

    @Override
    public void voltarPag() {
        if(!aberto){
            System.out.println("O livro está fechado agora.");
            return;
        } else if (getPagAtual() == 1) {
            System.out.println("Não há como voltar! O livro já está na primeira página.");
            System.out.println("Página atual: "+getPagAtual());
            return;
        }
        System.out.println("Voltando uma página...");
        setPagAtual(getPagAtual()-1);
        System.out.println("Página atual: "+getPagAtual());
    }

    public String getAberto() {
        if(aberto){
            return "Aberto";
        }else{
            return "Fechado";
        }
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
}
