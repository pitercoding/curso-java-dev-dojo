package pitercoding.devdojo.javacore.colecoes.main;

import java.util.HashMap;
import java.util.Map;

public class MapMain01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc2", "você");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
        System.out.println("-------------------");
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("-------------------");
        map.entrySet().forEach(System.out::println);
    }
}
