package StringBuffer;

import java.util.Scanner;

//isme StringBuffer ke method use krne he 
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Radha Rani");
		StringBuffer sb1 = new StringBuffer("Radha Rani");
		StringBuffer sb2 = new StringBuffer("Radha Rani");
		StringBuffer sb3 = new StringBuffer("Radha Rani");
		StringBuffer sb4 = new StringBuffer("Radha Rani");
		StringBuffer sb5 = new StringBuffer("Radha Rani");
		StringBuffer sb6 = new StringBuffer("Radha Rani");
//		 reverse krne ke liye
		sb.reverse();
		System.out.println(sb);
		
//		replace krne ke liye ke 
		sb1.replace(0, 5, "Krishna");
		System.out.println(sb1);
		
//		koi charecter delete krne ke liye
		sb2.deleteCharAt(0);
		System.out.println(sb2);
		
		
//		koi first index se last index tak delete krna he 
		sb3.delete(0, 5);
		System.out.println(sb3);
		
//		length prin krne ke liye 
		System.out.println(sb4.length());

		
		sb5.capacity();
		System.out.println(sb5);
		
//		phli string me koi new kayword add krna he
		
		sb6.append("Shree");
		System.out.println(sb6);
		
		
	

	}

}
