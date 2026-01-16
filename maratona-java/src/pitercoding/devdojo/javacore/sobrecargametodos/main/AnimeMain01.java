package pitercoding.devdojo.javacore.sobrecargametodos.main;

import pitercoding.devdojo.javacore.sobrecargametodos.dominio.Anime;

public class AnimeMain01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuma Drive", "TV", 12, "Ação");
        anime.imprime();
    }
}
