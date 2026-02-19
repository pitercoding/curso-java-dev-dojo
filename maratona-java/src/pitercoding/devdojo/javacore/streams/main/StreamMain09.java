package pitercoding.devdojo.javacore.streams.main;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain09 {

    public static void main(String[] args) {

        // rangeClosed: inclui todo o intervalo
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        // rangeClosed: não inclui todo o intervalo (ex: 50 não incluído)
        IntStream.range(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        Stream.of("Eleve", "O", "Cosmo", "no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        int num[] = {1,2,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        System.out.println();

        // Stream com arquivos
        try(Stream<String> lines = Files.lines(Paths.get("D:\\programacao\\curso-java-dev-dojo\\pasta\\teste.txt"))){
            lines.filter(l -> l.contains("melhor"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
