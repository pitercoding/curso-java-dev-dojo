package pitercoding.devdojo.javacore.streams.main;

import pitercoding.devdojo.javacore.streams.domain.Category;
import pitercoding.devdojo.javacore.streams.domain.LightNovel;
import pitercoding.devdojo.javacore.streams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain13 {

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

        // Agrupamento por Preço e Promotion
        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(ln -> {
                    return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                }));
        System.out.println(collect);

        // Agrupamento de Categoria + Promotion + Preço
        // Map<Category, Map<Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(
                Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
        )));
        System.out.println(collect1);

    }
}
