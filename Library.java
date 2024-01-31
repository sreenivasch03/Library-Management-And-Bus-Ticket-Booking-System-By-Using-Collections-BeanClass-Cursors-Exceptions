package setterandgetter;

import java.util.ArrayList;
import java.util.ListIterator;

public class Library 
{
	private String location;
	private Book b;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	
	ArrayList<Book> book = new ArrayList();
	
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Book added successfully");
	}
	
	public void displayBook()
	{
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			for(Book b:book)
			{
				b.bookDetails();
			}
		}
	}
	
	public void searchBook(int id)
	{
		boolean isFound = false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			for(Book b:book)
			{
				if(b.getBookId()==id)
				{
					System.out.println("Book Found : Details are..");
					b.bookDetails();
					isFound = true;
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidBookIdException();
		}
	}
	
	public void searchBookByIdAndBookName(int id,String bookName)
	{
		boolean isFound = false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			for(Book b:book)
			{
				if(b.getBookId()==id)
				{
					if(b.getBookTitle().equalsIgnoreCase(bookName))
					{
						System.out.println("Book Found : Details are..");
						b.bookDetails();
						isFound = true;
					}
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidBookIdException();
		}
	}
	
	public void updateBook(int id)
	{
		boolean isFound = false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			for(Book b:book)
			{
				if(b.getBookId()==id)
				{
					b.setCost(900);
					System.out.println("Book cost updated..");
					isFound = true;
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidBookIdException();
		}
	}
	
	public  void removeBook(int id)
	{
		ListIterator<Book> l = book.listIterator();
		boolean isFound = false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			while(l.hasNext())
			{
				Book b = l.next();
				if(b.getBookId()==id)
				{
					l.remove();
					System.out.println("Book removed successfully");
					isFound = true;
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidBookIdException();
		}
	}
	
}
