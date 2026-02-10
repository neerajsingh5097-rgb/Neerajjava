package Array;

import java.util.Scanner;

//Q.8 WAP replace all even elements by their square of SDA size 8

public class Q8 {

	public static void main(String[] args) {

		/*
	int []num= {1,5,3,2,8};
		
//		print the array elements
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("replace all even elements by their square of SDA ");
		
//		print the square of array elements
		for(int i =0;i<num.length;i++) {

			if (num[i]%2==0) {
				System.out.println(num[i]*num[i]);
			} else {
				 System.out.println(num[i]);

			}
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
		
		System.out.println("replace all even elemnt by their square of SDA ");
		
//		loop for array elements square print krne ke liye 
		for(int i=0; i<arr.length;i++) {
        if (arr[i]%2==0) {
			System.out.println(arr[i]*arr[i]);

		} else {
			System.out.println(arr[i]);

		}
		}
		
		
	}

}
