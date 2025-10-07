package everest.exer05;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public List<Integer> filterNegatives(List<Integer> numbers){

        List<Integer> filtered = new ArrayList<>(numbers);

        filtered.removeIf(n -> n <0);
        return filtered;
    }
}
