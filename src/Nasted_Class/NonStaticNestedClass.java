package Nasted_Class;
class Outer2{
	 String name =" Guest"; // point number 4 they can define non static members
	static int id =222;   // point number 4 they can define  static members
	
	public  void m1() {
		
	System.out.println(name); // upr se static hatana padega qki static only static variablr ko leta he 
	System.out.println(id);  // point number 3; they only have access to static memebers in the enclosing class
	}
}
public class NonStaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Outer.id);  // ise static variBLE ko direct asseces kr skte he
		Outer2 O = new Outer2();
		O.m1();
	}

}
