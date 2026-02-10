package String;

import java.util.Scanner;

//print this pattern using String in java
//      N
//      NE            row = 5, string length = 5
//      NEE
//      NEER
//      NEERA
//      NEERAJ
public class Q7 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String ");
//		
//		String str = sc.nextLine();
		
		String str ="NEERAJ";
		
//		loop row ke liye r = 5= length
		for(int i=1;i<=str.length();i++) {
//			loop for col ke liye charecter ke liye
			for(int j=0;j<i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
//		2nd method 
		for(int i=1;i<=str.length();i++) {
			System.out.println(str.substring(0,i));
		}
	}

}
