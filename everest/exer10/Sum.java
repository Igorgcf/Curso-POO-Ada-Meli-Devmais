package everest.exer10;

import java.util.Arrays;
import java.util.List;

public class Sum {

    public int sumList(int [] array){

        List<Integer> list = Arrays.stream(array).boxed().toList();

       return list.stream().mapToInt(Integer::intValue).sum();
    }
}
