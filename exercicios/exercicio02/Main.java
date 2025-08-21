package exercicio02;

public class Main {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(2);

        Circulo circulo = new Circulo(3);

        Desenho desenho = new Desenho();
        desenho.formas.add(quadrado);
        desenho.formas.add(circulo);

        System.out.println("**********************************");
        System.out.println("Soma da área total: " + desenho.calcularAreaTotal());
        System.out.println("**********************************");
    }
}

