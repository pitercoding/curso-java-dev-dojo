package pitercoding.devdojo.javacore.formatacao.main;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatMain02 {
    public static void main(String[] args) {
        Locale localeJP = Locale.JAPAN;
        Locale localeUS = Locale.US;
        Locale localeIT = Locale.ITALY;
        Locale localeUK = Locale.UK;
        Locale localeCHINESE = Locale.CHINESE;
        NumberFormat[] nfa = new NumberFormat[6];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[4] = NumberFormat.getCurrencyInstance(localeUK);
        nfa[5] = NumberFormat.getCurrencyInstance(localeCHINESE);
        double valor = 1000.2130;
        for (NumberFormat numberFormat1: nfa) {
            System.out.println(numberFormat1.getMaximumFractionDigits());
            System.out.println(numberFormat1.format(valor));
        }

        String valorString = "$1,000.21";
        try {
            System.out.println(nfa[2].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
