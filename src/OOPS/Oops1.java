package OOPS;


/*
class Person{                      // 1st
    String name , gender;
	  int age , salary;

	  
	public void print() {
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(salary);
	}
	
}

public class Oops1  {

	public static void main(String[] args) {
	Person neeraj = new Person();
		neeraj.name = "Neeraj Singh";
		neeraj.gender= "Male";
		neeraj.age = 22;
		neeraj.salary = 2583699;
				
		neeraj.print();
     
	}

}

*/


//  2nd program

/*

class Person{                      // 2nd
    String name , gender;
	  int age , salary;
	  public void print() {
			System.out.println(name);
			System.out.println(gender);
			System.out.println(age);
			System.out.println(salary);
		}
}

public class Oops1 {
	public static void main(String[] args) {
		Person neeraj = new Person();
		neeraj.name = "Neeraj Singh";
		neeraj.gender= "Male";
		neeraj.age = 22;
		neeraj.salary = 2583699;
		
		neeraj.print();
		
		Person radha = new Person();
		radha.name = "Radha Kishori";
		radha.gender= "Female";
		radha.age = 15;
		radha.salary = 100000;
		
		radha.print();
	}
}

*/

// 3rd program

/*

class Person{                      // 2nd
    
	  public void print(String name ,String gender, int age ,int salary) {
			System.out.println(name);
			System.out.println(gender);
			System.out.println(age);
			System.out.println(salary);
		}
}
//       upr bale short me program he same he
public class Oops1 {
	public static void main(String[] args) {
		Person neeraj = new Person();
	
		neeraj.print("Neeraj Singh" , "Male" , 22 , 100);
		
		Person radha = new Person();
		
		radha.print("Radha KIshori", "Female" , 15 , 100000);
	}
}
*/

//4th program

//  private key word ka use krna sikho

class Person{  

 private String name, gender;
 private int age, salary;
 
 public Person() {
	 System.out.println("Radha rani");
 }
 
  public void setter(String name ,String gender, int age ,int salary) {
	 this.name= name;
	 this.gender= gender;
	 this.age = age;
	 this.salary = salary;
  }
   public void print() {
			System.out.println(name);
			System.out.println(gender);
			System.out.println(age);
			System.out.println(salary);
		}
}

public class Oops1{
	public static void main(String[] args) {
		Person neeraj =  new Person();
		neeraj.setter("Neeraj Singh" , "Male", 22, 100);
		neeraj.print();
		
		Person radha =  new Person();
		radha.setter("Radha Rani", "Female", 15, 1000000);
		radha.print();
	}
}

