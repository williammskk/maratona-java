package academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Pagamento;

public interface Pagamento {
    void valorPagamento();
    default void validar(){
        System.out.println("Validando pagamento com Boleto... (validação padrão)");
    }
}
