package com.basics;

import java.util.Scanner;

public class Q_8_10_AndOpretor {
	
//	Write a program Electicity bil calculator
//	u---> 1--100   2rs/ unit ---> 80 --> 80*2=160
//	u---> 101--200   5rs/ unit ---> 140 --> 100*2 + 40*5 = 400
//	u---> 201--300   7rs/ unit ---> 250 --> 100*2 + 100*5 +50*7 = 1050
//	u---> 301--400   10rs/ unit
//	u---> 401--500   12rs/ unit
//	u---> above500   15rs/ unit
//	If negative --> Print Invalid input
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the unit of eletric bill;-");
		int unit =sc.nextInt();
		int bill= 0;
		
		if(unit >= 1 && unit <=100) {
			 bill = unit*2;
//			System.out.println(bill);
		}else if (unit >= 101 && unit <=200) {
			 bill = 100*2 + (unit-100)*5;
//			System.out.println(bill);
		}else if (unit >= 201 && unit <= 300) {
			bill =  100*2 + 100*5 + (unit-200)*7;
//			System.out.println(bill);
		}else if (unit >= 301 && unit <= 400) {
			bill = 100*2 + 100*5 + 100*7+ (unit-300)*10;
//			System.out.println(bill);
		}else if (unit >= 401 && unit <=500) {
			 bill =  100*2 + 100*5 + 100*7 + 100*10+ (unit-400)*12;
//			System.out.println(bill);
		}else if (unit >= 501 && unit <=600) {
			 bill =  100*2 + 100*5 + 100*7 + 100*10+ 100*12 + (unit-500)*15;
//			System.out.println(bill);
		}else {
			System.out.println("Invalid input:-");
		}
		
		System.out.println("Tatal bill " + bill);
	}

}
