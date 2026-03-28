package pitercoding.devdojo.javacore.jdbc.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeveloperTest {

    @Test
   public void instanceOf_ExecutesChildClassMethod_WhenObjectIsOfChieldType() {
        Employee employeeDeveloper = new Developer("1", "Java");
        if(employeeDeveloper instanceof Developer developer) {
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }

}