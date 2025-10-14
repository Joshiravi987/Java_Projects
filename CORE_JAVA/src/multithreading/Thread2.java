package multithreading;
//2. By implementing the Runnable interface.
public class Thread2 implements Runnable
{
public static void main(String[] args) {
	Thread2 th = new Thread2(); // create a new thread object
	Thread t = new Thread(th); // create a thread using the Runnable interface
	t.start(); // start the thread
}

	// The run() method contains the code that will be executed by the thread.

	@Override
	public void run() {
		System.out.println("This is the 2nd method of thread: By implementing the Runnable interface");
		for (int i = 0; i <=10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // sleep for 2 seconds
			System.out.println("Thread is running " + i);
		}		
	}

}
