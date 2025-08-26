package exercicios.exercicio09;

public class MaiorElemento {

    public static <T extends Comparable<T>> T maior (T a, T b){
        // compareTo retorna:
        // > 0 se a > b
        // < 0 se a < b
        // = 0 se a == b
        return (a.compareTo(b) >= 0) ? a : b;
    }
}
