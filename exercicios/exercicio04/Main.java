package exercicio04;

public class Main {

    public static void main(String[] args) {
        Veiculo bicicleta = new Bicicleta();

        System.out.println("*********************************************");
        System.out.println("Testando Bicicleta:");
        bicicleta.acelerar();
        bicicleta.frear();
        bicicleta.ligarMotor();

        System.out.println("*********************************************");
        System.out.println("Testando carro:");
        Veiculo carro = new Carro();
        carro.acelerar();
        carro.frear();
        carro.ligarMotor();

        System.out.println("*********************************************");
        System.out.println("Testando moto:");
        Veiculo moto = new Moto();
        moto.acelerar();
        moto.frear();
        moto.ligarMotor();
        System.out.println("*********************************************");
    }
}
