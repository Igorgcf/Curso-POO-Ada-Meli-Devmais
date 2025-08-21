package exercicio03;

public class Main {

    public static void main(String[] args) {
        Pagamento pagamento1 = new Dinheiro();
        Pagamento pagamento2 = new CartaoCredito();
        Pagamento pagamento3 = new Pix();

        System.out.println("******************************************************");
        System.out.println("Realizando pagamentos com diferentes métodos:");
        pagamento1.pagar(100.0);
        pagamento2.pagar(200.0);
        pagamento3.pagar(300.0);
        System.out.println("******************************************************");

    }
}
