package OOPS.abstraction;

class SBI extends Bank {

	int getrate() {
		return 7;
	}
}

class BOB extends Bank {

	@Override
	int getrate() {
		// TODO Auto-generated method stub
		return 8;
	}
}

class HDFC extends Bank {
	int getrate() {
		return 9;
	}
}

public class call_bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI sbi = new SBI();
System.out.println("SBI Rate: " + sbi.getrate()+ "%");
	
BOB bob = new BOB();
System.out.println("BOB Rate: " + bob.getrate() + "%");
		HDFC hdfc = new HDFC();
		System.out.println("HDFC Rate: " + hdfc.getrate() + "%");

	}}