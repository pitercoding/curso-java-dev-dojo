package pitercoding.devdojo.javacore.concorrencia.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;
    private ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();


    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " adicionou o email na lista");
            this.emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public String retrieveEmail() {
        System.out.println(Thread.currentThread().getName() + " verificando se existem emails...");
        lock.lock();
        try {
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println("Nenhum email disponível para processamento. Modo de espera ativado!");
                condition.await();
            }
            return this.emails.poll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " notificando que não estamos mais pegando emails...");
            condition.signalAll();
        } finally {
            lock.unlock();
        }

    }
}
