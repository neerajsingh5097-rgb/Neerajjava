package String;
//count total number of small letter from the given string?
public class Q3 {

	public static void main(String[] args) {

		String str = "Radha Rani ki Jay HO";
		
		System.out.println(str);
		int count= 0;
		
//		loop for total length ke liye
		for(int i=0;i<str.length();i++) {
//			condition check krne ke liye ki smal latter he ki nhi 
			char ch =str.charAt(i);
			if (ch>='a' && ch<='z') {
				count++;
			}
		}
		
		System.out.println("total number of small letter from string " + count);
	}

}
