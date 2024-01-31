package setterandgetter;

import java.util.ArrayList;
import java.util.ListIterator;

public class User 
{
	private String name;
	private int mobileNo;
	private int age;
	private Ticket t;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Ticket getT() {
		return t;
	}
	public void setT(Ticket t) {
		this.t = t;
	}
	
	
	
	public User() 
	{
		
	}
	
	public User(String name, int mobileNo, int age) 
	{
		
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		
	}
	
	public void userDetails()
	{
		System.out.println("User Name :"+getName());
		System.out.println("Mobile No :"+getMobileNo());
		System.out.println("Age       :"+getAge());
	}

	ArrayList<Ticket> ticket = new ArrayList();
	
	public void bookTicket(Ticket t)
	{
		ticket.add(t);
		System.out.println("Ticket booked successfully.");
	}
	
	public void displayTicket()
	{
		if(ticket.isEmpty())
		{
			throw new NoBookedTicketsException();
		}
		else
		{
			for(Ticket t1 :ticket)
			{
				t1.ticketDetails();
			}
		}
	}
	
	public void changeBoardingPoint(int ticketNumber,String newBoarding)
	{
		boolean isFound = false;
		if(ticket.isEmpty())
		{
			throw new NoBookedTicketsException();
		}
		else
		{
			for(Ticket t1 :ticket)
			{
				if(t1.getTicketNo()==ticketNumber)
				{
					t1.setBoardingPoint(newBoarding);
					System.out.println("Boarding Point Changed Successfully..");
					isFound = true;
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidTicketNumberException();
		}
	}
	
	public void changeDestinationPoint(int ticketNumber,String newDestination)
	{
		boolean isFound = false;
		if(ticket.isEmpty())
		{
			throw new NoBookedTicketsException();
		}
		else
		{
			for(Ticket t1 :ticket)
			{
				if(t1.getTicketNo()==ticketNumber)
				{
					t1.setDestinationPoint(newDestination);
					System.out.println("Desination Point Changed Successfully..");
					isFound = true;
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidTicketNumberException();
		}
	}
	
	public void changeJourneyDate(int ticketNumber,String newJourneyDate)
	{
		boolean isFound = false;
		if(ticket.isEmpty())
		{
			throw new NoBookedTicketsException();
		}
		else
		{
			for(Ticket t1 :ticket)
			{
				if(t1.getTicketNo()==ticketNumber)
				{
					t1.setDate(newJourneyDate);
					System.out.println("Journey Date Changed Successfully..");
					isFound = true;
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidTicketNumberException();
		}
	}
	 
	public void cancelTicket(int ticketNumber)
	{
		boolean isFound = false;
		ListIterator<Ticket> l = ticket.listIterator();
		if(ticket.isEmpty())
		{
			throw new NoBookedTicketsException();
		}
		else
		{
			while(l.hasNext())
			{
				Ticket t = l.next();
				if(t.getTicketNo()==ticketNumber)
				{
					l.remove();
					System.out.println("Ticket Cancelled Successfully..");
					isFound = true;
				}
				
			}
		}
		if(isFound==false)
		{
			throw new InvalidTicketNumberException();
		}	
	}
	public void journeyDetails(int ticketNumber)
	{
		boolean isFound = false;
		if(ticket.isEmpty())
		{
			throw new NoBookedTicketsException();
		}
		else
		{
			for(Ticket t1 :ticket)
			{
				if(t1.getTicketNo()==ticketNumber)
				{
					t1.ticketDetails();
					isFound = true;
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidTicketNumberException();
		}	
	}
}
