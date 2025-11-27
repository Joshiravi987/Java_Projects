package javamodifiers;


public class StaticCounter {
	static int count=0;
	public StaticCounter() {
		count++;
		System.out.println(count);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	new StaticCounter();
	new StaticCounter();
	new StaticCounter();
	new StaticCounter();
	new StaticCounter();
	}
}
