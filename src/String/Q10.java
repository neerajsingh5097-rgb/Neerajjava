package String;

public class Q10 {
//	prin this pattern usin String in java
//	J
//	AJ          
//	RAJ          
//	ERAJ
//	EERAJ
//	NEERAJ

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Neeraj";
		
		
//		loop row ke liye r = 5= length
		for(int i=str.length()-1;i>=0;i--) {
//			loop for col ke liye charecter ke liye
			for(int j=i;j<str.length();j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}
