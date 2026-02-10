package Nasted_Class;
class Outer3{
	 String name =" Guest"; // point number 4 they can define non static members
	static int id =222;   // point number 4 they can define  static members
	
	public  static void m1() {
		
//	System.out.println(name); // upr se static hatana padega qki static only static variablr ko leta he 
	System.out.println(id);  // point number 3; they only have access to static memebers in the enclosing class
	}
	
	 public  class Inner1{  // inner claas isliye he ak outer class ke bhitar he 
		String name2 ="Radha ";
		static int id2 = 121;
		
		public  void fuc() {
		System.out.println(name);	// ab inner class static nhi he isliye usne static non static dono variable acces kr liye
		System.out.println(name2);
		System.out.println(id);	
		System.out.println(id2);	
		}
		
		
	}
}

public class NonStaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(Outer.id);
		Outer3 Out = new Outer3();
		Out.m1();
		
		Outer3.Inner1 inner = Out.new Inner1();
		inner.fuc();
	}

}
