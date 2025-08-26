package exercicios.exercicio08;

import static exercicios.exercicio08.TrocarElementos.imprimirArray;
import static exercicios.exercicio08.TrocarElementos.trocar;

public class Main {

    public static void main(String[] args) {

        Integer[] numeros = {1, 2, 3, 4, 5};
        System.out.println("*****------------------------------------------*****");
        System.out.println("Array de Integer antes da troca:");
        imprimirArray(numeros);
        System.out.println("Array de Integer depois da troca:");
        trocar(numeros, 1, 3);
        imprimirArray(numeros);
        System.out.println("*****------------------------------------------*****");
        System.out.println();
        String[] palavras = {"um", "dois", "tres", "quatro", "cinco"};
        System.out.println("Array de String antes da troca:");
        imprimirArray(palavras);
        System.out.println("Array de String depois da troca:");
        trocar(palavras, 0, 4);
        imprimirArray(palavras);
        System.out.println("*****------------------------------------------*****");
    }

}
