package class13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        PersonalData data = new PersonalData("Ana", LocalDate.of(1990, Month.MAY, 15), LocalDateTime.of(2025, Month.SEPTEMBER, 9, 10, 30));
        Client client = new Client(data);
        long days = ChronoUnit.DAYS.between(LocalDate.now(), client.getData().getDateCreated());

        System.out.println("******************** Client Information ********************");
        System.out.println("Client Name: " + client.getData().getName());
        System.out.println("Client Birth Date: " + client.getData().getBirthDate());
        System.out.println("Client Registration Date: " + client.getData().getDateCreated());
        System.out.println("Registered on the platform for: " + days + " days");

        System.out.println("************************************************************");
    }
}
