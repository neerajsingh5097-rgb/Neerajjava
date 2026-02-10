package Array2D;

import java.util.Scanner;

//jaha program jgeed array ka he 



public class Q2 {
	
	public static void InputInArray(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr[" + i + "]["+j +"]" + " ");
				arr[i][j]=sc.nextInt();
				}
			
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		


//		int arr[][]= { {1,2,3,4},
//				       {5,6},
//				       {7,8,9}};
//		
//		int sum=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			
//			System.out.println();
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//              sum+=arr[i][j];		
//              }
//			
//		}
//		
//		System.out.println(sum);
//	}
      int arr [][] = new int[3][];		
		
		arr[0]=new int[3];
		arr[1] = new int[4];
		arr[2]= new int[2];
		

		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);

		InputInArray(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}

	}

}
