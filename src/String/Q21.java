package String;
//print this pattern
//    A
//   ABC
//  ABCDE
// ABCDEFG
//ABCDEFGHI

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
//		outer loop for row
		for(int i=1;i<=n;i++) {
//			loop for space
			for(int sp=1;sp<=n-i;sp++) {
				System.out.print(" ");
			}
			
		
//			innner loop for char 
			for(int j=1,p='A';j<=2*i-1;j++,p++) {
			 System.out.print( (char)p);
			}
			System.out.println();
		
	   }
	}

}
