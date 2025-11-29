package oops.concept;

import java.util.Scanner;
//use of this modifier // reference

public class ConstructorBook {
	String bookname;
	String author;
	String title;

	ConstructorBook(String bookname, String author, String title) {
		this.bookname = bookname;
		this.author = author;
		this.title = title;
	}

	void display() {

		System.out.println("Name of Book :" + bookname);
		System.out.println("Author :" + author);
		System.out.println("Title:" + title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name");
		String bookname = sc.nextLine();
		System.out.println("Enter author name");
		String author = sc.nextLine();
		System.out.println("Enter title");
		String title = sc.nextLine();

		ConstructorBook book = new ConstructorBook(bookname, author, title);
		book.display();

	}
}

