package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelecione o tipo de envio da mensagem:");
            System.out.println("1 - E-mail");
            System.out.println("2 - SMS");
            System.out.println("3 - Push");
            System.out.print("Escolha a sua Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            String tipoEnvio = "";
            switch (opcao) {
                case 1:
                    tipoEnvio = "email";
                    break;
                case 2:
                    tipoEnvio = "sms";
                    break;
                case 3:
                    tipoEnvio = "push";
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            System.out.print("Insira sua mensagem: ");
            String conteudo = scanner.nextLine();

            try {
                EnvioMensagem envio = GeradorNotificacao.criarInstancia(tipoEnvio);
                envio.enviar(conteudo);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}