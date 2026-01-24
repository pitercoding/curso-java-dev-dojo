package pitercoding.devdojo.javacore.datas.main;

import java.util.Date;

public class DateMain01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L); // long - conta o tempo a partir de milissegundo comendo com 1_000_000_000 (1970)
        System.out.println(date);
        System.out.println(date.getTime()); // milissegundo

        System.out.println();

        Date date2 = new Date(1769245051930L);
        System.out.println(date2.getTime()); // milissegundo do dia atual
        System.out.println(date2);
    }
}
