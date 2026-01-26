package pitercoding.devdojo.javacore.datas.main;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateMain01 {
    public static void main(String[] args) {
        System.out.println(new Date()); // Criando com Date
        System.out.println(Calendar.getInstance()); // Criando com Calendar

        LocalDate date = LocalDate.of(2026, Month.JANUARY, 25); // Criando com LocalDate
        LocalDate dateToday = LocalDate.now();

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); // Ano bissexto (true/false)

        System.out.println(date);
        System.out.println(dateToday);
    }
}
