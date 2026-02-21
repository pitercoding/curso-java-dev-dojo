package pitercoding.devdojo.javacore.designpatters.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA: return new Dollar();
            case BRAZIL: return new Real();
            default: throw new IllegalArgumentException("No currency found for this country.");
        }
    }
}
