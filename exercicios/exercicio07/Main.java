package exercicios.exercicio07;

public class Main {
    public static void main(String[] args) {

        Par<String, Integer> par = new Par<>("Junior", 25);
        System.out.println("*****---------------------------------------*****");
        System.out.println("Chave: " + par.getChave());
        System.out.println("Valor: " + par.getValor());
        System.out.println("*****---------------------------------------*****");

        Par<Integer, String> par2 = new Par(1, "Java Generics");
        System.out.println("*****---------------------------------------*****");
        System.out.println("Chave: " + par2.getChave());
        System.out.println("Valor: " + par2.getValor());
        System.out.println("*****---------------------------------------*****");

    }
}
