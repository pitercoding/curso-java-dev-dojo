package pitercoding.devdojo.projetofinalcrud.service;

import pitercoding.devdojo.projetofinalcrud.domain.Anime;
import pitercoding.devdojo.projetofinalcrud.domain.Producer;
import pitercoding.devdojo.projetofinalcrud.repository.AnimeRepository;

import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int option) {
        switch (option) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.print("\nType the NAME or EMPTY to show all: ");
        String name = SCANNER.nextLine();
        AnimeRepository.findByName(name)
                .forEach(a -> System.out.printf("[%d] - %s %d %s\n", a.getId(), a.getName(), a.getEpisodes(), a.getProducer().getName()));
    }

    public static void delete() {
        System.out.print("\nType the id of the anime to delete: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Are you sure? Y/N: ");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }

    public static void save() {
        System.out.print("\nType the name of the anime: ");
        String name =  SCANNER.nextLine();
        System.out.print("Type the number of episodes: ");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Type the id of the producer: ");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime.builder()
                .episodes(episodes)
                .name(name)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }

    public static void update() {
        System.out.print("\nType the id of the object you want to update: ");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found!");
            return;
        }
        Anime animeFromDb = animeOptional.get();
        System.out.println("\nThe object you want to update is: " + animeFromDb);
        System.out.print("Type the NEW NAME or ENTER to keep the same: ");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.print("Type the new number of episodes: ");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        Anime animeToUpdate = Anime.builder()
                .id(animeFromDb.getId())
                .episodes(episodes)
                .producer(animeFromDb.getProducer())
                .name(name)
                .build();

        AnimeRepository.update(animeToUpdate);
    }
}
