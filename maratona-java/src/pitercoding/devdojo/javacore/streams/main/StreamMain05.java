package pitercoding.devdojo.javacore.streams.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        // Só para uma palavra da lista
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        // Para todas as palavras
        List<String[]> collect = words.stream()
                .map(word -> word.split(""))
                .collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(letters);
        List<String> letters2 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(letters2);
    }
}
