package everest.exer03;

import java.time.LocalDate;

public class CalculatorDate {

    public LocalDate advanceDays(LocalDate date, int days) {

        if(date == null){
            throw new IllegalArgumentException("The date cannot be null");
        }
        return date.plusDays(days);
    }

    public static void main(String[] args){

        CalculatorDate c = new CalculatorDate();

        LocalDate today = LocalDate.of(2025, 9, 25);
        System.out.println("Original date: " + today);

        LocalDate advanced = c.advanceDays(today, 10);
        System.out.println("After 10 days: " + advanced);

        LocalDate backward = c.advanceDays(today, -7);
        System.out.println("7 days before: " + backward);
    }
}
