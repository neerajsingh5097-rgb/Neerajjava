package StringBuilder;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();

//		String str = "BLUEJ";
		
		for(int i=1;i<str.length();i++) {
			System.out.println(str.substring(0,i));
		}
		
		for(int i=1;i<=str.length();i++) {
			for(int j=0;j<i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
//		for(int i=str.length();i>=1;i--) {
//			System.out.println(str.substring(0,i));
//		}
		
//		for(int i=str.length();i>=0;i--) {
//			System.out.println(str.substring(i,str.length()));
//		}
	}

}
