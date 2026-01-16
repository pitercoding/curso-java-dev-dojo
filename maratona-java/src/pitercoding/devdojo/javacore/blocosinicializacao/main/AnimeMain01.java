package pitercoding.devdojo.javacore.blocosinicializacao.main;

import pitercoding.devdojo.javacore.blocosinicializacao.dominio.Anime;

public class AnimeMain01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for(int episodio: anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
