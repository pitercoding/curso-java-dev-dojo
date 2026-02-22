package pitercoding.devdojo.javacore.designpatters.main;

import pitercoding.devdojo.javacore.designpatters.domain.*;

public class DataTransferObjectMain01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);

        Person person = Person.builder()
                .firstName("John")
                .lastName("Doe")
                .build();

        ReportDTO reportDTO = ReportDTO.builder()
                .aircraftName(aircraft.getModel())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDTO);
    }
}
