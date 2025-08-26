package Class12;

public class Box<T> {

    private T think;

    public void save(T think){
        this.think = think;
    }

    public T open(){
        return think;
    }
}
