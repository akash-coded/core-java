package src.multithreading;

class ReciteTable {
    static synchronized void printTable(int n) {
        System.out.println(Thread.currentThread().getName() + " has locked the synchronized block");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " is releasing the lock");

        System.out.println("Non-synchronized line printed by " +
                Thread.currentThread().getName());
    }
}

class TestStaticSynchronization extends Thread {
    @Override
    public void run() {
        ReciteTable.printTable(5);
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        TestStaticSynchronization thread1 = new TestStaticSynchronization();
        TestStaticSynchronization thread2 = new TestStaticSynchronization();
        TestStaticSynchronization thread3 = new TestStaticSynchronization();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
