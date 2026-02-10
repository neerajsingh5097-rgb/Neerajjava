package Array;

import java.util.Scanner;

//Q.2 WAP(write a program ) to ADD all elemnts  SDA size 8

public class Q2 {

	public static void main(String[] args) {
      /*
		int element[]= {1,2,3,4};
		int sum =0;
		
//		print the sum of given number
		
		for(int i=0;i<element.length;i++) {
			sum+= element[i]; //sum =sum+element[i];  
		}
		System.out.println(sum);
		
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size =sc.nextInt();
		
		int [] arr=new int[size];
		
		int sum = 0;
		
		System.out.println("enter the element of array");
//		loop user se data lene ke liye
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
//		loop sum print kene ke liye
		for(int i=0; i<size; i++) {
         sum+=arr[i];
		}
		
		System.out.println("Sum of array number " +sum);
	}

}
