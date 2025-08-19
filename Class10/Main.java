package Class10;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("Main St", "123");

        Professor professor = new Professor("John Doe", address);

        professor.displayDetails();
    }
}
