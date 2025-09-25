package everest.exer04;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class YearDifference {

    public static int getDifferenceInYears(String start, String end) {

        if(start == null || end == null){
            throw new IllegalArgumentException("The dates cannot be null");
        }

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate startDate = LocalDate.parse(start, format);
        LocalDate endDate = LocalDate.parse(end, format);

        return Period.between(startDate, endDate).getYears();

    }

    public static void main(String[] args){

        System.out.println("Difference years between 01/01/2000 and 25/09/2025: " + getDifferenceInYears("01/01/2000", "25/09/2025") + " year(s)");
        System.out.println("Difference years between 02/02/2010 and 25/09/2025: " + getDifferenceInYears("02/02/2010", "25/09/2025") + " year(s)");
        System.out.println("Difference years between 03/03/2020 and 01/01/2025: " + getDifferenceInYears("03/03/2020", "01/01/2025") + " year(s)");
    }
}

