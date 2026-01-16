package pitercoding.devdojo.javacore.construtores.main;

import pitercoding.devdojo.javacore.construtores.dominio.Anime;

public class AnimeMain01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akuma Drive", "TV", 12, "Ação", "Production IG");
        anime.imprime();

    }
}
