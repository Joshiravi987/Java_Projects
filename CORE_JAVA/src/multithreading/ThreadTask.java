package multithreading;

import java.util.concurrent.CountDownLatch;

public class ThreadTask extends Thread {
    int num;
    CountDownLatch latch;

    public ThreadTask(int num, CountDownLatch latch) {
        this.num = num;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // Wait until it's this thread's turn
            latch.await();
            System.out.println("Task :" + num + " started by " + Thread.currentThread().getName());

            Thread.sleep(2000); // simulate work

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            // 3 latches for controlling start order
            CountDownLatch latch1 = new CountDownLatch(0); // Task1 can start immediately
            CountDownLatch latch2 = new CountDownLatch(1); // Task2 waits
            CountDownLatch latch3 = new CountDownLatch(1); // Task3 waits

            ThreadTask task1 = new ThreadTask(1, latch1);
            ThreadTask task2 = new ThreadTask(2, latch2);
            ThreadTask task3 = new ThreadTask(3, latch3);

            task1.start();
            task2.start();
            task3.start();

            // Release tasks in order
            Thread.sleep(100); // small delay for order
            latch2.countDown(); // allow Task2
            Thread.sleep(100);
            latch3.countDown(); // allow Task3

            // Now join in order for finish messages
            task1.join();
            System.out.println("Task :1 finished by " + task1.getName());

            task2.join();
            System.out.println("Task :2 finished by " + task2.getName());

            task3.join();
            System.out.println("Task :3 finished by " + task3.getName());

            System.out.println("All tasks are finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
