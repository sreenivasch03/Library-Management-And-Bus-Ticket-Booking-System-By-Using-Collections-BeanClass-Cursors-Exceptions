package setterandgetter;

import java.util.Random;

public class Ticket 
{
	private int ticketNo;
	private int seatNo;
	private String destinationPoint;
	private String boardingPoint;
	private String date;
	
	public Ticket() 
	{
		
	}

	public Ticket(String destinationPoint, String boardingPoint, String date) 
	{
		this.destinationPoint = destinationPoint;
		this.boardingPoint = boardingPoint;
		this.date = date;
	}
	
	Random random = new Random();
	int randomTicketNumber = random.nextInt(Integer.MAX_VALUE);
	
	int randomSeatNo = random.nextInt(100)+1;
	
	public int getTicketNo() {
		return randomTicketNumber;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public int getSeatNo() {
		return randomSeatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void ticketDetails()
	{
		System.out.println("* Ticket Number :"+getTicketNo());
		System.out.println("* Seat No :"+getSeatNo());
		System.out.println("* Destination Point :"+getDestinationPoint());
		System.out.println("* Boarding Point :"+getBoardingPoint());
		System.out.println("* Date    :"+getDate());
	}
}
