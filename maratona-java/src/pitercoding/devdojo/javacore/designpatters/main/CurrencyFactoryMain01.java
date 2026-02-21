package pitercoding.devdojo.javacore.designpatters.main;

import pitercoding.devdojo.javacore.designpatters.domain.Country;
import pitercoding.devdojo.javacore.designpatters.domain.Currency;
import pitercoding.devdojo.javacore.designpatters.domain.CurrencyFactory;

public class CurrencyFactoryMain01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
