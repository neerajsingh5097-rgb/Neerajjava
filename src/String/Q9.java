package String;

public class Q9 {
	
//	prin this pattern usin String in java
//	NEERAJ
//	EERAj          r=5 = length=5
//	ERAJ           j=i to length-1 tak
//	RAJ
//	AJ
//	J

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Neeraj";
		
		
//		loop row ke liye r = 5= length
		for(int i=0;i<str.length();i++) {
//			loop for col ke liye charecter ke liye
			for(int j=i;j<str.length();j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
//		2nd method
		for(int i=0;i<str.length();i++) {
			System.out.println(str.substring(i, str.length()));
		}
	}

}
