package Class12;

public class Main {

    public static void main(String[] args) {

        Box<String> box = new Box();

        box.save("Olá Mundo!");
        System.out.println("*****-------------------------******");
        System.out.println("Saída do tipo String: " + box.open());

        Box<Integer> box2 = new Box();
        box2.save(123456);
        System.out.println("Saída do tipo Integer: " + box2.open());

        Box<Double> box3 = new Box();
        box3.save(123.45);
        System.out.println("Saída do tipo Double: " + box3.open());
        System.out.println("*****-------------------------******");

        System.out.println("*****-------------------------******");
        Calculator<Integer> calc = new Calculator(4, 2);
        System.out.println("Resultado da Soma: " + calc.sum());
        System.out.println("Resultado da Subtração: " + calc.subtraction());
        System.out.println("Resultado da Multiplicação: " + calc.multiplication());
        System.out.println("Resultado da Divisão: " + calc.division());
        System.out.println("*****-------------------------******");
    }
}
