package exercicios.exercicio03;

public class Pix implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Pix.");
    }
}
