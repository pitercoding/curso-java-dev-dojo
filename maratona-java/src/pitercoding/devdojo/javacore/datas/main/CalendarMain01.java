package pitercoding.devdojo.javacore.datas.main;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain01 {
    public static void main(String[] args) {
        // Calendar c = new Calendar(); // ERRO NÃO SE PODE FAZER IINSTANCIAR CALENDAR

        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Primeiro dia!");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2); // Adiciona dois dias
        c.add(Calendar.HOUR, 2); // adiciona horas

        Date date = c.getTime();
        System.out.println(date);
    }
}
