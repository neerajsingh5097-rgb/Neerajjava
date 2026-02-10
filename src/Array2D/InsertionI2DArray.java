package Array2D;

import java.util.Scanner;

public class InsertionI2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int arr[][]= {{10,20,40},
				       {50,60,70},
				       {70,80,90}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
		int row =1;
		System.out.println("enter the posion of row " + row);
		int col=1;
		System.out.println("enter the posion of col " + col);

		int value = 99;
		System.out.println("enter the number to insertion in 2d array " + value);

		int newArr[][]=new int [arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if (i==row && j==col) {
					newArr[i][j]=value;
				} else {

					newArr[i][j]=arr[i][j];
				}
			}
		}
		
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				System.out.print(newArr[i][j]+" ");
			}
			System.out.println();
		}
*/
  
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row of array");
		int row = sc.nextInt();
		
		System.out.println("enter the col of array");
		int col = sc.nextInt();
		
		int arr[][] = new int [row][col];
		
		System.out.println("enter the 2d array elements");
		
//		loop for row ke liye
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		  System.out.println();
		}
		
		
		System.out.println("print the metrix ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
		  System.out.println();
		}
		
		System.out.println("enter the position of row1 ");
		int row1= sc.nextInt();
		
		System.out.println("enter the positon of col1");
		int col1=sc.nextInt();
		
//		create a new array
		int[][] newArr= new int [arr.length][arr[0].length];
		
		System.out.println("enter the value ");
		int value=sc.nextInt();
		
//		loop value ko change krne ke liye 
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if (i==row1 && j==col1) {
					newArr[i][j]=value;
				} else {

					newArr[i][j]=arr[i][j];
				}
			}
		}
		
		System.out.println(" print the new 2d matrix");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(newArr[i][j] + " ");
			}
		  System.out.println();
		}
	}

}
