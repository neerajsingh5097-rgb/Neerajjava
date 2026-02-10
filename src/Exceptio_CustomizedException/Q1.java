package Exceptio_CustomizedException;

//without handdle error

/*

public class Q1 {
	
	static int totalTickets = 100;
	
	public static void ticketBooking(int ticketsReq) {
		if (ticketsReq <= totalTickets) {
			System.out.println("Your bokking has been succesfull complete....");
		} else {

			throw new IllegalArgumentException("You have enter " + ticketsReq + " tickets req but we have only " + totalTickets);
		}
	}
	public static void main(String[] args) {

		ticketBooking(120);
		
		System.out.println("hello Radha ji")
		
		
	}

}
*/

//with handdle error

/*
class TicketReqNotSupportedException extends Exception {

	public TicketReqNotSupportedException(String msg) {
		super(msg);
	}
}

public class Q1 {
	
	static int totalTickets = 100;
	
	public static void ticketBooking(int ticketsReq) {
		if (ticketsReq <= totalTickets) {
			System.out.println("Your bokking has been succesfull complete....");
		} else {

			try {
			throw new TicketReqNotSupportedException("You have enter " + ticketsReq + " tickets req but we have only " + totalTickets);
			}catch(TicketReqNotSupportedException e) {
				e.printStackTrace();
			}
		}
			
	}
	public static void main(String[] args) {

		ticketBooking(130);
		
		System.out.println("hello Radha ji");
		
		
	}

}
*/



/*
class TicketReqNotSupportedException extends Exception {

	public TicketReqNotSupportedException(String msg) {
		super(msg);
	}
}

public class Q1 {
	
	static int totalTickets = 100;
	
	public static void ticketBooking(int ticketsReq) throws TicketReqNotSupportedException {
		if (ticketsReq <= totalTickets) {
			System.out.println("Your bokking has been succesfull complete....");
		} else {

			try {
			throw new TicketReqNotSupportedException("You have enter " + ticketsReq + " tickets req but we have only " + totalTickets);
			}catch(TicketReqNotSupportedException e) {
				e.printStackTrace();
			}
		}
			
	}
	public static void main(String[] args) {

		try {
		ticketBooking(130);
		}catch(TicketReqNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("hello Radha ji");
		
		
	}

}

*/

class TicketReqNotSupportedException extends Exception {

	public TicketReqNotSupportedException(String msg) {
		super(msg);
	}
}

public class Q1 {
	
	static int totalTickets = 100;
	
	public static void ticketBooking(int ticketsReq) throws TicketReqNotSupportedException {
		if (ticketsReq <= totalTickets) {
			System.out.println("Your bokking has been succesfull complete....");
		} else {

			try {
			throw new TicketReqNotSupportedException("You have enter " + ticketsReq + " tickets req but we have only " + totalTickets);
			}catch(TicketReqNotSupportedException e) {
				e.printStackTrace();
			}
		}
			
	}
	public static void main(String[] args)throws TicketReqNotSupportedException {

		
		ticketBooking(130);
		
		
		System.out.println("hello Radha ji");
		
		
	}

}
