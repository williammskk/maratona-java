package academy.devdojo.maratonajava.javacore.Pwrappers.Zexercicioproprio;

public class OperacaoInvalidaException extends IllegalArgumentException{
    public OperacaoInvalidaException() {
        super("Erro: Operação inválida!");
    }
}
