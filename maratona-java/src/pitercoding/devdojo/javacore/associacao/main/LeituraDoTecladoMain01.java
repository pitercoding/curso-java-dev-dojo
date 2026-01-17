package pitercoding.devdojo.javacore.associacao.main;

import java.util.Scanner;

public class LeituraDoTecladoMain01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome abaixo: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite 'M' ou 'F' para seu sexo: ");
        char sexo = scanner.next().trim().toUpperCase().charAt(0);

        System.out.println("-------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
