package OOPS;

import java.util.Scanner;
//use of this modifier // reference

public class Book_class_constructor {
	String bookname;
	String author;
	String title;

	Book_class_constructor(String bookname, String author, String title) {
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

		Book_class_constructor book = new Book_class_constructor(bookname, author, title);
		book.display();

	}
}
