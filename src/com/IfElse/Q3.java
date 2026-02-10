package com.IfElse;

import java.util.Scanner;

// Write a program to take input age of person and check he is eligible for marriage or not
// jab person > 21 is eligible otherwise not

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person Age:-");
		
		int age  = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("Eligible for marriage");
		}else {
			System.out.println(" Not Eligible for marriage");
		}

	}

}
