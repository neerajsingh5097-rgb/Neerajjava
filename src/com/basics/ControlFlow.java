package com.basics;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter any number:-");

		
		
//		if (n > 0) {
//			System.out.println("hello...1");
//			System.out.println("hello...2");
//			System.out.println("hello....3");
//			System.out.println("hello...4");
//			System.out.println("hello.....5");
//		}else {
//			System.out.println("hello.....6");
//			System.out.println("hello.....7");
//			System.out.println("hello,,,,,,8");
//			System.out.println("hello.....9");
//
//		}
//		
	
		int n= sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
