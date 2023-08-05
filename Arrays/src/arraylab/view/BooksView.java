package arraylab.view;

import java.util.Scanner;

import arraylab.model.Books;
import arraylab.service.BooksServices;

public class BooksView 
{
	int bookid;
	String bookName;
	float bookPrice;

	 static  BooksServices bservices = new BooksServices();
	 
	 public void addbook()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter bookid");
		 bookid = sc.nextInt();
		 System.out.println("Enter bookName");
		 bookName = sc.next();
		 System.out.println("Enter Bookprice");
		 bookPrice = sc.nextFloat();
		 bservices.addBookServices(new Books(bookid,bookName,bookPrice));
	 }
	 public void display(Books b[])
	 {
		 for(Books n : b)
		 {
			 if(n != null)
			 {
				 System.out.println(n);
			 }
		 }
	 }
	public static void main(String[] args) {
		BooksView b2 = new BooksView();
		b2.addbook();
		//b2.display(new Books());
		
		 
		 
	}

}
