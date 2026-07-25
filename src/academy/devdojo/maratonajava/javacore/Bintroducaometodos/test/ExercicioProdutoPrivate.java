package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ClasseProdutoPrivate;

public class ExercicioProdutoPrivate {
    public static void main(String[] args) {
        ClasseProdutoPrivate produto01 = new ClasseProdutoPrivate();
        ClasseProdutoPrivate produto02 = new ClasseProdutoPrivate();
        produto01.setNome("Camiseta");
        produto01.setPreco(39.99);
        produto01.setQuantidadeEmEstoque(47);

        produto02.setNome("Shorts");
        produto02.setPreco(26.99);
        produto02.setQuantidadeEmEstoque(84);

        produto01.exibirInformacoes();
        System.out.println("--------------------------------");
        produto02.exibirInformacoes();
    }
}
