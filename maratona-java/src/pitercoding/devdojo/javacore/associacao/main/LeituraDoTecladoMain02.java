package pitercoding.devdojo.javacore.associacao.main;

import java.util.Scanner;

public class LeituraDoTecladoMain02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===================================================");
        System.out.println("    Bem vindo ao Software de Privsão do Futuro!");
        System.out.println("===================================================");

        System.out.print("Digite sua pergunta (Eu respondo com Sim/Não): ");
        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM!");
        } else {
            System.out.println("Não!");
        }
    }
}
