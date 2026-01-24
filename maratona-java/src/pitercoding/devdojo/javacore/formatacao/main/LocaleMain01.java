package pitercoding.devdojo.javacore.formatacao.main;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleMain01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwiss = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeIsrael = new Locale("he", "IS");
        Locale localeJapan = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwiss);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIsrael);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);

        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Suíça: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Israel: " + df4.format(calendar.getTime()));
        System.out.println("Japão: " + df5.format(calendar.getTime()));

        System.out.println();
        System.out.println(localeItaly.getDisplayCountry(localeIsrael));
        System.out.println(localeSwiss.getDisplayCountry());
    }
}
