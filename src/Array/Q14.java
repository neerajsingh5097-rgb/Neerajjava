package Array;

import java.util.Scanner;

//Q.14 replace an elements in SDA  0 size 5

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
     int arr[] = {1,2,3,4,5,6};
//		print the array elements 
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("replace an elements in SDA  0");
//		loop replace an elements in SDA 0
		for(int i=0; i<arr.length;i++) {
			arr[i]=0;
			System.out.println(arr[i]);
		}
		
		*/
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size ");
		
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		
//		loop user se input lene ke liye
		System.out.println("enter the elements of array;");
		
		for(int i= 0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("replace an elements in SDA  0");
		
//		loop replace an elements in SDA 0
		for(int i =0; i<arr.length; i++) {
			arr[i]=0;
			System.out.println(arr[i]);
		}
		
	}

}
