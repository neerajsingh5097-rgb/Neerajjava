package String;
//print this pattern
//A 
//A B 
//A B C 
//A B C D 
//A B C D E 

public class Q20 {

	public static void main(String[] args) {

		
		int n=5;
		
//		outer loop for row
		for(int i=1;i<=n;i++) {
//			inner loop for char
			for(int j=1,p='A';j<=i;j++,p++) {
				System.out.print((char)p + " ");
			}
			System.out.println();
		}
	}

}
