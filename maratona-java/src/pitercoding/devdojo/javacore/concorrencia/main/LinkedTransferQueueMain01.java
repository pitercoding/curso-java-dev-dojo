package pitercoding.devdojo.javacore.concorrencia.main;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueMain01 {
    public static void main(String[] args) throws InterruptedException {
        // LinkedTransferQueue: Junta as funcionalidades de ConcurrentLinkedQueue, SynchronousQueue e LinkedBlockingQueue.
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Racha Cuca"));
        System.out.println(tq.offer("Racha Cuca"));
        // System.out.println(tq.offer("Racha Cuca"), 10, TimeUnit.SECONDS);
        tq.put("Tripa Seca");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Quase Nada");
        }

        System.out.println(tq.tryTransfer("Poucas Trancas"));
        System.out.println(tq.tryTransfer("Poucas Trancas", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.remainingCapacity());
    }
}
