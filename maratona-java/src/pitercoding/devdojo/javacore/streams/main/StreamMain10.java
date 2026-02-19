package pitercoding.devdojo.javacore.streams.main;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamMain10 {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        // Fibonacci com stream
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.println();

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(arr -> arr[0])
                .forEach(System.out::println);

        System.out.println();

        // Números aleatórios
        ThreadLocalRandom  random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(500))
                .limit(90)
                .forEach(System.out::println);
    }
}
