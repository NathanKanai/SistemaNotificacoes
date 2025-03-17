package org.example;

public class MensagemEmail implements EnvioMensagem {
    public void enviar(String conteudo) {
        System.out.println("Enviando mensagem por e-mail: " + conteudo);
    }
}
