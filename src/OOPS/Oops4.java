package OOPS;

//Encapsulation


class Encapsu{
	private String name , gender;
    private int age , salary;
    
    public void information(String name, String gender , int age, int salary) {
    	this.name = name;
    	this.gender = gender;
    	this.age = age;
    	this.salary =salary;
    }
    
    public void print() {
    	System.out.println(name);
    	System.out.println(gender);
    	System.out.println(age);
    	System.out.println(salary);
    }
    
    public void setterName(String name) {
    	this.name = name;
    }
    
    public int GetAge() {
    	return age;
    }
}



public class Oops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Encapsu e1 = new Encapsu();
      e1.information("Radha", "female", 18, 100000);
      e1.print();
      
      System.out.println("Setter.....................................");
      e1.setterName("Radha Rani");
      e1.print();
      
      System.out.println("Getter........................................");
      int eligibale =e1.GetAge();
      System.out.println(eligibale);
      
	}

}



