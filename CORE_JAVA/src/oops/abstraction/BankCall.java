package oops.abstraction;

class SBI extends Bank {
	int getRate() {
		return 7;
	}
}

class ICICI extends Bank {
	int getRate() {
		return 8;
	}
}

class HDFC extends Bank {
	int getRate() {
		return 9;
	}
}


public class BankCall {
public static void main(String[] args) {
	SBI sbi = new SBI();
	System.out.println("SBI Rate: " + sbi.getRate() + "%");

	ICICI icici = new ICICI();
	System.out.println("ICICI Rate: " + icici.getRate() + "%");

	HDFC hdfc = new HDFC();
	System.out.println("HDFC Rate: " + hdfc.getRate() + "%");
}
}
