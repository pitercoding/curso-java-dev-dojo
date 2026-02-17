package pitercoding.devdojo.javacore.lambdas.main;

import java.util.List;
import java.util.function.Consumer;

public class LambdaMain01 {
    public static void main(String[] args) {
        List<String> names = List.of("Racha Cuca", "Tripa Seca", "Quase Nada");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        forEach(names, (String name) -> System.out.println(name));
        forEach(numbers, number -> System.out.println(number));
    }

    private static <T> List<T> forEach(List<T> list, Consumer<T> consumer) {
        for(T t : list) consumer.accept(t);
        return list;
    }
}
