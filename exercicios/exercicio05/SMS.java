package exercicios.exercicio05;

public class SMS implements Notificacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS com a mensagem: " + mensagem);
    }
}
