package src.multithreading;

class Customer {
    private int bankBalance = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");
        while (this.bankBalance < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.bankBalance -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.bankBalance += amount;
        System.out.println("deposit completed... ");
        notifyAll();
    }
}

public class ThreadCooperationDemo {
    public static void main(String[] args) {
        final Customer c = new Customer();

        new Thread() {
            @Override
            public void run() {
                c.withdraw(15000);
            }
        }.start(); // Thread-1

        // new Thread() {
        // public void run() {
        // c.withdraw(11000);
        // }
        // }.start(); // Thread-2

        // new Thread() {
        // public void run() {
        // c.withdraw(10000);
        // }
        // }.start(); // Thread-3

        new Thread() {
            public void run() {
                c.deposit(3000);
            }
        }.start(); // Thread-4
    }
}
