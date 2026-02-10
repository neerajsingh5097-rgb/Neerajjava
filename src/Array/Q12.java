package Array;

import java.util.Scanner;

//Q.12 WAP to add all even and odd elements of SAD size of 8

public class Q12 {

	public static void main(String[] args) {
       /*
		int arr[]= {1,2,3,4,5};
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		int evenSum=0;
		int oddSum =0;
		for(int i =0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				evenSum=evenSum+arr[i];
			} else {
               oddSum = oddSum+arr[i];
			}
		}
		
		System.out.println("Sum of the all even elements " + evenSum);
		System.out.println("Sum of the all odd elements " + oddSum);
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
		
		System.out.println("add all even and odd elements of SAD");
		
		int evenSum =0;
		int oddSum = 0;
		
//		loop sum of even and sum of  odd ke liye
		for(int i =0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				evenSum += arr[i]; 
			} else {
                oddSum+=arr[i];
			}
		}
		System.out.println("Sum of the all even elements " + evenSum);
		System.out.println("Sum of the all odd elements " + oddSum);
		
	}

}
