package pitercoding.devdojo.javacore.concorrencia.main;

import java.util.concurrent.*;

public class FutureMain01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollar = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 4.35D;
        });

        System.out.println(doSomething());
        Double dollarResponse = dollar.get(3, TimeUnit.SECONDS);
        System.out.println("Dollar: " + dollarResponse + "  ");
        executorService.shutdown();
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
