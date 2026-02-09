package pitercoding.devdojo.javacore.colecoes.main;

import pitercoding.devdojo.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Naruto", 12.99, 0));
        mangas.add(new Manga(1L, "Boku no Hero Academia", 19.99, 5));
        mangas.add(new Manga(5L, "Dragon Ball", 17.99, 0));
        mangas.add(new Manga(2L, "Pokemon", 29.99, 2));
        mangas.add(new Manga(6L, "Attack on Titan", 24.99, 0));

            // Removendo itens de uma lista:

//        // Primeira forma: Iterator - Classe que checa antes de tomar uma ação
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//           if (mangaIterator.next().getQuantidade() == 0) {
//               mangaIterator.remove();
//           }
//        }
//        System.out.println(mangas);

        // Segunda forma
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
