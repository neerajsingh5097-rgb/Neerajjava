package Array;

import java.util.Scanner;

//WAP to displays all elements odd position of SDA size 8

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size =sc.nextInt();
		
		int [] arr=new int[size];
	
		
		System.out.println("enter the element of array");
//		loop user se data lene ke liye
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
//		loop sum print kene ke liye
		for(int i=0; i<size; i++) {
			
			if (arr[i]%2!=0) {
				System.out.print(" " + arr[i]);

			}

		}
		
	     /*
			int [] arr= {1,2,3};
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2!=0) {
					System.out.println(" " + arr[i]);
				}
				
			}
			*/
	}

}
