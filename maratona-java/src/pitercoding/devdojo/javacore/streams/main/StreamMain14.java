package pitercoding.devdojo.javacore.streams.main;

import pitercoding.devdojo.javacore.streams.domain.Category;
import pitercoding.devdojo.javacore.streams.domain.LightNovel;
import pitercoding.devdojo.javacore.streams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamMain14 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {

        // Categoria e Quantidade
        Map<Category, Long> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        // Categoria e Preço
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        // Categoria e Novela mais cara
        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);
    }
}
