package pitercoding.devdojo.javacore.designpatters.main;

import pitercoding.devdojo.javacore.designpatters.domain.Person;

public class BuilderPatternMain01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("John")
                .lastName("Doe")
                .username("johndoe")
                .email("johndoe@example.com")
                .build();
        System.out.println(build);
    }
}
