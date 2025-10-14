package multithreading;
//what is thread?
// => Thread is an independent path of execution in a program.


// A thread is a lightweight process that can run concurrently with other threads.
// Threads share the same memory space, which allows them to communicate with each other more easily than processes.
// A thread can be created by extending the Thread class or implementing the Runnable interface.
//many threads can run in parallel, which can improve the performance of a program.

// A thread can be in one of the following states: new, runnable, blocked, waiting, timed waiting, or terminated.
// The new state is when a thread is created but not yet started.
// The runnable state is when a thread is ready to run and waiting for the CPU to execute it.
// The blocked state is when a thread is waiting for a monitor lock to enter a synchronized block or method.
// The waiting state is when a thread is waiting for another thread to perform a particular action.
// The timed waiting state is when a thread is waiting for another thread to perform a particular action for a specified period of time.
// The terminated state is when a thread has completed its execution or has been stopped.
// Synchronization is the process of controlling access to shared resources by multiple threads.
// Synchronization is used to prevent
// data inconsistency and ensure that only one thread can access a shared resource at a time.
// Synchronization can be achieved using synchronized blocks, synchronized methods, or locks.

//what is Multithread?
// => Multithread is a programming technique that allows multiple threads to run concurrently within a single program.


//life cycle of thread
// => The life cycle of a thread consists of several states: new, runnable, running ,blocked/waiting/timed waiting and terminated.

//new state => When a thread is created but not yet started, it is in the new state , When we create a thread object using the Thread class or Runnable
//start() => The thread is not scheduled for running.
//Schedule it for running by calling the start() method.


// runnable state => When a thread is ready to run and waiting for the CPU to execute it, it is in the runnable state.	

// yield() =>  if we can give permission a thread to relinquish/leaving control to another thread of equal priority before its turn comes, the yield() method.
// i.e. you can pause execution of current thread and let allowed another thread of equal priority to run.

//Running state => When a thread is executing its task, it is in the running state. or Running means that the processor has given its time to the thread its execution.
//suspend() and resume() =>It has been suspended using suspend () method . A suspended thread can be revived using the resume() method.

//sleep () => we can put a thread to sleep for a specified period of time using the sleep() method. where time is in milliseconds.
//=> thread.sleep(1000); // sleep for 1 second

//waiting state => When a thread is waiting for another thread to perform a particular action, it is in the waiting state.it has been told to wait until some event occurs.
//This is done using wait() method The thread can scheduled to run again using notify() method.

//blocked state => When a thread is waiting for a monitor lock to enter a synchronized block or method, it is in the blocked state. or
// A thread is said to be blocked when it is prevented from entering into the runnable state and subsequently the running state.
//this can happen when the thread is suspended ,sleeping , or waiting in order to satisfy certain requirements.
// A blocked thread can be moved to the runnable state by calling the notify() method on the object it is waiting for.

//timed waiting state => When a thread is waiting for another thread to perform a particular action for a specified period of time, it is in the timed waiting state.
// A thread can be put into the timed waiting state using the sleep() method with a specified time, or by using the wait() method with a timeout

// dead() => When a thread has completed its execution or has been stopped, it is in the terminated state.. or 
//Every thread has a life cycle,A running threadends its life when it has completed execution its run() method.

//Thread can be created in two ways:
// 1. By extending the Thread class // => By extending the Thread class, we can create a new thread by overriding the run() method. // java.lang.Thread
// 2. By implementing the Runnable interface
public class Thread1  extends Thread{
	public void run() {
		System.out.println("This is the 1st method of thread: By extending the Thread class");
		for (int i = 1; i <=10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // sleep for 2 seconds
			System.out.println("Thread is running " + i);
		}
	}
public static void main(String[] args) {
Thread1 th = new Thread1(); // create a new thread object
th.start(); // start the thread
}
}
