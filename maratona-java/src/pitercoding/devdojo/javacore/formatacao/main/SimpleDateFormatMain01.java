package pitercoding.devdojo.javacore.formatacao.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatMain01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        String pattern2 = "'Rio de Janeiro' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        System.out.println(sdf2.format(new Date()));

        // Ao inverso, pega o resultado e faz parse
        try {
            System.out.println(sdf2.parse("Rio de Janeiro 24 de janeiro de 2026"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
