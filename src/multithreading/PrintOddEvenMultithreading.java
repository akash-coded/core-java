package src.multithreading;

class NaturalNumbers {
    private static final int LIMIT = 100;
    int counter = 1;

    synchronized void printEven() {
        while (counter < LIMIT) {
            while (counter % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(counter++);
            notifyAll();
        }
    }

    synchronized void printOdd() {
        while (counter < LIMIT) {
            while (counter % 2 == 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println((counter++));
            notifyAll();
        }
    }
}

public class PrintOddEvenMultithreading {
    public static void main(String[] args) {
        NaturalNumbers naturalNumbers = new NaturalNumbers();

        new Thread() {
            @Override
            public void run() {
                naturalNumbers.printEven();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                naturalNumbers.printOdd();
            }
        }.start();
    }
}