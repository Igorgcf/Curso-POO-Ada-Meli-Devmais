package exercicios.exercicio06;

public class Main {

    public static void main(String[] args) {

        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.guardar("Olá, mundo!");
        String conteudoString = caixaDeString.abrir();
        System.out.println("*****-------------------------------*****");
        System.out.println("Conteúdo da caixa de String: " + conteudoString);

        Caixa<Integer> caixaDeInteger = new Caixa<>();
        caixaDeInteger.guardar(42);
        Integer conteudoInteger = caixaDeInteger.abrir();
        System.out.println("Conteúdo da caixa de Integer: " + conteudoInteger);
        System.out.println("*****-------------------------------*****");
    }
}
