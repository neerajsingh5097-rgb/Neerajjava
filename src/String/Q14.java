package String;
//prin this pattern using string in java
//    A
//   BBB
//  CCCCC
// DDDDDDD
//EEEEEEEEE

//prin this pattern using string in java

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
//		outer lop for row
		for(int i=1,p='A';i<=n;i++,p++) {
//			inner loop for space
			for(int j=i;j<n;j++) {
				System.out.print(" ");  
			}
			
//			prin for char
			for(int k=1;k<=2*i-1;k++) {
				System.out.print((char)p);
			}
			System.out.println();
		}
		
		System.out.println("2nd pattern");
//		outer lop for row
		for(int i=n,p='A';i>=1;i--,p++) {
//			inner loop for space
			for(int j=i;j<n;j++) {
				System.out.print(" ");  
			}
//			prin for char
			for(int k=2*i-1;k>=1;k--) {
				System.out.print((char)p);
			}
			System.out.println();
		}
	}

}
