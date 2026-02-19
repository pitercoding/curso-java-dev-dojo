package pitercoding.devdojo.javacore.threads.main;

class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {
    private final char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// Daemon x User
public class ThreadMain01 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExample('A'), "T1A");
            Thread t2 = new Thread(new ThreadExample('B'), "T2B");
        Thread t3 = new Thread(new ThreadExample('C'), "T3C");
        Thread t4 = new Thread(new ThreadExample('D'), "T4D");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
