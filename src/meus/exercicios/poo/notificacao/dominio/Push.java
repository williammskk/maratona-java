package meus.exercicios.poo.notificacao.dominio;

public class Push implements Notificacao{
    private String nomeApp;

    public Push(String nomeApp) {
        this.nomeApp = nomeApp;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[PUSH] Para: "+nomeApp+" - Mensagem: "+mensagem);
    }
}
