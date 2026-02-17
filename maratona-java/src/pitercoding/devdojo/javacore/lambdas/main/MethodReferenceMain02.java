package pitercoding.devdojo.javacore.lambdas.main;

import pitercoding.devdojo.javacore.lambdas.dominio.Anime;
import pitercoding.devdojo.javacore.lambdas.dominio.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceMain02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)
        ));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
