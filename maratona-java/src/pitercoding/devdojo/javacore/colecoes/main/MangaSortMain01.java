package pitercoding.devdojo.javacore.colecoes.main;

import pitercoding.devdojo.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getNome().compareTo(manga2.getNome());
    }
}

class MangaByPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPreco(), manga2.getPreco());
    }
}

public class MangaSortMain01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Naruto", 12.99));
        mangas.add(new Manga(1L, "Boku no Hero Academia", 19.99));
        mangas.add(new Manga(5L, "Dragon Ball", 17.99));
        mangas.add(new Manga(2L, "Pokemon", 29.99));
        mangas.add(new Manga(6L, "Attack on Titan", 24.99));
        mangas.add(new Manga(3L, "One Piece", 14.99));

        System.out.println("Lista de dados sem ordenação:");
        mangas.forEach(System.out::println);

        System.out.println("-----------");

        System.out.println("Ordenado por ID via implementação do compareTo() na Classe Manga:");
        Collections.sort(mangas);
        mangas.forEach(System.out::println);

        System.out.println("-----------");

        System.out.println("Ordenado por Nome via Comparator:");
        Collections.sort(mangas, new MangaByIdComparator());
        mangas.forEach(System.out::println);

        System.out.println("-----------");

        System.out.println("Ordenado por Preço via Comparator:");
        Collections.sort(mangas, new MangaByPrecoComparator());
        mangas.forEach(System.out::println);
    }
}
