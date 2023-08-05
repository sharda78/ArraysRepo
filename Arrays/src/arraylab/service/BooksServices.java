package arraylab.service;

import arraylab.DAO.BooksDAO;
import arraylab.model.Books;

public class BooksServices {

	static BooksDAO bDAO = new BooksDAO();
	
	public void addBookServices(Books book1)
	{
		bDAO.addbook(book1);
	}
	public  boolean modifybookNameServices(int bookid,String bookName)
	{
		return bDAO.modifyBookName(bookid,bookName);
	}
	public boolean modifybooksPriceServices(int bookid,float bookPrice)
	{
		return bDAO.modifyBookPrice(bookid, bookPrice);
	}
	public  Books[] getAllBookService()
	{
		return bDAO.getAllBooks();
	}

}
