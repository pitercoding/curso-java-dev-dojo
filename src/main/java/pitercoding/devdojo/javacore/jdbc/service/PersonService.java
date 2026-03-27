package pitercoding.devdojo.javacore.jdbc.service;

import pitercoding.devdojo.javacore.jdbc.domain.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person person){
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;
    }
}
