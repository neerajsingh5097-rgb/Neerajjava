package Array;

import java.util.Scanner;

//Q.11 WAP to find | count even and odd elements in SDA size 8

public class Q11 {

	public static void main(String[] args) {
       
    int arr[] = {1,2,3,4,5,6,7};
    
    int countEven = 0;
    int countOdd = 0;
    
    for(int i =0;i<arr.length;i++) {
    	if (arr[i]%2==0) {
			  countEven = countEven+1; // countEven++;
		} else {
           countOdd++;
		}
    }
    
    System.out.println("Count of all even elements;- " + countEven);
    System.out.println("Count of all Odd elements;- " + countOdd);

/*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array;=");
		int size = sc.nextInt();
		int [] arr = new int [size];
		
//		loop for user se elements lene ke liye 
		System.out.println("Enter the elements of arry");
		for(int i =0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("find | count even and odd elements in SDA");
		
//		loop for count ke liye even or odd
		int countEven =0;
		int countOdd =0;
		for(int i =0; i<size;i++) {
              
			if (arr[i]%2==0) {
				countEven++;
			} else {
              countOdd++;
			}
		}
		
		System.out.println("Count of all even elements;- " + countEven);
	    System.out.println("Count of all Odd elements;- " + countOdd);

		*/
	}

}
