package pitercoding.devdojo.javacore.classesinternas.main;

import pitercoding.devdojo.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNameComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco barco1, Barco barco2) {
        return barco1.getNome().compareTo(barco2.getNome());
    }
}

public class AnonymousClassesMain02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco barco1, Barco barco2) {
                return barco1.getNome().compareTo(barco2.getNome());
            }
        });
        System.out.println(barcoList);
    }
}