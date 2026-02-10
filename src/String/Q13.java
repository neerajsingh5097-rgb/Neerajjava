package String;

public class Q13 {
	
//	print this pattern using String in java 
//	AAAAA
//	 BBBB
//	  CCC
//	   DD
//	    E

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
//		outer lop for row
		for(int i=1,p='A';i<=n;i++,p++) {
//			inner loop for charecter
			for(int j=1;j<i;j++) {
				System.out.print(" ");  // isme char nhi lGaya to a ki posion print ho jayegi 65
			}
			
			for(int k=n;k>=i;k--) {
				System.out.print((char)p);
			}
			System.out.println();
		}
		
		
		System.out.println("print alg pettern");
//		print this pattern using String in java 
//		     A
//		    BB
//		   CCC
//		  DDDD
//		 EEEEE

		
//		outer lop for row
		for(int i=n,p='A';i>=1;i--,p++) {
//			inner loop for charecter
			for(int j=1;j<i;j++) {
				System.out.print(" ");  // isme char nhi lGaya to a ki posion print ho jayegi 65
			}
			
			for(int k=i;k<=n;k++) {
				System.out.print((char)p);
			}
			System.out.println();
		}
		

	}

}
