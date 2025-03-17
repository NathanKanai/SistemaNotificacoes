package org.example;

public class MensagemSMS implements EnvioMensagem {
    public void enviar(String conteudo) {
        System.out.println("Enviando mensagem por SMS: " + conteudo);
    }
}
