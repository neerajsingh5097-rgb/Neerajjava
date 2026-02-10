package String;

//prin this pattern
//    A
//   ABA
//  ABCBA
// ABCDCBA
//ABCDEDCBA

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;

//		outer loop for row
		for(int i=1;i<=n;i++) {
//			loop for space
			for(int sp=i;sp<n;sp++) {
				System.out.print(" ");
			}
			
		
//			innner loop for char
//			1 past part
			int p='A';
			for(int j=1;j<i;j++) {
			 System.out.print((char)p++);
			}
//			2nd part

			for(int j=1;j<=i;j++) {
				 System.out.print((char)p--);
				}
			System.out.println();
		
	   }
	}

}
