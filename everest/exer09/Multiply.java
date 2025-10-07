package everest.exer09;

import java.util.List;
import java.util.stream.Collectors;

public class Multiply {

    public List<Integer> multiplyers(List<Integer> numbers){

       return numbers.stream().map(n -> n * 2).collect(Collectors.toList());
    }
}
