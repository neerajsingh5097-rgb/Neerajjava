package Array;

import java.util.Scanner;

//Q.15 WAP to change the search elements size 8

public class Q15 {

	public static void main(String[] args) {
		
		/*

		int arr[]= {1,2,3,4,5,6};
		
//		all elements display on screen
		System.out.println("displays elements on screen");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		
//		let change 3 ko 10 se
		System.out.println();
		
		System.out.println("3 ko 10 change krne pr array ");
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==3) {
				arr[i]=10;
				System.out.print(arr[i]+" ");
			} else {

				System.out.print(arr[i]+" ");
			}
		}
		
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		
		System.out.println("enter the elements of array :-");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the element of to change number ");
		int change=sc.nextInt();
		
		System.out.println("enter the element change with number:-");
		int ele=sc.nextInt();
		
	 System.out.println("print the new change array:-");
	 for(int i=0;i<size;i++) {
		 if (arr[i]==change) {
			arr[i]=ele;
			System.out.print(arr[i] + " ");
		} else {

			System.out.print(arr[i] + " ");
		}
	 }
	}

}
