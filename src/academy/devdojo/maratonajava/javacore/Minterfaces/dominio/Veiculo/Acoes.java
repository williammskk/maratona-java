package academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Veiculo;

public interface Acoes {
    void imprimirNomeEVelocidade();
    void acao();
    default void abastecimento(){
        System.out.println("Sem necessidade de abastecimento");
    }
}
