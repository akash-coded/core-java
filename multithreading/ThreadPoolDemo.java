package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String message;

    WorkerThread(String message) {
        this.message = message;
    }

    private void intermediateTasks() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running. Message: " + this.message);
        intermediateTasks();
        System.out.println(Thread.currentThread().getName() + " terminated");
    }
}

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // creating a pool of 5 threads

        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("Thread-" + i);
            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all the threads");
        System.out.println("main thread terminating");
    }
}
