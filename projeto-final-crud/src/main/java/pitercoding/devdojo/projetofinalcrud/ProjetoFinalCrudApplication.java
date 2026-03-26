package pitercoding.devdojo.projetofinalcrud;

import pitercoding.devdojo.projetofinalcrud.service.ProducerService;

import java.sql.SQLException;
import java.util.Scanner;

public class ProjetoFinalCrudApplication {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            producerMenu();
            op = Integer.parseInt(scanner.nextLine());
            if (op == 0) break;
            ProducerService.buildMenu(op);
        }
    }

    private static void producerMenu() {
        System.out.println("Type the number of your option: ");
        System.out.println("1. Search for producer");
        System.out.println("0. Exit");
    }
}
