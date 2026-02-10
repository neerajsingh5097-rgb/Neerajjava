package Synchronized;

//Synchronized mathod

class Domain{
	int total_seats = 100;
	
	synchronized void seatBooking(int req) {
		if(req <= total_seats ) {
			System.out.println(req + " Booking successful.........");
			total_seats = total_seats - req;
			 System.out.println("Now we have only : "  + total_seats);
		}else {
			System.out.println(req + " HouseFull we have only " + total_seats);
		}
	}
	
}

public class SeatBooking extends Thread {
	
	static Domain ob ;
	int req;
	
	public void run() {
		ob.seatBooking(req);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ob = new Domain();
		
		SeatBooking t1= new SeatBooking();
		SeatBooking t2= new SeatBooking();
		SeatBooking t3= new SeatBooking();

		t1.req = 90;
		t1.start();
		t2.req = 50;
		t2.start();
		t3.req = 10;
		t3.start();
	}

}
