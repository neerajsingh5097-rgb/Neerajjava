package Array2D;

import java.util.Scanner;

//Q.2 WAP(write a program )  all elemnts print
//ab ham method ka use krege 
public class Q3 {

	public static void InputAnArray(int arr[][] ){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 2d array elements ");
		
//		yah loop row kw liye he
		for(int i = 0;i<arr.length;i++) {
//			yah loop colum k liye he 
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print("arr[" + i + "][" + j + "]"+ " ");
				arr[i][j]= sc.nextInt();
			}
			System.out.println();
		}
	}
	
	public static void printArray(int arr[][]) {
		System.out.println("print Array");
//		yah loop row kw liye he
		for(int i = 0;i<arr.length;i++) {
//			yah loop colum k liye he 
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of row");
		int row = sc.nextInt();
		System.out.println("enter the size of colum");
		int col = sc.nextInt();
		
		int arr[][] = new int [row][col];
		
		InputAnArray(arr);
		
		printArray(arr);
		
	}

}
