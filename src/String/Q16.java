package String;
//prin this pattern
//A
//CC
//EEE
//GGGG
//IIIII
public class Q16 {

	public static void main(String[] args) {


		int n=5;
//		outer loop for row
		for(int i=1,p='A';i<=n;i++,p+=2) {
//			innner loop for char 
			for(int j=1;j<=i;j++) {
				System.out.print((char)p);
			}
			System.out.println();
		}
	}

}
