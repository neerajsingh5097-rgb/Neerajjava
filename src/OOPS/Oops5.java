package OOPS;
/*

class Car{
	private String name;
	public Car(String name) {
		this.name =name;
		System.out.println("radha radha................");
	}
	
	public void turnOnEngine() {
		System.out.println(name + "turn on engine");
	}
	public void turnOffEngine() {
		System.out.println(name +"turn off engine");
	}
	
	public void run() {
		System.out.println("runfast");
	}
}

class Swift extends Car{
	public Swift(String name) {
		super(name);
		System.out.println("shyam...........................");
	}
}

public class Oops5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Car c1 = new Car("My car");
//    	  c1.turnOnEngine();
//    	  c1.turnOffEngine();
//    	  c1.run();
    	  
    	  System.out.println("****************************************************");
    	  Swift s1 = new Swift("radha ki car ");
    	  s1.turnOnEngine();
    	  s1.turnOffEngine();
    	  s1.run();
    	  
	}

}

*/
class Vahicle{
	private String name;
	
	public Vahicle(String name) {
		this.name = name;
	}
	
	public void fourWheel() {
		System.out.println(name+" 4 wheel");
	}
	
}

class Car extends Vahicle {

	public Car(String name) {
		super(name);
	}
}

class Suv extends Car{
	
	public Suv(String name) {
		super(name);
		System.out.println("Suv ki car");
	}
}

class Creta extends Suv{
	public Creta(String name) {
		super(name);
		System.out.println("creta is mast car");
	}
}

class Sedan extends Car{
	public Sedan(String name) {
		super(name);
		System.out.println("Sedan car hi he but car se achi he ");
	}
}

class Verna extends Sedan{
	public Verna(String name) {
		super(name);
		System.out.println("Verna sedan ki part he update he");
	}
}
 public class Oops5{
	 public static void main(String[] args) {
		Vahicle v1 = new Vahicle("My vahicle");
		v1.fourWheel();
		
		System.out.println("car..........................................");
		Car c1 = new Car("Radha rani ki car");
		c1.fourWheel();
		
		System.out.println("Suv...........................................");
		Suv s1=new Suv("Suv");
		s1.fourWheel();
		
		System.out.println("Creta...........................................");
		Creta c2 = new Creta("creta bali car");
		c2.fourWheel();
		System.out.println("Sedan.............................................");
		Sedan s3 = new Sedan("Sedan vali car");
		s3.fourWheel();
		
		System.out.println("Verna..............................................");
		Verna v2 = new Verna("Verna vali car");
		v2.fourWheel();	
	}
 }