package Class11;

public class Student implements Coordinator {

    @Override
    public void Organize() {
        System.out.println("Organizando como coordenador...");
    }

    @Override
    public void toWalk() {
        System.out.println("Andando como coordenador...");
    }

    @Override
    public void speak() {
        Coordinator.super.speak();
    }

    @Override
    public void toTeach() {
        Coordinator.super.toTeach();
    }

    @Override
    public void toCorrect() {
        Coordinator.super.toCorrect();
}






}
