package pitercoding.devdojo.javacore.colecoes.main;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapMain01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // imprime tudo abaixo da chava passada
        System.out.println(map.headMap("C", true));

        // Outros métodos:
        // lower -> retorna o menor objeto (<)
        // floor -> retorna o objeto menor ou igual (<=)
        // higher -> retorna o maior objeto (>)
        // ceiling -> retorna o objeto maior ou igual (>=)
    }
}
