package exercicios.exercicio02;

import java.util.ArrayList;
import java.util.List;


public class Desenho {

    List<Forma> formas;

    public Desenho() {
        this.formas = new ArrayList<>();
    }

    double calcularAreaTotal(){
        double areaTotal = 0.0;
        for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}
