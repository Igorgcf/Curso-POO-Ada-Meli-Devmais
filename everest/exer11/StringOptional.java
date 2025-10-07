package everest.exer11;

import java.util.Optional;

public class StringOptional {

    public Optional<String> optionalOfString(String text){

        if(text == null || text.isEmpty()){
            return Optional.empty();
        }else{
            return Optional.of(text);
        }
    }
}
