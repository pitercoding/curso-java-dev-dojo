package pitercoding.devdojo.javacore.colecoes.main;

import pitercoding.devdojo.javacore.colecoes.dominio.Consumidor;
import pitercoding.devdojo.javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapMain02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Racha Cuca");
        Consumidor consumidor2 = new Consumidor("Tripa Seca");

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Attack on Titan", 11.20);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
