package String;

public class Q11 {
	
//	prin this pattern using string in java
//	A
//	AA
//	AAA
//	AAAA
//	AAAAA

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n=5;
//		outer lop for row
		for(int i=1;i<=n;i++) {
//			inner loop for charecter
			for(int j=1;j<=i;j++) {
				System.out.print("A");
			}
			System.out.println();
		}
		
	}

}
