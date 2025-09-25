package everest.exer01;

import java.time.YearMonth;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class LocalDateAtDay13 {

        public static boolean isFriday13(int month, int year) {

            try{
                if(month < 1 || month > 12){
                    return false;
                }

                YearMonth yearMonth = YearMonth.of(year, month);

                if(yearMonth.lengthOfMonth() < 13){
                    return false;
                }

                LocalDate date = yearMonth.atDay(13);

                return date.getDayOfWeek() == DayOfWeek.FRIDAY;

            }catch(Exception e){
                return false;
            }
        }

    public static void main(String []args){

        System.out.println("Result for month 09 and year 2025: " + isFriday13(9, 2025));
        System.out.println("Result for month 06 and year 2025: " + isFriday13(6, 2025));
        System.out.println("Result for month 02 and year 2021: " + isFriday13(2, 2021));
    }
}
