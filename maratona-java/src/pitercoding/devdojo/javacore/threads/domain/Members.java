package pitercoding.devdojo.javacore.threads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addEmail(String email) {
        synchronized (this.emails) {
           String threadName = Thread.currentThread().getName();
           System.out.println(threadName + " adicionou o email na lista");
           this.emails.add(email);
           this.emails.notifyAll();
        }
    }

    public String retrieveEmail() {
        System.out.println(Thread.currentThread().getName() + " verificando se existem emails...");
        synchronized (this.emails) {
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println("Nenhum email disponível para processamento. Modo de espera ativado!");
                try {
                    this.emails.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " notificando que não estamos mais pegando emails...");
        }
    }
}
