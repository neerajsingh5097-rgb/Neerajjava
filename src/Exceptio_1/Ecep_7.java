package Exceptio_1;

public class Ecep_7 {
//	catch  statement 2nd method

	public static void main(String[] args) {

		/*
		String str =null;
		int arr[]= {1,2};
		try {
		System.out.println("Hello...................1");
		System.out.println("Hello...................2");
//		System.out.println(100/0);
		System.out.println(str.length());
//		System.out.println(arr[5]);
		
		System.out.println("Hello...................3");
		System.out.println("Hello...................4");

		}catch(ArithmeticException | NullPointerException |ArrayIndexOutOfBoundsException kuchbhi) {  
			System.out.println("parent Exceptio");
			if (kuchbhi instanceof ArithmeticException) {
				System.out.println("ArithmeticException-catch");
			} else if(kuchbhi instanceof NullPointerException) {
 
				System.out.println("NullPointerException-catch");
			} else if (kuchbhi instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("ArrayIndexOutOfBoundsException-catch");
			}else {
				System.out.println("Eception -catch");
				
			}
			
			kuchbhi.printStackTrace();
		}
		*/
		String str =null;
		int arr[]= {1,2};
		try {
		System.out.println("Hello...................1");
		System.out.println("Hello...................2");
//		System.out.println(100/0);
		System.out.println(str.length());
//		System.out.println(arr[5]);
		
		System.out.println("Hello...................3");
		System.out.println("Hello...................4");

		}catch(ArithmeticException | NullPointerException |ArrayIndexOutOfBoundsException kuchbhi) {  
			System.out.println("Me sab accept krta hu");
			
			
			kuchbhi.printStackTrace();
		}
		
	}

}
