package pitercoding.devdojo.javacore.lambdas.main;

import pitercoding.devdojo.javacore.lambdas.dominio.Anime;
import pitercoding.devdojo.javacore.lambdas.dominio.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceMain01 {
    public static void main(String[] args) {
        List<Anime> animesList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)
        ));

        // animesList.sort(animesList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        // animesList.sort(animesList, AnimeComparator::compareByTitle); // method reference
        animesList.sort(AnimeComparators::compareByEpisodes); // method reference
        System.out.println(animesList);
    }
}
