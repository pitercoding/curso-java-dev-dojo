package pitercoding.devdojo.javacore.generics.main;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Racha Cuca");
        lista.add("Tripa Seca");

        for (String nome : lista) {
            System.out.println(nome);
        }
    }
}
