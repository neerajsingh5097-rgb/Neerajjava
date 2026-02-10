package String;

public class Q12 {

//	print this pattern using string in java
//	A
//	BB
//	CCC
//	DDDD
//	EEEEE
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
//		outer lop for row
		for(int i=1,p='A';i<=n;i++,p++) {
//			inner loop for charecter
			for(int j=1;j<=i;j++) {
				System.out.print((char)p);  // isme char nhi lGaya to a ki posion print ho jayegi 65
			}
			System.out.println();
		}
	}

}
