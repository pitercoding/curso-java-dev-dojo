package pitercoding.devdojo.javacore.threads.main;

import pitercoding.devdojo.javacore.threads.domain.Account;

public class ThreadAccountMain01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountMain01 threadAccountMain01 = new ThreadAccountMain01();
        Thread t1 = new Thread(threadAccountMain01, "Hestia");
        Thread t2 = new Thread(threadAccountMain01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() == 0) {
                System.out.println("Conta zerada");
            }
        }
    }

    private synchronized void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque" + account.getBalance());
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }
}
