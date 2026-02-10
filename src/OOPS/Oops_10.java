package OOPS;

//final variable
class X{
	final double pi=3.14;
	public void print() {
//		pi=3; aisa kiya to error dega becouse pi final element he
		System.out.println(pi);
	}
  
}
public class Oops_10 {

	public static void main(String[] args) {
		// T0ODO Auto-generated method stub
   
		X x= new X();
		System.out.println();
		x.print();
	}

}


/*

class X{
	final double pi;
	
	public X(double pi) {
		this.pi = pi;
	}
}
public class Oops_10 {

	public static void main(String[] args) {
		// T0ODO Auto-generated method stub
 
		X x= new X(3.14);
		System.out.println(x.pi);
	}

}

*/
