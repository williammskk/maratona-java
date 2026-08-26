package meus.exercicios.poo.livro.dominio;

public interface Publicacao {
    void abrir();
    void fechar();
    void folhear(int p);
    void avancarPag();
    void voltarPag();
}
