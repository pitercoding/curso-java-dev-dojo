package pitercoding.devdojo.javacore.concorrencia.main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock reentrantLock;

    public Worker(String name, ReentrantLock reentrantLock) {
        this.name = name;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        try {
            if (reentrantLock.isHeldByCurrentThread()) {
                System.out.printf("Thread %s entrou em uma sessão crítica!%n", name);
            }
            System.out.printf("%d Threads esperando na fila%n", reentrantLock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2s%n", name);
            System.out.printf("Thread %s finalizou a espera%n", name);
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();
        }
    }
}

public class ReentrantLockMain01 {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        new Thread(new Worker("A", reentrantLock)).start();
        new Thread(new Worker("B", reentrantLock)).start();
        new Thread(new Worker("C", reentrantLock)).start();
        new Thread(new Worker("D", reentrantLock)).start();
        new Thread(new Worker("E", reentrantLock)).start();
        new Thread(new Worker("F", reentrantLock)).start();
        new Thread(new Worker("G", reentrantLock)).start();
    }
}
