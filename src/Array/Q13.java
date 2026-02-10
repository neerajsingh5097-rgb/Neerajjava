package Array;

import java.util.Scanner;

//Q.13 WAP to replace even by 0 and odd by 1 elements in SDA size 5
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int arr[] = {1,2,3,4,5,6};
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("replace even by 0 and odd by 1 elements");
		
		for(int i=0; i<arr.length;i++) {
			if (arr[i]%2==0) {
				arr[i]=0;
				System.out.println(arr[i]);
			} else {
				arr[i]=1;
				System.out.println(arr[i]);
			}
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
		
		System.out.println(" replace even by 0 and odd by 1 elements ");
		
//		loop replace even by 0 and odd by 1 ke liye
		for(int i =0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				arr[i]=0;
				System.out.println(arr[i]);
			} else {
				arr[i]=1;
				System.out.println(arr[i]);			}
		}
	}

}
