package meus.exercicios.poo.notificacao.dominio;

public class SMS implements Notificacao{
    private String telefone;

    public SMS(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] Para: "+telefone+" - Mensagem: "+mensagem);
    }
}
