package pitercoding.devdojo.javacore.Optional.main;

import pitercoding.devdojo.javacore.Optional.domain.Manga;
import pitercoding.devdojo.javacore.Optional.repository.MangaRepository;

import java.util.Optional;

public class OptionalMain02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku No Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku No Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters").orElse(new Manga(3, "Drifters", 20));
        System.out.println(newManga);
    }
}
