package pitercoding.devdojo.javacore.colecoes.main;

import pitercoding.devdojo.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchMain02 {

    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Naruto", 12.99));
        mangas.add(new Manga(1L, "Boku no Hero Academia", 19.99));
        mangas.add(new Manga(5L, "Dragon Ball", 17.99));
        mangas.add(new Manga(2L, "Pokemon", 29.99));
        mangas.add(new Manga(6L, "Attack on Titan", 24.99));
        mangas.add(new Manga(3L, "One Piece", 14.99));

        // Collections.sort(mangas); //Ordenando por nome por conta da classe Manga
        mangas.sort(mangaByIdComparator); //Ordenando por ID
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(3L, "One Piece", 14.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));

    }
}
