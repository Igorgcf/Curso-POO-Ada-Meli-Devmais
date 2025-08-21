package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Papagaio papagaio = new Papagaio();

        animais.add(cachorro);
        animais.add(gato);
        animais.add(papagaio);

        for(Animal animal : animais){
            animal.emitirSom();
        }
    }
}
