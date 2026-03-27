package pitercoding.devdojo.projetofinalcrud;

import pitercoding.devdojo.projetofinalcrud.service.ProducerService;

import java.util.Scanner;

public class ProjetoFinalCrudApplication {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            producerMenu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            ProducerService.menu(op);
        }
    }

    private static void producerMenu() {
        System.out.println();
        System.out.println("========= MENU =========");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("0. Exit");
        System.out.print("Type your choice: ");
    }
}
