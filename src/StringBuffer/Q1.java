package StringBuffer;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Radha ");
		String s2 = new String("Radha ");
		
		s1.concat("Rani");  // is string me sb1 string ko joda nhi he bulki ak new jagah store kr diya he
		System.out.println(s1); // isne same s1 print kr diya he 
		System.out.println(s1.equals(s2)); // isme yah ak dusare ko overrilod kr deta he 
		
		StringBuffer sb1 = new StringBuffer("Welcome ");
		StringBuffer sb2 = new StringBuffer("Welcome ");

	
		
		System.out.println(sb1.equals(sb2));
		
		sb1.append("Rani");
		System.out.println(sb1);
	}

}
