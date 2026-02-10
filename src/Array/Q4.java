package Array;

import java.util.Scanner;

//WAP to displays square of all elements in SDA size 8
public class Q4 {

	public static void main(String[] args) {
       /*
		int arr[] = {1,2,3};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i]*arr[i]);
		}
		
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size =sc.nextInt();
		
		int [] arr=new int[size];
	
		
		System.out.println("enter the element of array");
//		loop user se data lene ke liye
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("displays square of all elements");
//		loop square  print kene ke liye
		for(int i=0; i<size; i++) {
			System.out.print(" " + arr[i]*arr[i]);

		}
		
	}

}
