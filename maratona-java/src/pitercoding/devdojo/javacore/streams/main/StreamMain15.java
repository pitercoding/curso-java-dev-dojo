package pitercoding.devdojo.javacore.streams.main;

import pitercoding.devdojo.javacore.streams.domain.Category;
import pitercoding.devdojo.javacore.streams.domain.LightNovel;
import pitercoding.devdojo.javacore.streams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamMain15 {

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

        // Categoria e Estatísticas de Preço
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        // Map<Category, List<Promotion>>
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(
                        LightNovel::getCategory,
                        mapping(StreamMain15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(
                        LightNovel::getCategory,
                        mapping(StreamMain15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
