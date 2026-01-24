package pitercoding.devdojo.javacore.formatacao.main;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;

public class NumberFormatMain01 {
    public static void main(String[] args) {
        Locale localeJP = Locale.JAPAN;
        Locale localeUS = Locale.US;
        Locale localeIT = Locale.ITALY;
        Locale localeUK = Locale.UK;
        Locale localeCHINESE = Locale.CHINESE;
        NumberFormat[] nfa = new NumberFormat[6];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeUS);
        nfa[3] = NumberFormat.getInstance(localeIT);
        nfa[4] = NumberFormat.getInstance(localeUK);
        nfa[5] = NumberFormat.getInstance(localeCHINESE);
        double valor = 1_000.2130;
        for (NumberFormat numberFormat1: nfa) {
            System.out.println(numberFormat1.getMaximumFractionDigits());
            numberFormat1.setMaximumFractionDigits(2);
            System.out.println(numberFormat1.format(valor));
        }

        String valorString = "1000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
