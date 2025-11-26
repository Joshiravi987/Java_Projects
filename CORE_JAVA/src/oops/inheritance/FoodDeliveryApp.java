package oops.inheritance;

import java.util.Scanner;

public class FoodDeliveryApp {
int quantity,total;
String choice;
int total_amount[]=new int[4];
int amount[]=new int[4];
static int counter=0;
String food_item[]= new String[4];
 public FoodDeliveryApp() {
	// define var
	 Scanner scn =new Scanner(System.in);
	 while(true) {
		 System.out.println("---------Menu--------");
		 System.out.println("1:Pizza\tprice=180rs/pcs");
		 System.out.println("2:Burger\tprice=100rs/pcs");
		 System.out.println("3:Dosa\tprice=120rs/pcs");
		 System.out.println("4:Idli\tprice=50rs/pcs");
		 System.out.println("please enter your choice");
		 choice=scn.next();
		 switch (choice) {
		 case "1":
			 counter++;
			 food_item[0]="Pizza";
			 System.out.println("You have Selected"+food_item[0]);
			 System.out.println("Enter quantity");
			 quantity=scn.nextInt();
			 amount[0]=180;
			 total_amount[0]=quantity*180;
			 System.out.println("Amount"+total_amount[0]);
			 System.out.println("Do you want to place more orders? yes or no");
			 choice=scn.next();
			 if(choice.equals("yes")){
				 System.out.println("Add more orders");
				
			 }
			 else {
				 System.out.println("Thanks for choosing Food_delivery_app");
				 bill_Gernerate();
				 return;
			 }
			 break;
		 case "2":
			 counter++;
			 food_item[1]="Burger";
			 System.out.println("You have Selected"+food_item[1]);
			 System.out.println("Enter quantity");
			 quantity=scn.nextInt();
			 amount[1]=100;
			 total_amount[1]=quantity*100;
			 System.out.println("Amount"+total_amount[1]);
			 System.out.println("Do you want to place more orders? yes or no");
			 choice=scn.next();
			 if(choice.equals("yes")){
				 System.out.println("Add more orders");
				
			 }
			 else {
				 System.out.println("Thanks for choosing Food_delivery_app");
				 bill_Gernerate();
				 return;
			 }
			 break;
		 case "3":
			 counter++;
			 food_item[2]="Dosa";
			 System.out.println("You have Selected"+food_item[2]);
			 System.out.println("Enter quantity");
			 quantity=scn.nextInt();
			 amount[2]=120;
			 total_amount[2]=quantity*120;
			 System.out.println("Amount"+total_amount[2]);
			 System.out.println("Do you want to place more orders? yes or no");
			 choice=scn.next();
			 if(choice.equals("yes")){
				 System.out.println("Add more orders");
				
			 }
			 else {
				 System.out.println("Thanks for choosing Food_delivery_app");
				 bill_Gernerate();
				 return;
			 }
			 break;
		 case "4":
			 counter++;
			 food_item[3]="Idli";
			 System.out.println("You have Selected"+food_item[3]);
			 System.out.println("Enter quantity");
			 quantity=scn.nextInt();
			 amount[3]=50;
			 total_amount[3]=quantity*50;
			 System.out.println("Amount"+total_amount[3]);
			 System.out.println("Do you want to place more orders? yes or no");
			 choice=scn.next();
			 if(choice.equals("yes")){
				 System.out.println("Add more orders");
				
			 }
			 else {
				 System.out.println("Thanks for choosing Food_delivery_app");
				 bill_Gernerate();
				 return;
			 }
			 break;
			 default:
				 System.out.println("Invalid choice please select valid option");
				 break;
		 }}
	 }
	 void bill_Gernerate() {
		 System.out.println("--------Bill Genereted--------");
		 for(int i=0;i<counter;i++) {
			 System.out.println("Food Item:"+food_item[i]+"  Amount:"+total_amount[i]);
			 total=total+total_amount[i];
		 }
		 System.out.println("Total Amount to be paid="+total+"rs");
}
	 public static void main(String[] args) {
		 new FoodDeliveryApp();
	}
}
