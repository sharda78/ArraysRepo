package arraylab.DAO;


import java.util.Arrays;
import java.util.Scanner;

import arraylab.model.Books;

public class BooksDAO extends Books
{

	static Books booktype[] = new Books[5];
	static int index =0;
	
	 public BooksDAO()
	{
		
	}

	public BooksDAO(int bookid,String bookName,float bookPrice,Books booktype[])
	{
		super(bookid,bookName,bookPrice);
		this.booktype = booktype;
	}
	public void addbook(Books book)
	{
		booktype[index++] = book;
	}
	public static boolean modifyBookName(int bookid,String bookName)
	{
		for(int i = 0; i < index; i++)
		{
			if(booktype[i].getBookid() == bookid)
			{
				booktype[i].setBookName(bookName);
				
				return true;
			}
		}
		return false;
	}
	public static boolean modifyBookPrice(int bookid,float bookPrice)
	{
		for(int i = 0; i < index; i++)
		{
			if(booktype[i].getBookid() == bookid)
			{
				booktype[i].setBookPrice(bookPrice);
				
				return true;
			}
		}
		return false;
	}
	public Books[] getAllBooks()
	{
		return null;
		
		
	}
	
@Override
	public String toString() {
		return "BooksDAO : [getAllBooks()=" + Arrays.toString(getAllBooks()) + "]";
	}

public static void main(String[] args) {
	BooksDAO b1 = new BooksDAO();
	b1.addbook(new Books(12,"Wings of fire",350f));
	b1.addbook(new Books(13,"CPP",400f));
	b1.addbook(new Books(14,"Java",200f));
	
	System.out.println(Arrays.toString(booktype));
	System.out.println(modifyBookName(12,"Twon states"));
	System.out.println(Arrays.toString(booktype));
	
}
}

