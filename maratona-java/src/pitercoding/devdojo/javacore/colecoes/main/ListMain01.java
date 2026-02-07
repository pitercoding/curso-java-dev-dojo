package pitercoding.devdojo.javacore.colecoes.main;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListMain01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Tripa Seca");
        nomes.add("Racha Cuca");
        // nomes.remove("Tripa Seca");
        nomes2.add("Quase Nada");
        nomes2.add("Poucas Trancas");

        nomes.addAll(nomes2);

        //Foreach
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("---------------------");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
