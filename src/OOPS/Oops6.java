package OOPS;

/*
class Mycar extends Object{ // class Mycar{ aise bhi likho to koi problem nhi he 
	
}
public class Oops6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Mycar c1 = new Mycar();
		
		String s1 = c1.toString();
		System.out.println(s1);
		System.out.println(c1);
	}

}
*/

/*

class Parent{
	int a= 100;
}

class Child extends Parent{
	int a = 999;
	public void prints() {
		System.out.println(a);
	}
}

public class Oops6{
	public static void main(String[] args) {
		Child  c1 =new Child();
		c1.prints(); 
	}
}

*/

class Parent{
	int a= 100;
}

class Child extends Parent{
	int a = 999;
	public void prints() {
		int a= 545;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class Oops6{
	public static void main(String[] args) {
		Child  c1 =new Child();
		c1.prints(); 
	}
}