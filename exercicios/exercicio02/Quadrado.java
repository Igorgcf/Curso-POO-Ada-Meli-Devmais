package exercicios.exercicio02;

public class Quadrado implements Forma {

    public Quadrado(int lado) {
        this.lado = lado;
    }

    private int lado;

    @Override
    public int calcularArea() {
        return lado * lado;
    }
}
