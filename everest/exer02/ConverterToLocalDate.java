package everest.exer02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConverterToLocalDate {

    public static String converterData(String receivedDate) {


        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse(receivedDate, format).plusDays(3);

        return date.format(format);
    }

    public static void main(String[] args) {
        String date = "24/09/2023";
        String newDate = converterData(date);
        System.out.println("Original date: " + date);
        System.out.println("Date with 3 days added: " + newDate);
    }
}
