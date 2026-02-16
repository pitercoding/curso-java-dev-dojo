package pitercoding.devdojo.javacore.colecoes.main;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>(); // FIFO
        fila.add("C");
        fila.add("A");
        fila.add("B");

        for (String s : fila) {
            System.out.println(s);
        }
    }
}
