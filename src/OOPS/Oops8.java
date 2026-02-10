package OOPS;

//polymorphism

//constructor overloading

/*
// 1st medhod
class Human{
	private String name , gender;
	private int age;
	
	public Human() {
		System.out.println("Human 1");
	}
	
	public Human(String name) {
		this.name=name;
		System.out.println("Human 2");
	}
	
	public Human(String name, String gender) {
		this.name = name;
		this.gender = gender;
		System.out.println("Human 3");
	}
	public Human(String name,String gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		System.out.println("Human 4");
	}
	
	public void print() {
		System.out.println("Name is " + name);
		System.out.println("Age is " +age);
		System.out.println("Gender is " + gender);
	}
}

public class Oops8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Human h1 = new Human("radha rani");
//		Human h1 = new Human("radha rani" , "female");
//		Human h1 = new Human("radha rani" , "female" , 18);

		h1.print();
	}

}

*/
//2nd medhod



class Human{
	private String name , gender;
	private int age;
	
	public Human() {
		System.out.println("Human 1");
	}
	
	public Human(String name) {
		this();
		this.name=name;
		System.out.println("Human 2");
	}
	
	public Human(String name, String gender) {
        this(name);
		this.gender = gender;
		System.out.println("Human 3");
	}
	public Human(String name,String gender,int age) {
		this(name,gender);
		this.age = age;
		System.out.println("Human 4");
	}
	
	public void print() {
		System.out.println("Name is " + name);
		System.out.println("Age is " +age);
		System.out.println("Gender is " + gender);
	}
}

public class Oops8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		Human h1 = new Human("radha rani");
//		Human h1 = new Human("radha rani" , "female");
		Human h1 = new Human("radha rani" , "female" , 18);

		h1.print();
	}

}


