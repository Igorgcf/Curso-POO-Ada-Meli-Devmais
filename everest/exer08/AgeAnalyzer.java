package everest.exer08;

import java.util.List;
import java.util.function.Predicate;

public class AgeAnalyzer {

    public Predicate<Integer> createVerifier() {

        return age -> age <18;
    }

    public List<Integer> remove (List<Integer> collection, Predicate<Integer> verifier) {

        collection.removeIf(verifier);
        return collection;

    }
}

