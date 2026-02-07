package pitercoding.devdojo.javacore.colecoes.main;

import pitercoding.devdojo.javacore.colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListMain01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("111111", "iPhone");
        Smartphone smartphone2 = new Smartphone("222222", "Pixel");
        Smartphone smartphone3 = new Smartphone("333333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);
        smartphones.forEach(System.out::println);

        Smartphone smartphone4 = new Smartphone("444444", "Samsung");
        smartphones.add(smartphone4);
        System.out.println(smartphones.contains(smartphone4)); // true/false
        int indexSmartphone4 = smartphones.indexOf(smartphone4);
        System.out.println(indexSmartphone4);
    }
}
