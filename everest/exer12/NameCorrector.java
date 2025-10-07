package everest.exer12;

import java.util.List;
import java.util.stream.Collectors;

public class NameCorrector {

    public List<String> corrector(List<String> names){

        return names.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
