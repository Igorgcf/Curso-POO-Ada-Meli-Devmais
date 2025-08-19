package Class10;

public class Professor extends Person {

    public Professor(String name, Address address){
        super(name, address);
    }

    public void displayDetails() {
        System.out.println("*****---------------------------*****");
        System.out.println("Professor: " + getName());
        System.out.println(getAddress());
        System.out.println("*****---------------------------*****");
    }
}
