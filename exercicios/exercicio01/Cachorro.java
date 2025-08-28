package exercicios.exercicio01;

public class Cachorro implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("************************");
        System.out.println("O cachorro faz: au au!");
        System.out.println("************************");
    }
}
