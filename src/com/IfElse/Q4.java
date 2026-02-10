package com.IfElse;

import java.util.Scanner;

// Write a program for checking enter number is positive or Negative

public class Q4 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number:-");
	
	int num = sc.nextInt();
	
	if (num >= 0) {
		System.out.println("Number is positive");
	} else {
		System.out.println("Number is Negative");
	}
 }
}
