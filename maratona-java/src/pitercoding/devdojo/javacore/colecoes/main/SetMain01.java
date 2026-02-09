package pitercoding.devdojo.javacore.colecoes.main;

import pitercoding.devdojo.javacore.colecoes.dominio.Manga;

import java.util.*;

public class SetMain01 {
    public static void main(String[] args) {
        // Set: Não permite elementos duplicados
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(4L, "Naruto", 12.99, 0));
        mangas.add(new Manga(1L, "Boku no Hero Academia", 19.99, 5));
        mangas.add(new Manga(5L, "Dragon Ball", 17.99, 0));
        mangas.add(new Manga(2L, "Pokemon", 29.99, 2));
        mangas.add(new Manga(6L, "Attack on Titan", 24.99, 0));

        mangas.forEach(System.out::println);
    }
}
