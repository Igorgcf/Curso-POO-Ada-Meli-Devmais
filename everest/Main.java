package everest;

import everest.exer05.Filter;
import everest.exer06.OrderedArray;
import everest.exer07.MediaPars;
import everest.exer08.AgeAnalyzer;
import everest.exer09.Multiply;
import everest.exer10.Sum;
import everest.exer11.StringOptional;
import everest.exer12.NameCorrector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Exercício 05
        Filter filter = new Filter();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(3);
        System.out.println("*******----------------------------------------*******");
        System.out.println("Elements filtered: " + filter.filterNegatives(numbers));
        System.out.println("*******----------------------------------------*******");

        //Exercício 06
        OrderedArray order = new OrderedArray();
        int [] array = {5, 1, 2, 4, 3};
        System.out.println("\n*******----------------------------------------*******");
        System.out.println("Elements Ordered: " + Arrays.toString(order.orderWithLambda(array)));
        System.out.println("*******----------------------------------------*******");

        //Exercício 07
        MediaPars mediaPars = new MediaPars();
        int [] input = {1, 2, 4, 3, 5};
        System.out.println("\n*******----------------------------------------*******");
        System.out.println("Media Pars Elements: " + Arrays.toString(mediaPars.calculateMediaPars(input)));
        System.out.println("*******----------------------------------------*******");

        //Exercício 08
        AgeAnalyzer analyzer = new AgeAnalyzer();
        analyzer.createVerifier();
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(16);
        list.add(18);
        System.out.println("\n*******----------------------------------------*******");
        System.out.println("Update list! Removed ages < 18! Elements presents: " + analyzer.remove(list, analyzer.createVerifier()));
        System.out.println("*******----------------------------------------*******");

        //Exercício 09
        Multiply multiply = new Multiply();
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        System.out.println("\n*******----------------------------------------*******");
        System.out.println("Elements multiplied" + multiply.multiplyers(ints));
        System.out.println("*******----------------------------------------*******");

        // Exercício 10
        Sum sum = new Sum();
        int [] intNumbers = {1, 4, 3, 5, 7};
        System.out.println("\n*******----------------------------------------*******");
        System.out.println("Sum of all elements in the list: " + sum.sumList(intNumbers));
        System.out.println("*******----------------------------------------*******");

        //Exercício 11
        StringOptional stringOptional =  new StringOptional();
        System.out.println("\n*******----------------------------------------*******");
        System.out.println("Result Optional of String: " + stringOptional.optionalOfString("Text!"));
        System.out.println("*******----------------------------------------*******");

        //Exercício 12
        NameCorrector nameCorrector =  new NameCorrector();
        List<String> names = Arrays.asList("igor", "bruna", "lucas");
        System.out.println("\n*******----------------------------------------*******");
        System.out.println("Name list corrected for uppercase letters. " + nameCorrector.corrector(names));
        System.out.println("*******----------------------------------------*******");
    }
}