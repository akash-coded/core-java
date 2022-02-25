package multithreading;

import java.lang.ThreadGroup;

class IndividualThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadGroupDemo {
    public static void main(String[] args) {
        Runnable thread = new IndividualThread();

        ThreadGroup group1 = new ThreadGroup("My Thread Group");

        Thread t1 = new Thread(group1, thread, "one");
        t1.start();

        Thread t2 = new Thread(group1, thread, "two");
        t2.start();
        System.out.println(group1.activeCount());

        System.out.println("Thread Group Name: " + group1.getName());
        group1.list();
        System.out.println(group1.activeCount());

        System.out.println("main thread terminating");
    }
}
