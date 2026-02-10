package Array;

import java.util.Scanner;

//Q.3 WAP to MULTIPLY all element of SDA size 12
public class Q3 {

	public static void main(String[] args) {
 /*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size =sc.nextInt();
		
		int [] arr=new int[size];
		
		int mul = 1;
		
		System.out.println("enter the element of array");
//		loop user se data lene ke liye
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
//		loop sum print kene ke liye
		for(int i=0; i<size; i++) {
         mul*=arr[i];
		}
		
		System.out.println("Multiply of array number " + mul);
		
		*/
		
		int element[]= {1,2,3,4};
		int mul =1;
		
//		print the sum of given number
		
		for(int i=0;i<element.length;i++) {
			mul*= element[i]; //mul =mul*element[i];  
		}
		System.out.println("Multiply of array number " +mul);
		
	}

}
