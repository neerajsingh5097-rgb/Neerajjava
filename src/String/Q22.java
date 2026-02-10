package String;
//print this pattern
//E 
//E D 
//E D C 
//E D C B 
//E D C B A 

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
//		outer loop for row
		for(int i=1;i<=n;i++) {
//			inner loop for char
			for(int j=1,p='E';j<=i;j++,p--) {
				System.out.print((char)p + " ");
			}
			System.out.println();
		}
	}

}
