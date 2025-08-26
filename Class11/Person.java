package Class11;

public interface Person {

    default void speak(){
        System.out.println("Pessoa falando...");
    }

    void toWalk();
}
