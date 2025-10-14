package multithreading;
//multiplication table using threads

class Table{
	synchronized static void multipy(int n) {
		for(int i=1;i<=10;i++) {
			try {
			Thread.sleep(2000); // sleep for 2 seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(n +"*"+ i+"="+ n*i);
	}
	}
}
	class Thread5 extends Thread{
		//call by reference
		//Table t;
	
		public void run() {
			Table.multipy(3);
		}
	}
	
	class Thread6 extends Thread{
		//call by reference
	//	Table t;
		
		public void run() {
			Table.multipy(5);
		}
}

public class MultithreadingProgram {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Table t = new Table();
Thread5 th1 = new Thread5();
Thread6 th2 = new Thread6();
th1.start();
th2.start();
	}
}
