package multithreading;

class DisplayTable {
    void printTable(int n) {
        synchronized (this) {
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
        }

        System.out.println("Non-synchronized line printed by " +
                Thread.currentThread().getName());
    }
}

class TestSynchronizedBlock extends Thread {
    DisplayTable table;

    TestSynchronizedBlock(DisplayTable table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        DisplayTable table = new DisplayTable();

        TestSynchronizedBlock thread1 = new TestSynchronizedBlock(table);
        TestSynchronizedBlock thread2 = new TestSynchronizedBlock(table);
        TestSynchronizedBlock thread3 = new TestSynchronizedBlock(table);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
