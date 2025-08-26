package exercicios.exercicio09;

import static exercicios.exercicio09.MaiorElemento.maior;

public class Main {
    public static void main(String[] args) {

        Integer n1 = 15;
        Integer n2 = 20;
        System.out.println("Maior entre " + n1 + " e " + n2 + ": " + maior(n1, n2));

        String s1 = "Banana";
        String s2 = "Abacaxi";
        System.out.println("Maior entre \"" + s1 + "\" e \"" + s2 + "\": " + maior(s1, s2));
    }
}
