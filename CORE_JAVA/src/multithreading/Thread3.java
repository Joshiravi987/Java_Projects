package multithreading;
//join() method is used when one thread need to wait for another thread to finish before execution.
//join() method is used to wait for a thread to finish its execution before proceeding with the next line of code.
//join() method is used to ensure that the main thread waits for the completion of the child threads before proceeding.
// It is useful when you want to ensure that a thread has completed its execution before performing some action in the main thread.
public class Thread3 extends Thread{
	public Thread3(String name) {	
		super(name);
	}
	public void run(){
		for (int i =0; i <=5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // sleep for 2 seconds
			System.out.println(Thread.currentThread().getName() + " is running " + i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Thread3 t = new Thread3("Thread-A"); // create a new thread object
		Thread3 t1 = new Thread3("Thread-B"); // create another thread object
		Thread3 t2 = new Thread3("Thread-C"); // create another thread object
		t.start(); // start the first thread
		t.join(); // wait for the first thread to finish before starting the next one
		t1.start(); // start the second thread
		t1.join(); // wait for the second thread to finish before starting the next one
		t2.start(); // start the third thread
		
	}
	{
		
}

}
