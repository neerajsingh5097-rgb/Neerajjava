package Exceptio_1;

import java.util.Scanner;

//using of close 

public class Ecep_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		System.err.println("enter the number");
		int n=sc.nextInt();
		String str =null;
		int arr[]= {1,2};
		try {
		System.out.println("Hello...................1");
		System.out.println("Hello...................2");
		System.out.println(n/0);
//		System.out.println(str.length());
		System.out.println(arr[5]);
		
		System.out.println("Hello...................3");
		System.out.println("Hello...................4");

		}catch(Exception kuchbhi) {  // yah all types ki error ko handle kr skta he
			System.out.println("parent Exceptio");
			kuchbhi.printStackTrace();
		}finally {
			System.out.println("finally");
			sc.close();
		}
		
		System.out.println("Radha rani");
		System.out.println("Krishna ki jay");
	}

}
