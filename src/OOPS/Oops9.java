package OOPS;

//Override

class Car1{
	private String name;
	
	public Car1(String name) {
		this.name = name;
		System.out.println("Car.Car() ");
	}
	
	public void turnOnEngine() {
		System.out.println(name + " turnOnEngine");
	}
	
	public void turnOffEngine() {
		System.out.println(name + " turnOffEngine");
	}
	
	public void run() {
		System.out.println( "run()");
		
	}
	public void device() {
		System.out.println("device ");
	}
}

class Swift1 extends Car1{
	private String color;
	
	public Swift1(String name, String color) {
		super(name);
		this.color= color;
		System.out.println("Swift.Swift()");
	}
	
	@Override
	public void device() {
	  System.out.println("We have FM Radio and Bluetooth connectivity");
	  System.out.println("==============================================");
	}
	@Override
	public void run() {
		System.out.println( "run() + with fast");
		
		
	}
}

public class Oops9 {

	public static void main(String[] args) {
       Car1 c1 = new Car1("MyCar");
       c1.turnOnEngine();
       c1.turnOffEngine();
       c1.run();
       c1.device();
       
       System.out.println("------------------------------------------------");
       
       Swift1 s1 =new Swift1("SwiftCAr" , "Black");
    		   s1.turnOnEngine();
       s1.turnOffEngine();
       s1.run();
       s1.device();
	}

}
