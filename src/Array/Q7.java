package Array;

import java.util.Scanner;

//Q.7 WAP replace all element by their square of SDA size 8
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int []num= {1,5,3,};
		
//		print the array elements
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		System.out.println();
		
//		print the square of array elements
		for(int i =0;i<num.length;i++) {
		 System.out.println(num[i]*num[i]);
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
		
		System.out.println("replace all elemnt by their square ");
		
//		loop for array elements square print krne ke liye 
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]*arr[i]);
		}
	}

}
