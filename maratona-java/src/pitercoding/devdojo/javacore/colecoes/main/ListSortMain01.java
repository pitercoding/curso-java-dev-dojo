package pitercoding.devdojo.javacore.colecoes.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortMain01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);
        mangas.add("One Piece");
        mangas.add("Dragon Ball");
        mangas.add("Boku no Hero Academia");
        mangas.add("Pokemon");

        Collections.sort(mangas); // Organiza em ordem alfabética

        for (String manga : mangas) {
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);

        System.out.println(dinheiros);
    }
}
