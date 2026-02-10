package com.IfElse;

import java.util.Scanner;

// Write a program for checking enter number is even or odd

public class Q1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number:-");
	int n= sc.nextInt();
	
	if (n % 2 == 0) {
		System.out.println("Number is Even");
	} else {
      System.out.println("Number is Odd");
	}
}
}
