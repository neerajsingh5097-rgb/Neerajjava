package Nasted_Class;

class Outer{
	 String name =" Guest"; // point number 4 they can define non static members
	static int id =222;   // point number 4 they can define  static members
	
	public  static void m1() {
		
//	System.out.println(name); // upr se static hatana padega qki static only static variablr ko leta he 
	System.out.println(id);  // point number 3; they only have access to static memebers in the enclosing class
	}
	
	 public static class Inner{  // inner claas isliye he ak outer class ke bhitar he 
		String name2 ="Radha ";
		static int id2 = 121;
		
		public  void fuc() {
//		System.out.println(name);	// yah static nhi he isliye ye asseces nhi ho rha he
		System.out.println(name2);
		System.out.println(id);	
		System.out.println(id2);	
		}
		
		
	}
}

public class InnerClasses {

	public static void main(String[] args) {

//		System.out.println(Outer.id);
		Outer O = new Outer();
		O.m1();
		
		Outer.Inner in = new Outer.Inner();
		in.fuc();
	}

}
