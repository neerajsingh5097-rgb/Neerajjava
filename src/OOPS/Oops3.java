package OOPS;

//inheritance
// single inheritance 
/*
class A{
	public void print() {
		System.out.println("radha 1");
		System.out.println("radha 2");
		System.out.println("radha 3");
		System.out.println("radha 4");
		System.out.println("radha 5");
	}
}

class B extends A {
	
	public void prints() {
		System.out.println("radha 6");
		System.out.println("radha 7");
		System.out.println("radha 8");
		System.out.println("radha 9");
		System.out.println("radha 10");	
	}
	
}

public class Oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A p1 = new A();
        p1.print();
        System.out.println(".............................................");
        B p2 = new B();
        p2.print();
        p2.prints();
	}

}
*/

//multiple inheritence

/*
class A{
	public void print() {
		System.out.println("radha 1");
		System.out.println("radha 2");
		System.out.println("radha 3");
		System.out.println("radha 4");
		System.out.println("radha 5");
	}
}

class B extends A {
	
	public void prints() {
		System.out.println("radha 6");
		System.out.println("radha 7");
		System.out.println("radha 8");
		System.out.println("radha 9");
		System.out.println("radha 10");	
	}
	
}

class C extends B  {
	public void printExtra() {
		System.out.println("radha 11");
		System.out.println("radha 12");
		System.out.println("radha 13");
		System.out.println("radha 14");
	}
}

public class Oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A p1 = new A();
        p1.print();
        System.out.println(".............................................");
        B p2 = new B();
        p2.print();
        p2.prints();
        System.out.println("***********************************************");
        C p3 = new C();
        	p3.print();
        	p3.prints();
        	p3.printExtra();
        
	}

}
*/

class A{
	public void print() {
		System.out.println("radha 1");
		System.out.println("radha 2");
		System.out.println("radha 3");
		System.out.println("radha 4");
		System.out.println("radha 5");
	}
}

class B extends A {
	
	public void prints() {
		System.out.println("radha 6");
		System.out.println("radha 7");
		System.out.println("radha 8");
		System.out.println("radha 9");
		System.out.println("radha 10");	
	}
	
}

class C extends A {
	public void printExtra() {
		System.out.println("radha 11");
		System.out.println("radha 12");
		System.out.println("radha 13");
		System.out.println("radha 14");
	}
}

public class Oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A p1 = new A();
        p1.print();
        System.out.println(".............................................");
        B p2 = new B();
        p2.print();
        p2.prints();
        System.out.println("***********************************************");
        C p3 = new C();
        	p3.print();
        	
        	p3.printExtra();
        
	}

}
