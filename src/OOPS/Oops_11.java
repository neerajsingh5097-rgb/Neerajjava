package OOPS;

//Upcasting & Downcasting
/*
class X1{
	public void print() {
		// TODO Auto-generated method stub
      System.out.println("hello");
	}
}

class Y1 extends X1{
	
}
public class Oops_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		X1 x =new Y1();
		Y1 y = (Y1)x;
		x.print();
	}

}
*/
//downcasting
class X1{
	public void print() {
		// TODO Auto-generated method stub
      System.out.println("hello");
	}
}

class Y1 extends X1{
	
}
public class Oops_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		X1 x =new Y1();
		Y1 y = (Y1)x;
		x.print();
	}

}
