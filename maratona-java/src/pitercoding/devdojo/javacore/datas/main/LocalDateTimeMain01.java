package pitercoding.devdojo.javacore.datas.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate date = LocalDate.parse("2026-01-26");
        LocalTime time = LocalTime.parse("09:45:22");
        LocalDateTime localDateTime1 = date.atTime(time);

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        System.out.println(localDateTime1);
    }
}
