package meus.exercicios.poo.notificacao.dominio;

public class Email implements Notificacao{
    private String destinatario;

    public Email(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] Para: "+destinatario+" - Mensagem: "+mensagem);
    }
}
