package pitercoding.devdojo.projetofinalcrud.service;

import pitercoding.devdojo.projetofinalcrud.domain.Producer;
import pitercoding.devdojo.projetofinalcrud.repository.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int option) {
        switch (option) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default ->
                throw new IllegalArgumentException("Invalid option!");
        }
    }

    private static void findByName() {
        System.out.print("\nType the NAME or EMPTY to show all: ");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s\n", p.getId(), p.getName()));
    }

    public static void delete() {
        System.out.print("\nType the id of the producer to delete: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Are you sure? Y/N: ");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    public static void save() {
        System.out.print("\nType the name of the producer: ");
        String name =  SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }

    public static void update() {
        System.out.print("\nType the id of the object you want to update: ");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("The object you want to update does not exist!");
            return;
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("\nThe object you want to update is: " + producerFromDb);
        System.out.print("Type the NEW NAME or ENTER to keep the same: ");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDb.getName() : name;

        Producer producerToUpdate = Producer.builder()
                .id(producerFromDb.getId())
                .name(name)
                .build();

        ProducerRepository.update(producerToUpdate);
    }
}
