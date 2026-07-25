package academy.devdojo.maratonajava.javacore.NPolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
}
