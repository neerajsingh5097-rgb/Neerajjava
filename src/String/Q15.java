package String;

//prin this pattern
//E
//DD
//CCC
//BBBB
//AAAAA
public class Q15 {

	public static void main(String[] args) {

		int n = 5;
		
//		outer loop for row
		for(int i=1,p='E';i<=n;i++,p--) {
//			innner loop for char 
			for(int j=1;j<=i;j++) {
				System.out.print((char)p);
			}
			System.out.println();
		}
	}

}
