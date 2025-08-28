package exercicios.exercicio05;

public class Email implements Notificacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando email com a mensagem: " + mensagem);
    }
}
