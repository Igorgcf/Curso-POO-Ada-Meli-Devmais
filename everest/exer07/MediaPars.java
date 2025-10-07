package everest.exer07;

import java.util.Arrays;

public class MediaPars {

    public double [] calculateMediaPars(int[] input) {

       return new double[]{Arrays.stream(input).filter(n -> n % 2 == 0).average().orElse(0.0)};
    }
}


