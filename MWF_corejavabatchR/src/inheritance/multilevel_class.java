package inheritance;

import java.util.Scanner;

class admin {
	int size;
	Scanner scn = new Scanner(System.in);
	int id[];
	String name[];

	public admin() {
		System.out.println("Enter num of array elements");
		size = scn.nextInt();
		id = new int[size];
		name = new String[size];
		System.out.println("Enter " + size + " id and name of admin");
		for (int i = 0; i < size; i++) {
			id[i] = scn.nextInt();
			name[i] = scn.next();
		}
	}

	void display() {
		System.out.println("admin details");
		for (int i = 0; i < size; i++) {
			System.out.println("id :" + id[i] +"\t"+ " name: " + name[i]);
		}
	}
}

class manager extends admin {
	int id[];
	String name[];

	public manager() {
		id = new int[size];
		name = new String[size];
		System.out.println(" Size and id and name of manager");
		for (int i = 0; i < size; i++) {
			id[i] = scn.nextInt();
			name[i] = scn.next();
		}
	}

	void display() {
		super.display();
		System.out.println("Manager details");
		for (int i = 0; i < size; i++) {
			System.out.println("id :" + id[i] + "\t" + "name : " + name[i]);
		}
	}
}

class employee extends manager {
	int id[];
	String namep[];

	public employee() {
		id = new int[size];
		name = new String[size];
		System.out.println("size , id and name of employee");
		for (int i = 0; i < size; i++) {
			id[i] = scn.nextInt();
			name[i] = scn.next();

		}
	}

	void display() {
		super.display();
		System.out.println("employee details");
		for (int i = 0; i < size; i++) {
			System.out.println("id :" + id[i] + "\t" + "name : " + name[i]);
		}
	}
}

public class multilevel_class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp = new employee();
		emp.display();
	}

}
