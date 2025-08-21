package exercicio02;

public class Circulo implements Forma {

    public Circulo(int raio) {
        this.raio = raio;
    }

    private int raio;

    @Override
    public int calcularArea() {
        return (int) (Math.PI * raio * raio);
    }
}
