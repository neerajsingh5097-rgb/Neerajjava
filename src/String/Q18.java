package String;
//print this pattern
//    A
//   BBB
//  CCCCC
// DDDDDDD
//EEEEEEEEE
// FFFFFFF
//  GGGGG
//   HHH
//    I
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
//		upper side loop
//		outer loop for row
		for(int i=1,p='A';i<=n;i++,p++) {
//			loop for space
			for(int sp=i;sp<n;sp++) {
				System.out.print(" ");
			}
			
		
//			innner loop for char 
			for(int j=1;j<=2*i-1;j++) {
			 System.out.print((char)p);
			}
			System.out.println();
		
	   }
		
//		lower loop 
 
//		upper side loop
//		outer loop for row
		for(int i=n-1,p='F';i>=1;i--,p++) {
//			loop for space
			for(int sp=i;sp<n;sp++) {
				System.out.print(" ");
			}
			
		
//			innner loop for char 
			for(int j=1;j<=2*i-1;j++) {
			 System.out.print((char)p);
			}
			System.out.println();
		
	   }
   }
}
