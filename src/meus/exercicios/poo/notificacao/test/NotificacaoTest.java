package meus.exercicios.poo.notificacao.test;

import meus.exercicios.poo.notificacao.dominio.Email;
import meus.exercicios.poo.notificacao.dominio.Notificacao;
import meus.exercicios.poo.notificacao.dominio.Push;
import meus.exercicios.poo.notificacao.dominio.SMS;

public class NotificacaoTest {
    public static void main(String[] args) {
        Email email = new Email("contato123@gmail.com");
        SMS sms = new SMS("(77) 12345-6789");
        Push push = new Push("MeuApp");

        Notificacao[] notificacoes = {email, sms, push};

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar("Seu pedido foi aprovado!");
        }
    }
}