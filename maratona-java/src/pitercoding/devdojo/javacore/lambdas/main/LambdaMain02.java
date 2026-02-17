package pitercoding.devdojo.javacore.lambdas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaMain02 {
    public static void main(String[] args) {
        List<String> names = List.of("Natsu", "Allucard");
        List<Integer> integers = map(names, name -> name.length());
        List<String> map = map(names, n -> n.toUpperCase());

        System.out.println(integers);
        System.out.println(map);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }
}
