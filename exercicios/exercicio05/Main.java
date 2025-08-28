package exercicios.exercicio05;

public class Main {

    public static void main(String[] args) {
        Celular celular = new Celular();

        Notificacao email = new Email();
        Notificacao sms = new SMS();

        celular.getNotificacoes().add(email);
        celular.getNotificacoes().add(sms);

        System.out.println("********************************************************************");
        for (Notificacao notificacao : celular.getNotificacoes()) {
            notificacao.enviarMensagem("Olá, esta é uma mensagem de teste!");
        }

        System.out.println("********************************************************************");
    }
}
