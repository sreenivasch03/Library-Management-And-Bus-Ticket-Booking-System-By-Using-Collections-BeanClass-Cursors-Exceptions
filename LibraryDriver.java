package setterandgetter;

import java.util.Scanner;

public class LibraryDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		Book b = new Book();
		
		boolean status = true;
		while(status)
		{
			System.out.println("Enter your option : \n 1.Add Book \n 2.Display Book \n 3.Search Book By ID \n 4.Search Book By ID and Tittle \n 5.Update Book \n 6.Remove Book \n 7.Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Book ID :");
				int bookId = sc.nextInt();
				System.out.println("Enter Book Tittle :");
				String bookTittle = sc.next();
				System.out.println("Enter Author Name :");
				String authorName = sc.next();
				System.out.println("Enter Book Cost :");
				int bookCost = sc.nextInt();
				System.out.println("Enter No.of pages :");
				int noOfPages = sc.nextInt();
				l.addBook(new Book(bookId,bookTittle,authorName,bookCost,noOfPages));
			break;
			case 2:
				l.displayBook();
			break;
			case 3:
				System.out.println("Enter Book ID :");
				int bookId2 = sc.nextInt();
				l.searchBook(bookId2);
			break;
			case 4:
				System.out.println("Enter Book ID :");
				int bookId3 = sc.nextInt();
				System.out.println("Enter Book Tittle :");
				String bookTittle1 = sc.next();
				l.searchBookByIdAndBookName(bookId3, bookTittle1);
			break;
			case 5:
				System.out.println("Enter Book ID :");
				int bookId4 = sc.nextInt();
				l.updateBook(bookId4);
			break;
			case 6:
				System.out.println("Enter Book ID :");
				int bookId5 = sc.nextInt();
				l.removeBook(bookId5);
			break;
			case 7:
				System.out.println("Thank you..Visit again.. :)");
				status = false;
			break;
			default:
				System.out.println("Invalid choice..Please Check!");
			}
		}
	}
}
