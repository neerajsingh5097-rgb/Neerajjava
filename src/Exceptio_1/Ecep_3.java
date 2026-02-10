package Exceptio_1;



public class Ecep_3 {
	
//	isme ham Exception handling krege

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str =null;
		int arr[]= {1,2};
		try {
		System.out.println("Hello...................1");
		System.out.println("Hello...................2");
		System.out.println(100/0);
		System.out.println(str.length());
		System.out.println(arr[5]);
		
		System.out.println("Hello...................3");
		System.out.println("Hello...................4");

		}catch(ArithmeticException kuchbhi) {
			kuchbhi.printStackTrace();
			System.out.println("Ari");
		}catch(NullPointerException nana) {
			nana.printStackTrace();
			System.out.println("Ar23");

		}catch(ArrayIndexOutOfBoundsException rama ) {
			rama.printStackTrace();
			System.out.println("Ar234");

		}
		
		System.out.println("Radha rani");
		System.out.println("Krishna ki jay");
	}

}
