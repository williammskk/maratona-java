package academy.devdojo.maratonajava.javacore.NPolimorfismo.test;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
