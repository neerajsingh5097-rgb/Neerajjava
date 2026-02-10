
package String;

import java.util.Scanner;

//cout total number of capital letter from the given string?

public class Q4 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String str=sc.nextLine();
		
//		String str = "Radha Rani ki Jay HO";
		
		System.out.println(str);
		int count= 0;
		
//		loop for total length ke liye
		for(int i=0;i<str.length();i++) {
//			condition check krne ke liye ki capital latter he ki nhi 
			char ch =str.charAt(i);
			if (ch>='A' && ch<='Z') {
				count++;
			}
		}
		
		System.out.println("total number of capital  letter from string " + count);
	}

}
