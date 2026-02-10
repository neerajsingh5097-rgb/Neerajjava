package OOPS;

/*
// 1 st
 
// non paramererized constructor
class Radha {
	
	public Radha() {    // non peremeterized constructor
	
		System.out.println("hello");
	}
   
}
public class Oops2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Radha s1 = new Radha();

	}

}
*/

// parameterized constructor 2nd

/*
class Radha {
	private String name, gender;
	private int age, salary;
	public Radha(String name , String gender , int age , int salary) { // ye rha jo hmne value din he brecate me 
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}
	
	public void print () {
		System.out.println("hello");
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(salary);
	}
	
	
}
public class Oops2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Radha s1 = new Radha("Neeraj singh" , "male" , 22, 100);
	s1.print();
	 
	}

}

*/

//note extra me diya he copy me

/*

class Radha {
	private String name, gender;
	private int age, salary;
	public Radha(String name , String gender , int age , int salary) { // ye rha jo hmne value din he brecate me 
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}
	
	public void print () {
		System.out.println("hello");
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(salary);
	}
	
	public void sett(String name) {  // age bhi or salary bhi update kr skte he 
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
}
public class Oops2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Radha s1 = new Radha("Neeraj singh" , "male" , 22, 100);
	s1.print();
	s1.sett("Neeraj singh kuberpur"); // isi prakar age salary bhi update kr skt he 
	s1.print();
	
	int sal = s1.getSalary();
	System.out.println(sal);
     
	}

}

*/


//
//class Radha {
//	private String name, gender;
//	private int age, salary;
//	public Radha(String name , String gender , int age , int salary) { // ye rha jo hmne value din he brecate me 
//		this.name = name;
//		this.gender = gender;
//		this.age = age;
//		this.salary = salary;
//	}
//	
//	public void print () {
//		System.out.println("hello");
//		System.out.println(name);
//		System.out.println(gender);
//		System.out.println(age);
//		System.out.println(salary);
//	}
//	
//	public void sett(String name) {  // age bhi or salary bhi update kr skte he 
//		this.name = name;
//	}
//	
//	public int getSalary() { // use of getter ye value ko return krke deta he main ko 
//		return salary;
//	}
//}
//public class Oops2 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	Radha s1 = new Radha("Neeraj singh" , "male" , 22, 5000);
//	s1.print();
//	s1.sett("Neeraj singh kuberpur"); // isi prakar age salary bhi update kr skt he 
//	s1.print();
//	
//	int sal = s1.getSalary();
//	if (sal>500) {
//		double bonus  = sal*.20;
//		System.out.println(bonus);
//	}
//	
//     ++++++++++++++++++++++++.........
//	}
//
//}

class radha {
	private String name , gender;
	private int age , salary;
	
	 radha (String name) {
		System.out.println(name);
	}
	
	public String getName() {
		return name;
	}
}

public class Oops2 {
	public static void main(String[] args) {
		radha s1 = new radha("Neeraj");
		System.out.println(s1.getName());
	}
}

