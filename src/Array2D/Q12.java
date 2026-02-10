package Array2D;
import java.util.Scanner;

//Q.11 WAP to find | count even and odd elements in 2D array

public class Q12 {
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
	
	public static void printReplace(int arr[][]) {
		
		System.out.println("WAP to find | count even and odd elements in 2D array");
		int evenCount=0;
		int oddCount=0;
//		yah loop row kw liye he
		for(int i = 0;i<arr.length;i++) {
//			yah loop colum k liye he 
			for(int j = 0;j<arr[i].length;j++) {
               if(arr[i][j]%2==0) {  // i =row ki postion and j = col ki posion 
            	 evenCount++;
               }else  {
            	   oddCount++;
               }
			}
			
		}
		
		System.out.println("count of even all number " + evenCount);
		System.out.println("count of all odd number in 2d array" + oddCount);
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
		
		printReplace(arr);
	}

}
