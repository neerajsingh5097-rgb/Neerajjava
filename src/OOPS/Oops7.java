package OOPS;

//polymorphism

//method overloading

class Calculations {
	public void sum() {
		System.out.println("null value");
	}
	
	public void sum(int i) {
		System.out.println("int value" + i);
	}
	
	public void sum(int i, int j) {
		System.out.println("int i , int j value " + (i+ j));
	}
	
	public void sum(int i ,double j) {
		System.out.println("int i , double j value " + (i +j));
	}
	
	public void sum(int i , double j , int k) {
		System.out.println("int i , double j , int k " +(i + j + k));
	}
	
	public void sum(double i , int j) {
		System.out.println("double i , int j value " + (i +j));
	}
}

public class Oops7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Calculations calObj = new Calculations();
		calObj.sum();
		calObj.sum(10);
		calObj.sum(10,10);
		calObj.sum(10,10.5);
		calObj.sum(10 ,10.5,10);
		calObj.sum(10.5,10);
	}

}
