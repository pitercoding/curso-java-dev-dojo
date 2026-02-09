package pitercoding.devdojo.javacore.colecoes.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoMain01 {
    public static void main(String[] args) {

        // List -> Array
        List<Integer> numerosList = new ArrayList<>();
        numerosList.add(1);
        numerosList.add(2);
        numerosList.add(3);

        Integer[] listToArray = numerosList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("-------------------");

        // Array -> List (mutável)
        Integer[] numerosArray = {1, 2, 3};
        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(numerosArray));
        arrayToList.add(4);

        System.out.println(arrayToList);
    }
}
