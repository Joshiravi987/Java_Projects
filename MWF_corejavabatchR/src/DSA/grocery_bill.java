package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class grocery_bill {
int pid;
String name;
int quantity;
double price;
public grocery_bill(int pid, String name, int quantity, double price) {
	this.pid = pid;
	this.name = name;
	this.quantity = quantity;
	this.price = price;
}
	public static void main(String[] args) {
ArrayList<grocery_bill>al = new ArrayList<grocery_bill>();
Scanner sc = new Scanner(System.in);
System.out.println(" "+"Enter the size of inventory");
int n = sc.nextInt();
int choice = 0;
do {
	System.out.println("1. Add Product");
	System.out.println("2. Display Products");
	System.out.println("3. Search Product");
	System.out.println("4. update quantity");
	System.out.println("5. calculate total bill");
	System.out.println("6. Delete Product by bill id");
	System.out.println("7. Exit");
	System.out.println("Please select an option (1-7):");
	int op = sc.nextInt();
	switch (op) {
	case 1:
		for(int i=0;i<n;i++) {
			System.out.println("Enter Product ID:" + (i + 1) + ":");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name:" + (i + 1) + ":");
			String name = sc.next();
			System.out.println("Enter Product Quantity:" + (i + 1) + ":");
			int quantity = sc.nextInt();
			System.out.println("Enter Product Price:" + (i + 1) + ":");
			double price = sc.nextDouble();
			grocery_bill g = new grocery_bill(pid, name, quantity, price);
			al.add(g);
			
		}
		break;
	case 2:
		System.out.println("" + "Displaying Products:");
		for(grocery_bill g : al) {
			System.out.println("Product ID: " + g.pid + ", Name: " + g.name + ", Quantity: " + g.quantity + ", Price: " + g.price);
	}
break;
	case 3: 
		System.out.println("Enter Product name to search:");
		String searchId = sc.next();
		boolean f = false;
		for(grocery_bill g : al) {
			if(g.name.equalsIgnoreCase(searchId)) {
				System.out.println("Product found: ID: " + g.pid + ", Name: " + g.name + ", Quantity: " + g.quantity + ", Price: " + g.price);
				f = true;
				break;
			}
			
		
			
		}
		if(!f) {
			System.out.println("Product not found with ID: " + searchId);
			break;
		}
		break;
	case 4:
		System.out.println("Enter Product ID to update quantity:");
		int updateId = sc.nextInt();
		boolean found = false;
		for(grocery_bill g : al) {
			if(g.pid == updateId) {
				System.out.println("Current Quantity: " + g.quantity);
				System.out.println("Enter new quantity:");
				int newQuantity = sc.nextInt();
				g.quantity = newQuantity;
				System.out.println("Quantity updated successfully for Product ID: " + g.pid);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Product not found with ID: " + updateId);
			break;
		}
		break;
	case 5:
		double totalBill = 0.0;
		for(grocery_bill g: al) {
			totalBill += g.quantity * g.price;
			System.out.println("" + "Product ID: " + g.pid + ", Name: " + g.name + ", Quantity: " + g.quantity + ", Price: " + g.price);
		}
		System.out.println("Total Bill Amount: " + totalBill);
		break;
		case 6:
			System.out.println("Enter Product ID1 to delete:");
			int deleteId = sc.nextInt();
			boolean deleted = false;
			for(int i = 0; i < al.size(); i++) {
				if(al.get(i).pid == deleteId) {
					al.remove(i);
					System.out.println("Product with ID: " + deleteId + " deleted successfully.");
					deleted = true;
					break;
				}
			}
			if(!deleted) {
				System.out.println("Product not found with ID: " + deleteId);
			}
			break;
			case 7:
				System.exit(0);
				break;
				default:
					System.out.println("Invalid choice. Please select a valid option (1-7).");
					break;
	}}
while(choice != 7);

}}