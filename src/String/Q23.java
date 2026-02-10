package String;
//print this pattern
//EDCBA
// EDCB
//  EDC
//   ED
//    E

public class Q23 {

	public static void main(String[] args) {

		int n=5;
//		outer lop for row
		for(int i=1;i<=n;i++) {
//			inner loop for charecter
			for(int j=1;j<i;j++) {
				System.out.print(" ");  // isme char nhi lGaya to a ki posion print ho jayegi 65
			}
			
			for(int k=n,p='E';k>=i;k--) {
				System.out.print((char)p--);
			}
			System.out.println();
		}
		
	}

}
