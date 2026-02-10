package String;
//print this pattern
//EDCBA
// DCBA
//  CBA
//   BA
//    A

public class Q24 {

	public static void main(String[] args) {

		int n=5;
//		outer lop for row
		for(int i=1,p='E';i<=n;i++,p--) {
//			inner loop for charecter
			for(int j=1;j<i;j++) {
				System.out.print(" "); 
			}
			int m=p;
			for(int k=n;k>=i;k--) {
				System.out.print((char)m--);
			}
			System.out.println();
		}
	}

}
