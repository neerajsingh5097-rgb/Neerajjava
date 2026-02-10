package Array;

import java.util.Scanner;

public class InsertionInArray {

	public static void main(String[] args) {

/*		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:- ");
		
		int size = sc.nextInt();
		
		int arr[]=new int [size];
		
		System.out.println("Enter the elements os array");
		
		for(int ;i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int arrNew[]= new int[size+1];
		
		System.out.println("ENter the positon of element:-");
		// insert position
		int pos = sc.nextInt();
		
		System.out.println("Enter the elemts in array:- ");
		int ele =sc.nextInt();
		

		arrNew[pos]=ele;

		
//		position se phale vale elements copy krte he old array me new array me
		
		for(int i=0;i<pos;i++) {
			arrNew[i]=arr[i];
		}
		
//		inser element in array
		arrNew[pos]=ele;
		
//		positon se bad vale elements copy krte he old array me se new array me
		
		for
		(int i=pos;i<size;i++) {
			arrNew[i+1]=arr[i];
		}
		
		
//		ab new array ko print krna he 
		
		for(int i=0;i<arrNew.length;i++) {
			System.out.println(arrNew[i]);
		}
		
		*/
		
		int arr[]= {10,20,40,50};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the posion of element");
		
		int pos =2;
		System.out.println(pos);
		
		System.out.println("enter the element ");
		
		int ele=30;
		System.out.println(ele);
		
//		Creat a new array 
		
		int newArr[]=new int[arr.length+1];
		
//		copy elements before posiotn
		
		for(int i=0;i<pos;i++) {
			newArr[i]=arr[i];
		}
		
//		inser element
		newArr[pos]=ele;
	
//		posion ke bad bale elements new array me copy krne me 
		
		for(int i=pos;i<arr.length;i++) {
			newArr[i+1]=arr[i];
		}
		
//		print the new array
		
		System.out.println("Print new Array");
		
		for(int x:newArr) {
			System.out.println(x);
		}
		
	}

}
