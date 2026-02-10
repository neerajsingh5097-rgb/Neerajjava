package com.IfElse;

// Write a program to a company decided to give bonus of 5% to employee if his/ her year of service is more
// than 5 years. Ask user for salary and year od service and print the net bonus amount

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year of employee:-");
		int year= sc.nextInt();
		
		System.out.println("Enter the salary for employee:-");
		int sal = sc.nextInt();
		
		if (year >= 5) {
			 int bonus = (sal * 5)/100;
			 System.out.println("Total amount with bonus " + (sal + bonus));
		} else {
			System.out.println("not eligible for bonus");

		}
		

	}

}
