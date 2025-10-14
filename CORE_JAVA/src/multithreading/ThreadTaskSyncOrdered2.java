package multithreading;

public class ThreadTaskSyncOrdered2 extends Thread {
    int num;
    static final Object lock = new Object();
    static int turn = 1; // controls start order

    public ThreadTaskSyncOrdered2(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                // wait for turn to start
                while (turn != num) {
                    lock.wait();
                }

                // Print start message in order
                System.out.println("Task :" + num + " started by " + Thread.currentThread().getName());

                // After printing start, allow next thread
                turn++;
                lock.notifyAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Do work outside lock (concurrent execution)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadTaskSyncOrdered2 task1 = new ThreadTaskSyncOrdered2(1);
        ThreadTaskSyncOrdered2 task2 = new ThreadTaskSyncOrdered2(2);
        ThreadTaskSyncOrdered2 task3 = new ThreadTaskSyncOrdered2(3);

        // Start all threads
        task1.start();
        task2.start();
        task3.start();

        try {
            // Finish messages printed in order using join()
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
