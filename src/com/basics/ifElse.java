package com.basics;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		System.out.println("Enter the any number:-");
		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
		
		/*if (100 >= n && n >= 90) {
			System.out.println("A+ Grad");
		}else if (89 >= n && n>= 70) {
			System.out.println("B+ Grad");
		}else if (69 >= n && n >= 60) {
			System.out.println("First Grade");
		}else if (59 >= n && n>= 33) {
			System.out.println("Second");
		}else if (32 >= n && n >= 0) {
			System.out.println("Fail");
		}else {
			System.out.println("Invalid number");
		} */
		
//		char ch = sc.next().charAt(0);
//		
//		if (ch == 'A') {
//			System.out.println("A ia the vowel");
//		}else {
//			System.out.println("Invailid Charecter");
//		
//		}
		
//		if (100 >=n) {
//			if (90 <=n) {
//				System.out.println("Grade A+");
//			}else if (89>=n) {
//				System.out.println("Grade b+");
//			}else if (70>=n) {
//				System.out.println("first");
//			}else {
//				System.out.println("fail"
//						+ "");
//			}
//		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= sc.nextInt();
		
		
		if (a>b) {
			System.out.println(a + "is the grater");
		} else if (b>c) {
			System.out.println("b i sgrater");
		}else {
			System.out.println("c is grater");
		}

		
		
		
		
	}

}
