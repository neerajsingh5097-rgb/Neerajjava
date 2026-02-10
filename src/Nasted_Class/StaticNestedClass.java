package Nasted_Class;

class Outer1{
	 String name =" Guest"; // point number 4 they can define non static members
	static int id =222;   // point number 4 they can define  static members
	
	public static void m1() {
		
//	System.out.println(name); upr se static hatana padega qki static only static variablr ko leta he 
	System.out.println(id);  // point number 3; they only have access to static memebers in the enclosing class
	}
}
public class StaticNestedClass {

	public static void main(String[] args) {
//		System.out.println(Outer1.id);  \\ ise static variBLE ko direct asseces kr skte he
		Outer1 O = new Outer1();
		O.m1();
	}

}
