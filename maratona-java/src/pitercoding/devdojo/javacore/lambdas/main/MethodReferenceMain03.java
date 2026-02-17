package pitercoding.devdojo.javacore.lambdas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

;public class MethodReferenceMain03 {
    public static void main(String[] args) {
        List<String> characters = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        characters.sort(String::compareTo);
        System.out.println(characters);

        Function<String, Integer> numStringToInteger = Integer::parseInt; // s -> Integer.parseInt(s);
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(characters, "Rimuru"));
    }
}
