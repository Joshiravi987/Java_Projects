package loopingstatement;

public class FactorialWhileloop {
public FactorialWhileloop(int n) {
	// TODO Auto-generated constructor stub
	int fact = 1;
	int i = 1;
	while (i <= n) {
		fact = fact * i;
		i++;
	}
	System.out.println(fact);
}

public static void main(String[] args) {
	FactorialWhileloop obj = new FactorialWhileloop(5);

}
}
