package Array2D;

import java.util.Scanner;

//Q.3 WAP to MULTIPLY all element of SDA size 12
public class Q5 {

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
	
	public static void printMultiply(int arr[][]) {
		int mul =1;
		System.out.println("print multiply");
//		yah loop row kw liye he
		for(int i = 0;i<arr.length;i++) {
//			yah loop colum k liye he 
			for(int j = 0;j<arr[i].length;j++) {
               mul = mul * arr[i][j];
			}
		}
		System.out.println(mul);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method st
	
		Scanner sc = new Scanner(System.in);
		

		System.out.println("enter the size of row");
		int row = sc.nextInt();
		System.out.println("enter the size of colum");
		int col = sc.nextInt();
		
		int arr[][] = new int [row][col];
		
		InputAnArray(arr);
		
		printArray(arr);
		
		printMultiply(arr);
	}

}
