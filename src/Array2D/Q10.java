package Array2D;
import java.util.Scanner;

//Q.8 WAP replace all odd elements by their cube of 2D array
public class Q10 {
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
	
	public static void printreplaceByAllOdd(int arr[][]) {
		
		System.out.println("replace all Odd elements by their cube of 2D array");
//		yah loop row kw liye he
		for(int i = 0;i<arr.length;i++) {
//			yah loop colum k liye he 
			for(int j = 0;j<arr[i].length;j++) {
               if(arr[i][j]%2!=0) {  // i =row ki postion and j = col ki posion 
            	   arr[i][j]=arr[i][j]*arr[i][j]*arr[i][j];
            	   System.out.print(arr[i][j]+" ");
               }else {
            	   System.out.print(arr[i][j] +" ");
               }
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of row");
		int row = sc.nextInt();
		System.out.println("enter the size of colum");
		int col = sc.nextInt();
		
		int arr[][] = new int [row][col];
		
		InputAnArray(arr);
		
		printArray(arr);
		
		printreplaceByAllOdd(arr);
	}

}
