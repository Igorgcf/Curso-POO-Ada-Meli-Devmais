package everest.exer06;

import java.util.Arrays;

public class OrderedArray {

    public int [] orderWithLambda(int [] numbers){

    return Arrays.stream(numbers).sorted().toArray();
    }
}
