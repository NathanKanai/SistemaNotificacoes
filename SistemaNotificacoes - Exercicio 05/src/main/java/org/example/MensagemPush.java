package org.example;

public class MensagemPush implements EnvioMensagem {
    public void enviar(String conteudo) {
        System.out.println("Enviando notificação por Push: " + conteudo);
    }
}
