package Synchronized;

//Synchronized block

class Domain1{
	int total_seats = 100;
	
       public void seatBooking(int req) {
		 
		 synchronized (this) {
				if(req <= total_seats ) {
					System.out.println(req + " Booking successful.........");
					total_seats = total_seats - req;
					 System.out.println("Now we have only : "  + total_seats);
				}else {
					System.out.println(req + " HouseFull we have only " + total_seats);
				}
		}
	
	}
	
}

public class SeatBooking1 extends Thread {
	static Domain1 ob;
	int req;
	
	public void run() {
		ob.seatBooking(req);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ob = new Domain1();
		
		SeatBooking1 t1= new SeatBooking1();
		SeatBooking1 t2= new SeatBooking1();
		SeatBooking1 t3= new SeatBooking1();

		t1.req = 90;
		t1.start();
		t2.req = 50;
		t2.start();
		t3.req = 10;
		t3.start();

	}

}
