package com.IfElse;

import java.util.Scanner;

// Write a program to take two number from user and check who is Max

public class Q2 {

	public static void main(String[] args) {
		System.out.println("Enter two number are:-");
	
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int  b = sc.nextInt();
    
    if (a > b) {
		System.out.println("A is the max");
	} else {
		System.out.println("B is the max");
	}
 }

}
