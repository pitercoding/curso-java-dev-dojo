package pitercoding.devdojo.javacore.colecoes.main;

import pitercoding.devdojo.javacore.colecoes.dominio.Manga;
import pitercoding.devdojo.javacore.colecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        int precoCompare = Double.compare(o1.getPreco(), o2.getPreco());
        if (precoCompare != 0) {
            return precoCompare;
        }
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class NavigableSetMain01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone1 = new Smartphone("123", "Nokia");
        smartphones.add(smartphone1);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(4L, "Naruto", 12.99, 0));
        mangas.add(new Manga(1L, "Boku no Hero Academia", 19.99, 5));
        mangas.add(new Manga(5L, "Dragon Ball", 17.99, 0));
        mangas.add(new Manga(2L, "Pokemon", 29.99, 2));
        mangas.add(new Manga(6L, "Attack on Titan", 24.99, 0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------------");
        System.out.println("Métodos Úteis:");

        Manga cdz = new Manga(1L, "CDZ", 20.99, 5);

        // lower -> retorna o menor objeto (<)
        System.out.println("Lower: " + mangas.lower(cdz));

        // floor -> retorna o objeto menor ou igual (<=)
        System.out.println("Floor: " + mangas.floor(cdz));

        // higher -> retorna o maior objeto (>)
        System.out.println("Higher: " + mangas.higher(cdz));

        // ceiling -> retorna o objeto maior ou igual (>=)
        System.out.println("Ceiling: " + mangas.ceiling(cdz));

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
