package String;

//print this pattern
//A
//BB
//AAA
//BBBB
//AAAAA

public class Q17 {

	public static void main(String[] args) {

		int n=5;
//		outer loop for row
		for(int i=1;i<=n;i++) {
//			innner loop for char 
			for(int j=1;j<=i;j++) {
				if (i%2==0) {
					System.out.print("B");
				} else {

					System.out.print("A");
				}
			}
			System.out.println();
		}
	}

}
