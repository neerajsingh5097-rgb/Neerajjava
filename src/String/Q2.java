package String;

//count total number of vowels from the given string
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Radha rani ki jay";
		
		System.out.println(str);
           int count=0;
		
	     	for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if (ch=='a' || ch=='A' || ch=='i'||ch=='I' || ch=='e' || ch=='E'||ch=='O' || ch=='o' || ch=='i') {
				count++;
			}
		}
	     	
	     	System.out.println("total vowel in string " + count);
	}

}
