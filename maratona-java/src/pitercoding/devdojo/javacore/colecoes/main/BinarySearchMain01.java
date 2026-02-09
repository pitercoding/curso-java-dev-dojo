package pitercoding.devdojo.javacore.colecoes.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchMain01 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        // Binary Search: Busca na lista e retorna o índice. Caso não encontre retorna -1
        Collections.sort(numeros); // Obrigatório ordenar a lista antes de usar Binary Search
        System.out.println(Collections.binarySearch(numeros, 2)); // Retorna índice 1 (número 2 na lista)

    }
}
