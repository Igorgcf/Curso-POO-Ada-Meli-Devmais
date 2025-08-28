package exercicios.exercicio04;

public class Bicicleta implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerando a bicicleta!");
    }

    @Override
    public void frear() {
        System.out.println("Freando a bicicleta!");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Bicicleta não tem motor!");
    }
}
