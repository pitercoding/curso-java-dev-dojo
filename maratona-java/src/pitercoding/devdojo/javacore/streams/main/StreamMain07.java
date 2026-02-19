package pitercoding.devdojo.javacore.streams.main;

import java.util.List;

public class StreamMain07 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        // 1a forma: Sem valor inicial
        numeros.stream()
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);

        // 2a forma: com valor inicial
        System.out.println(numeros.stream().reduce(0, (a, b) -> a + b));

        // 3a forma: com method reference
        numeros.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(numeros.stream().reduce(0, Integer::sum));


        // multiplicação
        numeros.stream().reduce((a, b) -> a * b).ifPresent(System.out::println);
        System.out.println(numeros.stream().reduce(1, (a, b) -> a * b));

        // Maior elemento
        numeros.stream().reduce((a, b) -> a > b ? a : b).ifPresent(System.out::println);
        numeros.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}
