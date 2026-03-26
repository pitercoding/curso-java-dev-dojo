package pitercoding.devdojo.projetofinalcrud.service;

import pitercoding.devdojo.projetofinalcrud.domain.Producer;
import pitercoding.devdojo.projetofinalcrud.repository.ProducerRepository;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static Scanner scanner = new Scanner(System.in);

    public static void buildMenu(int option) {
        switch (option) {
            case 1: findByName(); break;
            default:
                throw new IllegalArgumentException("Invalid option!");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to show all: ");
        String name = scanner.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        for (int i = 0; i < producers.size(); i++) {
            System.out.printf("[%d] - %s\n", i, producers.get(i).getName());
        }
    }
}
