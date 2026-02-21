package pitercoding.devdojo.javacore.concorrencia.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable {
    private final int num;

    Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s início: %d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s finalizou%n", Thread.currentThread().getName());
    }
}

public class ExecutorsMain01 {
    public static void main(String[] args) {
        // System.out.println(Runtime.getRuntime().availableProcessors());
        // ExecutorService executorService = Executors.newFixedThreadPool(4); // número definido
        // ExecutorService executorService = Executors.newSingleThreadExecutor(); // Somente com uma thread
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.execute(new Printer(5));
        executorService.execute(new Printer(6));
        executorService.shutdown();

    }
}
