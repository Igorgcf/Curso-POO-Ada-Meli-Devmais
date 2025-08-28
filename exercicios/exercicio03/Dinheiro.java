package exercicios.exercicio03;

public class Dinheiro implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Dinheiro.");
    }
}
