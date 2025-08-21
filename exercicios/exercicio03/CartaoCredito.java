package exercicio03;

public class CartaoCredito implements Pagamento{

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
    }
}
