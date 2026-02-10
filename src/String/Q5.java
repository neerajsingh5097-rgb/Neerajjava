package String;

import java.util.Scanner;

//count total number of word from the given string
public class Q5 {

	public static void main(String[] args) {


//		String str = "Radha Rani ki Jay HO nayhe toye";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("write a string");
		String str=sc.nextLine();
		
		System.out.println(str);
		int count= 1;
		
//		loop for total length ke liye
		for(int i=0;i<str.length();i++) {
//			condition check krne ke liye jine space hoge usse ak jada word hoga 
			char ch =str.charAt(i);
			if (ch==' ') {
				count++;
			}
		}
		
		System.out.println("total number of word from string " + count);
	}

}
