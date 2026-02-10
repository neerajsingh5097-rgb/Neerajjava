package String;

public class Q8 {
	
//	prin this pattern usin String in java
//	NEERAJ
//	NEERA          r=5 = length
//	NEER
//	NEE
//	NE
//	N

	public static void main(String[] args) {

		//print this pattern using String in java
		
		String str ="NEEARJ";
		
		for(int i=str.length();i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
//		2nd method
		for(int i=str.length();i>=1;i--) {
			System.out.println(str.substring(0, i));
		}
	}

}
