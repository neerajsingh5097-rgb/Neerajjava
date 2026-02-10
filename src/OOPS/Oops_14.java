package OOPS;

//Association


class Kar{
	String name;
	final Engine engine;
	Driver driver;
	
	public Kar() {
		engine = new Engine(444, 1212);
		System.out.println("caar1");
	}

	@Override
	public String toString() {
		return "Kar [name=" + name + ", engine=" + engine + ", driver=" + driver + "]";
	}
	
	
}

class Engine{
	int hp,torqe;
	
	public Engine(int hp, int torqe) {
		super();
		this.hp = hp;
		this.torqe = torqe;
		System.out.println("engine he ");
	}



	@Override
	public String toString() {
		return "Engine [hp=" + hp + ", torqe=" + torqe + "]";
	}
	
	
}

class Driver{
	String name,address;

	public Driver(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("Driver he");
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", address=" + address + "]";
	}
	
	
}
public class Oops_14 {

	public static void main(String[] args) {
		
		Driver ansh = new Driver("Ansh","Agra");

		Kar k1 = new Kar();
		
		System.out.println(k1);
		
		k1.driver = ansh;
		k1.name = "Car";
		System.out.println(k1);
	}

}
