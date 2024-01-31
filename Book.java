package setterandgetter;

public class Book {
	
	private int bookId;
	private String bookTitle;
	private String authorName;
	private int cost;
	private int noOfPages;
	public Book() {
		
	}
	public Book(int bookId, String bookTitle, String authorName, int cost,int noOfPages) {
		
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.cost = cost;
		this.noOfPages = noOfPages;
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	public void  bookDetails()
	{
		
		System.out.println("Book ID :"+getBookId());
		System.out.println("Book Tittle :"+getBookTitle());
		System.out.println("Book Author :"+getAuthorName());
		System.out.println("Book Cost :"+getCost());
		System.out.println("No of pages :"+noOfPages);
		
	}
	
}
