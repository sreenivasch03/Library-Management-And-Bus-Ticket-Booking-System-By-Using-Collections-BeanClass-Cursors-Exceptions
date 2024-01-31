package setterandgetter;

import java.util.Scanner;

public class TicketDriver 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		User user = new User();
		Ticket ticket = new Ticket();
		
		boolean status = true;
		while(status)
		{
			System.out.println("--------------------------------");
			System.out.println(" WELCOME TO APSRTC TICKET BOOKING");
			System.out.println("--------------------------------");
			System.out.println(" 1.Book Ticket \n 2.Display Ticket Information \n 3.Change Boarding Point \n 4.Change Destination Point \n 5.Change Journey Date \n 6.Cancel Ticket \n 7. Check Journey Details \n 8.Exit");
			System.out.println("=> Please enter your option :");
			
			int option = sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter Your Destination Point :");
				String destination = sc.next();
				System.out.println("Enter Your Boarding Point :");
				String boarding = sc.next();
				System.out.println("Enter Your Journey Date (DD-MM-YYYY) :");
				String journeyDate = sc.next();
				user.bookTicket(new Ticket(destination,boarding,journeyDate));
			break;
			case 2:
				user.displayTicket();
			break;
			case 3:
				System.out.println("Enter Your Ticket Number :");
				int ticketNum = sc.nextInt();
				System.out.println("Enter New Boarding Point :");
				String newBoarding = sc.next();
				user.changeBoardingPoint(ticketNum,newBoarding);
			break;
			case 4:
				System.out.println("Enter Your Ticket Number :");
				int ticketNum1 = sc.nextInt();
				System.out.println("Enter New Destination Point :");;
				String newDestination = sc.next();
				user.changeBoardingPoint(ticketNum1,newDestination);
			break;
			case 5:
				System.out.println("Enter Your Ticket Number :");
				int ticketNum2 = sc.nextInt();
				System.out.println("Enter New Journey Date :");;
				String newJourneyDate = sc.next();
				user.changeJourneyDate(ticketNum2,newJourneyDate);
			break;
			case 6:
				System.out.println("Enter Your Ticket Number :");
				int ticketNum3 = sc.nextInt();
				user.cancelTicket(ticketNum3);
			break;
			case 7:
				System.out.println("Enter Your Ticket Number :");
				int ticketNum4 = sc.nextInt();
				user.journeyDetails(ticketNum4);
			break;
			case 8:
				System.out.println("Thanking you..visit again :)");
				status = false;
			break;
			default:
				System.out.println("Invalid option..Please Check!");
			}
		}
		
	}
}
