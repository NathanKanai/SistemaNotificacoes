package org.example;

public class GeradorNotificacao {
    public static EnvioMensagem criarInstancia(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new MensagemEmail();
            case "sms":
                return new MensagemSMS();
            case "push":
                return new MensagemPush();
            default:
                throw new IllegalArgumentException("Tipo de envio inválido: " + tipo);
        }
    }
}
