package Array;

import java.util.Scanner;

public class DeletionInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		
		int size= sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("enter the elements of array:-");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
//		creat a new array
		int newArr[]= new int[size-1];
		System.out.println("Enter the posion to delete in array:-");
		int pos = sc.nextInt();
		
		System.out.println("Enter the element to delete in array:-");
		int ele = sc.nextInt(); // bese hame element ki koi need nhi he becouse positoon se kam hi gya he
		
//		position se phle ke elements copy krte he new array me
		
		for(int i=0;i<pos;i++) {
			newArr[i]=arr[i];
		}
		
//		position se bad  ke elements copy krte he new array me

		for(int i=pos+1;i<arr.length;i++) {
			newArr[i-1]=arr[i];
		}
		
//		prin the new array
		
	 System.out.println("prin the new array:=");
	 
	 for(int x:newArr) {
		 System.out.println(x);
	 }
	}

}
