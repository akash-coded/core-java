package src.multithreading;

class PrintingSequences {
    private static final int LIMIT = 10;
    int counter = 1;
    boolean isPrinting = false;

    private void printAndAddCounter() {
        System.out.println(counter++ + " (printed by " + Thread.currentThread().getName() + ")");
    }

    // thread1
    // prints 1, 4, 7, 10, ...
    synchronized void printAPStartingFrom1() {
        int count = LIMIT % 3 == 0 ? LIMIT / 3 : LIMIT / 3 + 1;
        for (int i = 0; i < count; i++) {
            while (counter % 3 != 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
            }
            printAndAddCounter();
            notifyAll();
        }
    }

    // thread2
    // prints 2, 5, 8, 11, ...
    synchronized void printAPStartingFrom2() {
        int count = (LIMIT - 1) % 3 == 0 ? LIMIT / 3 : LIMIT / 3 + 1;
        for (int i = 0; i < count; i++) {
            while (counter % 3 != 2) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
            }
            printAndAddCounter();
            notifyAll();
        }
    }

    // thread3
    // prints 3, 6, 9, 12, ...
    synchronized void printAPStartingFrom3() {
        int count = LIMIT / 3;
        for (int i = 0; i < count; i++) {
            while (counter % 3 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
            }
            printAndAddCounter();
            notifyAll();
        }
    }
}

public class TripleThreadCommunication {
    public static void main(String[] args) {
        PrintingSequences naturalNumbers = new PrintingSequences();

        new Thread("Thread-1") {
            @Override
            public void run() {
                naturalNumbers.printAPStartingFrom1();
            }
        }.start();

        new Thread("Thread-2") {
            @Override
            public void run() {
                naturalNumbers.printAPStartingFrom2();
            }
        }.start();

        new Thread("Thread-3") {
            @Override
            public void run() {
                naturalNumbers.printAPStartingFrom3();
            }
        }.start();
    }
}
