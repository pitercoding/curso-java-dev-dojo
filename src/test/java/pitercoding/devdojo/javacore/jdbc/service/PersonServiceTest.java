package pitercoding.devdojo.javacore.jdbc.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pitercoding.devdojo.javacore.jdbc.domain.Person;

class PersonServiceTest {

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        Assertions.assertFalse(personService.isAdult(person));
    }
}