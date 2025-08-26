package Class11;

public interface Coordinator extends Person, Professor {

    void Organize();

    @Override
    default void speak() {
        Person.super.speak();
    }

    @Override
    void toWalk();


    @Override
    default void toTeach() {
        System.out.println("Ensinando como coordenador...");
    }

    @Override
    default void toCorrect() {
        System.out.println("Corrigindo como aluno...");
    }
}
