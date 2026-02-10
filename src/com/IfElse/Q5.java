package com.IfElse;

import java.util.Scanner;

// Write a java program to input a cost of a pen and calculate 70 pens cost with some discount.
// if total pen cost greater than 1000 then we calculate 20% discount otherwise  10%

public class Q5 {

	public static void main(String[] args) {
		System.out.println("Enter the price of pen:-");
		Scanner sc = new Scanner(System.in);
		
		int price= sc.nextInt();
		
		price = price * 70;
		
		if (price > 1000) {
			System.out.println("Discount:- " + (price * 20) /100);
		} else {
			System.out.println("Discount:- " + (price * 10) /100);
		}

	}

}
