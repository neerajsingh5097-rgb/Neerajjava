package Exceptio_1;

import java.util.Scanner;

public class Ecep_6 {
	
//	catch statemnt mathod 1st

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		System.err.println("enter the number");
//		int n=sc.nextInt();
		String str =null;
		int arr[]= {1,2};
		try {
		System.out.println("Hello...................1");
		System.out.println("Hello...................2");
		System.out.println(100/0);
//		System.out.println(str.length());
//		System.out.println(arr[5]);
		
		System.out.println("Hello...................3");
		System.out.println("Hello...................4");

		}catch(Exception kuchbhi) {  // yah all types ki error ko handle kr skta he
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
		
//		finally {
//			System.out.println("finally");
//			sc.close();
//		}
		
		System.out.println("Radha rani");
		System.out.println("Krishna ki jay");
	}

}
